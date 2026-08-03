package com.example.real_estate_company;

import Tanha.AccessControl;
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
    private ComboBox<String> securityZoneCB;
    @javafx.fxml.FXML
    private ComboBox<String> PermissionCB;
    @javafx.fxml.FXML
    private ComboBox<String>deviceCB;
    @javafx.fxml.FXML
    private TableView<AccessControl> accessControlTableView;
    @javafx.fxml.FXML
    private TableColumn<AccessControl,String> securityZoneTC;
    @javafx.fxml.FXML
    private TableColumn<AccessControl,String> deciveStatusTC;
    @javafx.fxml.FXML
    private TableColumn <AccessControl,String>accessPermissionTC;
    @javafx.fxml.FXML
    private TableColumn<AccessControl,String> deviceNameTC;
    @javafx.fxml.FXML
    private TableColumn<AccessControl,String> deviceIdTC;

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