package com.example.real_estate_company;

import Tanha.EmergencyResponse;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class EmergencyViewController
{
    @javafx.fxml.FXML
    private Text severity;
    @javafx.fxml.FXML
    private TextField locationTF;
    @javafx.fxml.FXML
    private TableView<EmergencyResponse> emergencyResponseTableView;
    @javafx.fxml.FXML
    private TableColumn<EmergencyResponse,String> locationTC;
    @javafx.fxml.FXML
    private TextArea statusTA;
    @javafx.fxml.FXML
    private ComboBox<String> emergencyTypeCB;
    @javafx.fxml.FXML
    private Label emergencyResponseLabel;
    @javafx.fxml.FXML
    private TableColumn<EmergencyResponse,String>  responseTeamTC;
    @javafx.fxml.FXML
    private TableColumn<EmergencyResponse,String>  emergencyTypeTC;
    @javafx.fxml.FXML
    private ComboBox<String> severityCB;
    @javafx.fxml.FXML
    private TableColumn<EmergencyResponse,String>  statusTC;
    @javafx.fxml.FXML
    private TableColumn <EmergencyResponse,String> emergencyIdButtonOA;
    @javafx.fxml.FXML
    private ComboBox<String> responseTeamCB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void dispatchButtonOA(ActionEvent actionEvent) {
    }
}