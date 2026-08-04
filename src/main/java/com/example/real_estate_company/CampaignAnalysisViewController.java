package com.example.real_estate_company;

import Tanha.Advertisement;
import Tanha.CampaignAnalysis;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class CampaignAnalysisViewController
{
    @javafx.fxml.FXML
    private TableColumn<CampaignAnalysis,String> statusTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> campaignCB;
    @javafx.fxml.FXML
    private TableColumn <CampaignAnalysis,String>conversionRateTableColumn;
    @javafx.fxml.FXML
    private TableColumn <CampaignAnalysis,String>campaignNameTableColumn;
    @javafx.fxml.FXML
    private Label campaignAnalysisLabel;
    @javafx.fxml.FXML
    private DatePicker analysisPeriodDP;
    @javafx.fxml.FXML
    private TableColumn<CampaignAnalysis,String> campaignIdTableColumn;
    @javafx.fxml.FXML
    private TextArea recommendationsTA;
    @javafx.fxml.FXML
    private TableView<CampaignAnalysis> campaignAnalysisTableView;
    private final ArrayList<CampaignAnalysis> campaignAnalysisList= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        campaignCB.getItems().addAll("Summer Sale", "Apartment Expo", "Facebook Campaign");

        campaignIdTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("campaignId"));

        campaignNameTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("campaignName"));

        conversionRateTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("conversionRate"));

        statusTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("status"));

        campaignAnalysisTableView.setItems((ObservableList<CampaignAnalysis>) campaignAnalysisList);
    }

    @javafx.fxml.FXML
    public void analyzeButtonOA(ActionEvent actionEvent) {
        if (campaignCB.getValue() == null || analysisPeriodDP.getValue() == null) {
            campaignAnalysisLabel.setText("Select campaign and analysis date.");
            return;
        }

        String campaignId = "CA" + (campaignAnalysisList.size() + 1);

        String campaignName = campaignCB.getValue();

        float conversionRate = (float) (Math.random() * 40 + 60);

        String status;

        if (conversionRate >= 80) {
            status = "Excellent";
        } else if (conversionRate >= 70) {
            status = "Good";
        } else {
            status = "Poor";
        }

        CampaignAnalysis campaign = new CampaignAnalysis(
                campaignId,
                campaignName,
                conversionRate,
                status
        );

        campaignAnalysisList.add(campaign);

        campaignAnalysisTableView.setItems((ObservableList<CampaignAnalysis>) campaignAnalysisList);

        recommendationsTA.clear();

        if (status.equals("Excellent")) {

            recommendationsTA.setText("Campaign is performing very well.\nMaintain the current strategy.");

        } else if (status.equals("Good")) {
            recommendationsTA.setText("Campaign performance is satisfactory.\nIncrease promotion to improve conversion.");

        } else {

            recommendationsTA.setText("Campaign needs improvement.\nReview marketing strategy and target audience.");

        }

        campaignAnalysisLabel.setText("Campaign analysis completed.");

        campaignCB.setValue(null);
        analysisPeriodDP.setValue(null);
    }

}