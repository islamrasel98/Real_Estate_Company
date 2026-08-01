package com.example.real_estate_company;

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
    private TableView emergencyResponseTableView;
    @javafx.fxml.FXML
    private TableColumn locationTC;
    @javafx.fxml.FXML
    private TextArea statusTA;
    @javafx.fxml.FXML
    private ComboBox emergencyTypeCB;
    @javafx.fxml.FXML
    private Label emergencyResponseLabel;
    @javafx.fxml.FXML
    private TableColumn responseTeamTC;
    @javafx.fxml.FXML
    private TableColumn emergencyTypeTC;
    @javafx.fxml.FXML
    private ComboBox severityCB;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableColumn emergencyIdButtonOA;
    @javafx.fxml.FXML
    private ComboBox responseTeamCB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void dispatchButtonOA(ActionEvent actionEvent) {
    }
}