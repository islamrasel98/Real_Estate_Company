package com.example.real_estate_company;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AccessControlViewController
{
    @javafx.fxml.FXML
    private Label accessControllabel;
    @javafx.fxml.FXML
    private ComboBox securityZoneCB;
    @javafx.fxml.FXML
    private ComboBox PermissionCB;
    @javafx.fxml.FXML
    private ComboBox deviceCB;
    @javafx.fxml.FXML
    private TableView accessControlTableView;
    @javafx.fxml.FXML
    private TableColumn securityZoneTC;
    @javafx.fxml.FXML
    private TableColumn deciveStatusTC;
    @javafx.fxml.FXML
    private TableColumn accessPermissionTC;
    @javafx.fxml.FXML
    private TableColumn deviceNameTC;
    @javafx.fxml.FXML
    private TableColumn deviceIdTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void deactivateButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void activateButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveButtonOA(ActionEvent actionEvent) {
    }
}