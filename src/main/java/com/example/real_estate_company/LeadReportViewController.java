package com.example.real_estate_company;

import Tanha.LeadReport;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class LeadReportViewController
{
    @javafx.fxml.FXML
    private TableColumn<LeadReport,Float> conversionRateTC;
    @javafx.fxml.FXML
    private TableColumn<LeadReport,Integer> totalConversionsTC;
    @javafx.fxml.FXML
    private TableColumn<LeadReport,String> reportIdTC;
    @javafx.fxml.FXML
    private TextField conversionRateTF;
    @javafx.fxml.FXML
    private TextField conversionsTF;
    @javafx.fxml.FXML
    private TableColumn <LeadReport,String>reportingPeriodTC;
    @javafx.fxml.FXML
    private TableColumn<LeadReport,String> generatedByTC;
    @javafx.fxml.FXML
    private TextField totalLeadsTF;
    @javafx.fxml.FXML
    private DatePicker endDateDP;
    @javafx.fxml.FXML
    private TableView<LeadReport> leadConversionReportTableView;
    @javafx.fxml.FXML
    private TableColumn<LeadReport,Integer> totalLeadsTC;
    @javafx.fxml.FXML
    private Label leadConversionReportLabel;
    @javafx.fxml.FXML
    private DatePicker startDateDP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateReportsButtonOA(ActionEvent actionEvent) {
    }
}