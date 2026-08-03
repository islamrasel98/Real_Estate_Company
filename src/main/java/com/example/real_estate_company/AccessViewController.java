package com.example.real_estate_company;

import Tanha.AccessVerification;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class AccessViewController
{
    @javafx.fxml.FXML
    private TextField residentIdTF;
    @javafx.fxml.FXML
    private ComboBox<String> accessAreaCB;
    @javafx.fxml.FXML
    private TextField employeeIdTF;
    @javafx.fxml.FXML
    private TableView<AccessVerification> accessViewTableView;
    @javafx.fxml.FXML
    private TableColumn<AccessVerification,String> residentIdTC;
    @javafx.fxml.FXML
    private TableColumn<AccessVerification,String> AccessIdTC;
    @javafx.fxml.FXML
    private TableColumn<AccessVerification,String> verificationStatusTC;
    @javafx.fxml.FXML
    private TableColumn <AccessVerification,String>accessAreaTC;
    @javafx.fxml.FXML
    private Label accessVerificationLabel;
    @javafx.fxml.FXML
    private ComboBox<String> verificationStatusCB1;

    @javafx.fxml.FXML
    public void initialize() {
        accessAreaCB.getItems().addAll("Main Gate", "Office", "Parking", "Restricted Area");
        verificationStatusCB1.getItems().addAll("Granted", "Denied");

    }

    @Deprecated
    public void verificationStatusButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void verifyButtonOA(ActionEvent actionEvent) {
    }
}