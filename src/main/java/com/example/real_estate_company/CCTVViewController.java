package com.example.real_estate_company;

import Tanha.CCTVMonitoring;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class CCTVViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> cameraCB;
    @javafx.fxml.FXML
    private ComboBox<String> locationCB;
    @javafx.fxml.FXML
    private TableColumn<CCTVMonitoring,String> locationTC;
    @javafx.fxml.FXML
    private TableColumn <CCTVMonitoring,String> cameraIdTC;
    @javafx.fxml.FXML
    private TableColumn <CCTVMonitoring,String> lastCheckedTC;
    @javafx.fxml.FXML
    private Label cctvViewLabel;
    @javafx.fxml.FXML
    private TextField cameraIDTF;
    @javafx.fxml.FXML
    private TextArea alertsTA;
    @javafx.fxml.FXML
    private TableView<CCTVMonitoring>  CCTVViewTV;
    @javafx.fxml.FXML
    private TableColumn<CCTVMonitoring,String>  alertsTC;
    private ArrayList<CCTVMonitoring> cctvMonitoringArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        cameraCB.getItems().addAll("Online", "Offline");
        locationCB.getItems().addAll("Gate", "Lobby", "Parking", "Reception");

        cameraIdTC.setCellValueFactory(
                new PropertyValueFactory<>("cameraId"));
        locationTC.setCellValueFactory(
                new PropertyValueFactory<>("location"));
        lastCheckedTC.setCellValueFactory(
                new PropertyValueFactory<>("lastChecked"));
        alertsTC.setCellValueFactory(
                new PropertyValueFactory<>("alert"));

        CCTVViewTV.setItems(javafx.collections.FXCollections.observableArrayList(cctvMonitoringArrayList));
    }

    @javafx.fxml.FXML
    public void refreshButtonOA(ActionEvent actionEvent) {
        if (cameraIDTF.getText().isEmpty()
                || locationCB.getValue() == null
                || cameraCB.getValue() == null) {

            cctvViewLabel.setText("Please fill all fields.");
            return;
        }
        for (CCTVMonitoring c : cctvMonitoringArrayList) {

            if (c.getCameraId().equalsIgnoreCase(cameraIDTF.getText())) {

                cctvViewLabel.setText("Camera ID already exists.");
                return;
            }
        }
        String lastChecked = java.time.LocalDate.now().toString();
        String alert;

        if (cameraCB.getValue().equals("Offline")) {
            alert = "Camera Offline";
        } else {
            alert = "No Alert";
        }

        CCTVMonitoring cctv = new CCTVMonitoring(cameraIDTF.getText(), locationCB.getValue(),alert,lastCheckedTC.getCellValueFactory());

        cctvMonitoringArrayList.add(cctv);
        CCTVViewTV.setItems(
                javafx.collections.FXCollections.observableArrayList(cctvMonitoringArrayList)
        );
        alertsTA.setText(alert);

        cctvViewLabel.setText("CCTV information refreshed successfully.");
        cameraIDTF.clear();
        locationCB.setValue(null);
        cameraCB.setValue(null);
    }
}