package com.example.real_estate_company;

import Tanha.CCTVMonitoring;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class CCTVViewController
{
    @javafx.fxml.FXML
    private ComboBox<String>cameraCB;
    @javafx.fxml.FXML
    private ComboBox<String> locationCB;
    @javafx.fxml.FXML
    private TableColumn<CCTVMonitoring,String> locationTC;
    @javafx.fxml.FXML
    private TableColumn<CCTVMonitoring,String> cameraIdTC;
    @javafx.fxml.FXML
    private TableColumn<CCTVMonitoring,String> lastCheckedTC;
    @javafx.fxml.FXML
    private TableColumn<CCTVMonitoring,String> cameraStatusTC;
    @javafx.fxml.FXML
    private Label cctvViewLabel;
    @javafx.fxml.FXML
    private ImageView videoDisplayImageView;
    @javafx.fxml.FXML
    private TextArea alertsTA;
    @javafx.fxml.FXML
    private TableView<CCTVMonitoring> CCTVViewTV;
    @javafx.fxml.FXML
    private TableColumn<CCTVMonitoring,String> alertsTC;

    @javafx.fxml.FXML
    public void initialize() {
        cameraCB.getItems().addAll("Online", "Offline");
        locationCB.getItems().addAll( "Gate", "Lobby", "Parking", "Reception");
    }

    @javafx.fxml.FXML
    public void refreshButtonOA(ActionEvent actionEvent) {
    }
}