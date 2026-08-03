package com.example.real_estate_company;

import Tanha.CustomerLead;
import Tanha.Promotion;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class LeadViewController
{
    @javafx.fxml.FXML
    private TextField phoneTF;
    @javafx.fxml.FXML
    private ComboBox <String>leadStatusCB;
    @javafx.fxml.FXML
    private TableColumn<Promotion,String> assignedStaffTC;
    @javafx.fxml.FXML
    private TableColumn<Promotion,String> customerNameTC;
    @javafx.fxml.FXML
    private TextField customerNameTF;
    @javafx.fxml.FXML
    private TableView<Promotion> customerLeadsTableView;
    @javafx.fxml.FXML
    private Label customerLeadsLabel;
    @javafx.fxml.FXML
    private TableColumn<Promotion,String> leadStatusTC;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TextArea noteTA;
    @javafx.fxml.FXML
    private TableColumn<Promotion,String> followUPDateTC;
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