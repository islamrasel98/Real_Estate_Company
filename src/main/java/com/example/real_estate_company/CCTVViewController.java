package com.example.real_estate_company;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class CCTVViewController
{
    @javafx.fxml.FXML
    private ComboBox cameraCB;
    @javafx.fxml.FXML
    private ComboBox locationCB;
    @javafx.fxml.FXML
    private TableColumn locationTC;
    @javafx.fxml.FXML
    private TableColumn cameraIdTC;
    @javafx.fxml.FXML
    private TableColumn lastCheckedTC;
    @javafx.fxml.FXML
    private TableColumn cameraStatusTC;
    @javafx.fxml.FXML
    private Label cctvViewLabel;
    @javafx.fxml.FXML
    private ImageView videoDisplayImageView;
    @javafx.fxml.FXML
    private TextArea alertsTA;
    @javafx.fxml.FXML
    private TableView CCTVViewTV;
    @javafx.fxml.FXML
    private TableColumn alertsTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void refreshButtonOA(ActionEvent actionEvent) {
    }
}