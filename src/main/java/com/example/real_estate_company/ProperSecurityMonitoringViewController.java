package com.example.real_estate_company;

import Tanha.PropertySecurity;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ProperSecurityMonitoringViewController
{
    @javafx.fxml.FXML
    private TableColumn<PropertySecurity,String> incidentStatusTC;
    @javafx.fxml.FXML
    private TableView<PropertySecurity> propertySecurityMonitoringTableView;
    @javafx.fxml.FXML
    private TableColumn <PropertySecurity,String>propertyNameTC;
    @javafx.fxml.FXML
    private TableColumn <PropertySecurity,String>alarmStatusTC;
    @javafx.fxml.FXML
    private TableColumn<PropertySecurity,String> cctvStatusTC;
    @javafx.fxml.FXML
    private Label propertySecurityMonitoringLabel;
    @javafx.fxml.FXML
    private TextArea incidentAlertTA;
    @javafx.fxml.FXML
    private Button saveButtonOA;
    @javafx.fxml.FXML
    private ComboBox<String> alarmStatusCB;
    @javafx.fxml.FXML
    private ComboBox<String> cctvStatusCB;

    @javafx.fxml.FXML
    public void initialize() {
        alarmStatusCB.getItems().addAll("Active","Inactive");
        cctvStatusCB.getItems().addAll( "Working", "Offline","Maintenance");
    }

    @javafx.fxml.FXML
    public void refreshButtonOA(ActionEvent actionEvent) {
    }
}