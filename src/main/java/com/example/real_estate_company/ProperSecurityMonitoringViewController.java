package com.example.real_estate_company;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ProperSecurityMonitoringViewController
{
    @javafx.fxml.FXML
    private TableColumn sensorStatusTC;
    @javafx.fxml.FXML
    private TableColumn incidentStatusTC;
    @javafx.fxml.FXML
    private TextField sensorStatusTF;
    @javafx.fxml.FXML
    private TableView propertySecurityMonitoringTableView;
    @javafx.fxml.FXML
    private TableColumn propertyNameTC;
    @javafx.fxml.FXML
    private TableColumn alarmStatusTC;
    @javafx.fxml.FXML
    private ComboBox propertyCB;
    @javafx.fxml.FXML
    private TableColumn cctvStatusTC;
    @javafx.fxml.FXML
    private TextField cctvStatusTF;
    @javafx.fxml.FXML
    private Label propertySecurityMonitoringLabel;
    @javafx.fxml.FXML
    private TextField alarmStatusTF;
    @javafx.fxml.FXML
    private TextArea incidentAlertTA;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void refreshButtonOA(ActionEvent actionEvent) {
    }
}