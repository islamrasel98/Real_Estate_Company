package com.example.real_estate_company;

import Tanha.CampaignAnalysis;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

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
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void analyzeButtonOA(ActionEvent actionEvent) {
    }
}