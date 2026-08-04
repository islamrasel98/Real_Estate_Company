package com.example.real_estate_company;

import Tanha.MarketingCampaign;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class CampaignViewController
{
    @javafx.fxml.FXML
    private Label campaignDashboardLabel;
    @javafx.fxml.FXML
    private TableColumn<MarketingCampaign,String>campaignNameTC;
    @javafx.fxml.FXML
    private TextField campaignNameTF;
    @javafx.fxml.FXML
    private DatePicker endDateDP;
    @javafx.fxml.FXML
    private TableColumn<MarketingCampaign,String> statusTC;
    @javafx.fxml.FXML
    private DatePicker startDateDP;
    @javafx.fxml.FXML
    private TableColumn<MarketingCampaign,String> campaignIdTC;
    @javafx.fxml.FXML
    private ComboBox<String>channelCB;
    @javafx.fxml.FXML
    private Label successorErrorLabel;
    @javafx.fxml.FXML
    private TableColumn<MarketingCampaign,String> startDateTC;
    @javafx.fxml.FXML
    private TableColumn<MarketingCampaign,Float>budgetTC;
    @javafx.fxml.FXML
    private TableView<MarketingCampaign> campaignDashBoardTableView;
    private ArrayList<MarketingCampaign>marketingCampaignList= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        channelCB.getItems().addAll("Facebook", "Website", "Instagram","Email");
        campaignIdTC.setCellValueFactory(new PropertyValueFactory<>("campaignId"));
        campaignNameTC.setCellValueFactory(new PropertyValueFactory<>("campaignName"));
        startDateTC.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        budgetTC.setCellValueFactory(new PropertyValueFactory<>("budget"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));

        campaignDashBoardTableView.setItems((ObservableList<MarketingCampaign>) marketingCampaignList);
    }
    @Deprecated
    public void launchCampaignButtonOA(ActionEvent actionEvent) {
        if(campaignNameTF.getText().isEmpty() ||
                startDateDP.getValue() == null ||
                endDateDP.getValue() == null ||
                channelCB.getValue() == null) {

            campaignDashboardLabel.setText("Please fill all campaign details.");
            return;
        }
        if(endDateDP.getValue().isBefore(startDateDP.getValue())) {
            campaignDashboardLabel.setText("End date must be after start date.");
            return;
        }
        float budget = 0;
        try {
            budget = 1000.0f;
        } catch(NumberFormatException e) {
            campaignDashboardLabel.setText("Please enter a valid budget amount.");
            return;
        }
        String campaignId = "CAMP" + (marketingCampaignList.size() + 1);
        String campaignName = campaignNameTF.getText();
        String startDate = startDateDP.getValue().toString();
        String endDate = endDateDP.getValue().toString();
        String channel = channelCB.getValue();
        String status;
        LocalDate today = LocalDate.now();
        if(today.isBefore(startDateDP.getValue())) {
            status = "Upcoming";
        } else if(today.isAfter(endDateDP.getValue())) {
            status = "Completed";
        } else {
            status = "Active";
        }
        MarketingCampaign campaign = new MarketingCampaign(campaignId, campaignName,budget,startDate,endDate, channel);
        marketingCampaignList.add(campaign);
        clearFields();
        campaignDashboardLabel.setText("Campaign launched successfully!");
    }

    @Deprecated
    public void saveButtonOA(ActionEvent actionEvent) {
        if(campaignNameTF.getText().isEmpty() ||
                startDateDP.getValue() == null ||
                channelCB.getValue() == null) {

            campaignDashboardLabel.setText("Please fill required fields.");
            return;
        }
        MarketingCampaign campaign = getCampaign();
        marketingCampaignList.add(campaign);
        clearFields();
        campaignDashboardLabel.setText("Campaign saved as draft.");
    }

    private MarketingCampaign getCampaign() {
        String campaignId = "CAMP" + (marketingCampaignList.size() + 1);
        String campaignName = campaignNameTF.getText();
        String startDate = startDateDP.getValue().toString();
        String endDate = endDateDP.getValue() != null ? endDateDP.getValue().toString() : "Not set";
        String channel = channelCB.getValue();
        float budget = 1000.0f;
        String status = "Draft";

        MarketingCampaign campaign = new MarketingCampaign(campaignId, campaignName,budget,startDate,endDate, channel);
        return campaign;
    }

    @javafx.fxml.FXML
    public void SearchCampaignButtonOA(ActionEvent actionEvent) {
        String searchText = campaignNameTF.getText().trim();

        if(searchText.isEmpty()) {
            campaignDashboardLabel.setText("Please enter a campaign name to search.");
            campaignDashBoardTableView.setItems((ObservableList<MarketingCampaign>) marketingCampaignList);
            return;
        }
        ObservableList<MarketingCampaign> searchResults = FXCollections.observableArrayList();

        for(MarketingCampaign campaign : marketingCampaignList) {
            if(campaign.getCampaignName().toLowerCase().contains(searchText.toLowerCase())) {
                searchResults.add(campaign);
            }
        }

        campaignDashBoardTableView.setItems(searchResults);

        if(searchResults.isEmpty()) {
            campaignDashboardLabel.setText("No campaigns found matching: " + searchText);
        } else {
            campaignDashboardLabel.setText("Found " + searchResults.size() + " campaign(s)");
        }
    }

    @javafx.fxml.FXML
    public void addCampaignButtonOA(ActionEvent actionEvent) {
        float budget;

        try {
            budget = Float.parseFloat(budgetTC.getText());
        } catch (NumberFormatException e) {
            successorErrorLabel.setText("Budget must be numeric.");
            return;
        }

        for (MarketingCampaign c : marketingCampaignList) {
            if (c.getCampaignName().equalsIgnoreCase(campaignNameTF.getText())) {
                successorErrorLabel.setText("Campaign name already exists.");
                return;
            }
        }

        MarketingCampaign campaign = new MarketingCampaign(

                campaignIdTC.getText(),
                campaignNameTF.getText(),
                budget,
                startDateDP.getValue().toString(),
                endDateDP.getValue().toString(),
                channelCB.getValue()

        );

        marketingCampaignList.add(campaign);

        successorErrorLabel.setText("Campaign added successfully.");

        clearFields();
    }

    public ArrayList<MarketingCampaign> getMarketingCampaignList() {
        return marketingCampaignList;
    }

    public void setMarketingCampaignList(ArrayList<MarketingCampaign> marketingCampaignList) {
        this.marketingCampaignList = marketingCampaignList;
    }
    private void clearFields() {

        campaignIdTC.getId().isEmpty();
        campaignNameTF.clear();
        budgetTC.getText().isBlank();

        startDateDP.setValue(null);
        endDateDP.setValue(null);

        channelCB.setValue(null);
        statusTC.setCellValueFactory(null);
    }
}