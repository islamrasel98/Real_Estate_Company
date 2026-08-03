package com.example.real_estate_company;

import Tanha.SecurityReport;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SecurityReportViewController
{
    @javafx.fxml.FXML
    private TableView<SecurityReport> securityReportsTableView;
    @javafx.fxml.FXML
    private DatePicker toDateDP;
    @javafx.fxml.FXML
    private DatePicker fromDateDP;
    @javafx.fxml.FXML
    private TableColumn<SecurityReport,String> generatedDateTC;
    @javafx.fxml.FXML
    private TableColumn<SecurityReport,String> reportyPeriodTC;
    @javafx.fxml.FXML
    private TableColumn<SecurityReport,String> totalIncidentsTC;
    @javafx.fxml.FXML
    private ComboBox<String>reportTypeCB;
    @javafx.fxml.FXML
    private TableColumn<SecurityReport,String> reportTypeTC;
    @javafx.fxml.FXML
    private Label securityReportsLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void downloadButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateReportButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void printButtonOA(ActionEvent actionEvent) {
    }
}