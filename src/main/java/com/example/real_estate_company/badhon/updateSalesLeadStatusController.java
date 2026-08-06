package com.example.real_estate_company.badhon;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class updateSalesLeadStatusController
{
    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private Label LeadDetailsLabel;
    @javafx.fxml.FXML
    private ComboBox statusComboBox;
    @javafx.fxml.FXML
    private TableColumn customerTableColumn;
    @javafx.fxml.FXML
    private TableColumn leadIdTableColumn;
    @javafx.fxml.FXML
    private TableView leadsTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveStatusOnAction(ActionEvent actionEvent) {
    }
}