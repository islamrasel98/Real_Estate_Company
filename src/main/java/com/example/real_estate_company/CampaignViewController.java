package com.example.real_estate_company;

import Tanha.MarketingCampaign;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.*;

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
    public void initialize() {
        channelCB.getItems().addAll("Facebook", "Website", "Instagram","Email");
    }

    @javafx.fxml.FXML
    public void campaignDashBoardTableView(Event event) {
    }

    @Deprecated
    public void launchCampaignButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void saveButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SearchCampaignButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addCampaignButtonOA(ActionEvent actionEvent) {
    }
}