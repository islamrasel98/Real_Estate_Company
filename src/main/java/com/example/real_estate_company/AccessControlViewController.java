package com.example.real_estate_company;

import Tanha.AccessControl;
import Tanha.Advertisement;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class AccessControlViewController
{
    @javafx.fxml.FXML
    private Label accessControllabel;
    @javafx.fxml.FXML
    private TableColumn<AccessControl,String> securityZoneTC;
    @javafx.fxml.FXML
    private ComboBox<String> securityZoneCB;
    @javafx.fxml.FXML
    private TableColumn <AccessControl,String> deciveStatusTC;
    @javafx.fxml.FXML
    private TableColumn<AccessControl,String>  accessPermissionTC;
    @javafx.fxml.FXML
    private ComboBox<String> PermissionCB;
    @javafx.fxml.FXML
    private TableColumn<AccessControl,String>  deviceNameTC;
    @javafx.fxml.FXML
    private ComboBox<String> deviceCB;
    @javafx.fxml.FXML
    private TableColumn <AccessControl,String> deviceIdTC;
    @javafx.fxml.FXML
    private TableView<AccessControl> accessControlTableView;
    ArrayList<AccessControl> accessControlList = new ArrayList<>();
    @javafx.fxml.FXML
    public void initialize() {
        deviceCB.getItems().addAll("Main Gate Scanner", "Parking Gate", "Lobby Door", "Server Room Door");

        securityZoneCB.getItems().addAll("Zone A", "Zone B", "Zone C", "Restricted Area");

        PermissionCB.getItems().addAll("Read", "Write", "Full Access");
        deviceIdTC.setCellValueFactory(new PropertyValueFactory<>("deviceId"));
        deviceNameTC.setCellValueFactory(new PropertyValueFactory<>("deviceName"));
        securityZoneTC.setCellValueFactory(new PropertyValueFactory<>("securityZone"));
        accessPermissionTC.setCellValueFactory(new PropertyValueFactory<>("permission"));
        deciveStatusTC.setCellValueFactory(new PropertyValueFactory<>("deviceStatus"));

        accessControlTableView.setItems((ObservableList<AccessControl>) accessControlList);
    }

    @javafx.fxml.FXML
    public void deactivateButtonOA(ActionEvent actionEvent) {
        AccessControl device =
                accessControlTableView.getSelectionModel().getSelectedItem();

        if(device == null){accessControllabel.setText("Select a device first.");
            return;
        }

        device.setDeviceStatus("Inactive");

        accessControlTableView.refresh();

        accessControllabel.setText("Device Deactivated.");
    }

    @javafx.fxml.FXML
    public void activateButtonOA(ActionEvent actionEvent) {
        AccessControl device =
                accessControlTableView.getSelectionModel().getSelectedItem();
        if(device == null){accessControllabel.setText("Select a device first.");
            return;
        }
        device.setDeviceStatus("Active");
        accessControlTableView.refresh();
        accessControllabel.setText("Device Activated.");
    }

    @javafx.fxml.FXML
    public void saveButtonOA(ActionEvent actionEvent) {
        String deviceId = "D" + (accessControlList.size() + 1);

        AccessControl accessControl = new AccessControl(

                deviceId,
                deviceCB.getValue(),
                securityZoneCB.getValue(),
                PermissionCB.getValue(),
                "Active"

        );

        accessControlList.add(accessControl);

        accessControllabel.setText("Access Control Saved.");

        deviceCB.setValue(null);
        securityZoneCB.setValue(null);
        PermissionCB.setValue(null);
    }
}