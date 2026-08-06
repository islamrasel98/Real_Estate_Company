package com.example.real_estate_company.badhon;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class trackInstallmentPaymentsController
{
    @javafx.fxml.FXML
    private DatePicker paymentDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn balanceTableColumn;
    @javafx.fxml.FXML
    private TableColumn noTablecolumn;
    @javafx.fxml.FXML
    private TextField paymentAmountTextField;
    @javafx.fxml.FXML
    private TextField customerIdTextField;
    @javafx.fxml.FXML
    private TableView inatallmentTableView;
    @javafx.fxml.FXML
    private TableColumn dueDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn paidTableColumn;
    @javafx.fxml.FXML
    private TableColumn amountDueTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchIdOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updatePymentOnAction(ActionEvent actionEvent) {
    }
}