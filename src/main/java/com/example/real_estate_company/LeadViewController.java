package com.example.real_estate_company;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class LeadViewController
{
    @javafx.fxml.FXML
    private TextField phoneTF;
    @javafx.fxml.FXML
    private ComboBox leadStatusCB;
    @javafx.fxml.FXML
    private TableColumn assignedStaffTC;
    @javafx.fxml.FXML
    private TableColumn customerNameTC;
    @javafx.fxml.FXML
    private TextField customerNameTF;
    @javafx.fxml.FXML
    private TableView customerLeadsTableView;
    @javafx.fxml.FXML
    private Label customerLeadsLabel;
    @javafx.fxml.FXML
    private ComboBox assignedStaffCB;
    @javafx.fxml.FXML
    private TableColumn leadStatusTC;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TextArea noteTA;
    @javafx.fxml.FXML
    private TableColumn followUPDateTC;
    @javafx.fxml.FXML
    private DatePicker followupDateDP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void deleteButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateButtonOA(ActionEvent actionEvent) {
    }
}