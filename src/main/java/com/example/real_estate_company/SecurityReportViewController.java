package com.example.real_estate_company;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SecurityReportViewController
{
    @javafx.fxml.FXML
    private TableView securityReportsTableView;
    @javafx.fxml.FXML
    private DatePicker toDateDP;
    @javafx.fxml.FXML
    private DatePicker fromDateDP;
    @javafx.fxml.FXML
    private TableColumn generatedDateTC;
    @javafx.fxml.FXML
    private TableColumn reportyPeriodTC;
    @javafx.fxml.FXML
    private TableColumn totalIncidentsTC;
    @javafx.fxml.FXML
    private ComboBox reportTypeCB;
    @javafx.fxml.FXML
    private TableColumn reportTypeTC;
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