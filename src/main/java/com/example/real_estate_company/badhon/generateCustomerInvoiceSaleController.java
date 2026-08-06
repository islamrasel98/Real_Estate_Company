package com.example.real_estate_company.badhon;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class generateCustomerInvoiceSaleController
{
    @javafx.fxml.FXML
    private TableColumn amountTableColumn;
    @javafx.fxml.FXML
    private TableView transactionTableView;
    @javafx.fxml.FXML
    private TableColumn propertyTableColumn;
    @javafx.fxml.FXML
    private TextField coustomerIdTextField;
    @javafx.fxml.FXML
    private TableColumn transIdTableColumn;
    @javafx.fxml.FXML
    private Label invoicePreviewLabel;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveInvoiceOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchCoustomerIdOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendInvoiceToEmailOnAction(ActionEvent actionEvent) {
    }
}