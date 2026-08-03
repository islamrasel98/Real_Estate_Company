package com.example.real_estate_company;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class PropertyListingViewController
{
    @javafx.fxml.FXML
    private Label propertyListingLabel;
    @javafx.fxml.FXML
    private TableView propertyListingTableView;
    @javafx.fxml.FXML
    private TableColumn propertyNameTC;
    @javafx.fxml.FXML
    private ComboBox propertyCB;
    @javafx.fxml.FXML
    private TextField listingPriceTF;
    @javafx.fxml.FXML
    private TableColumn listingPriceTC;
    @javafx.fxml.FXML
    private TableColumn publishDateTC;
    @javafx.fxml.FXML
    private TextField propertyIDTF;
    @javafx.fxml.FXML
    private TextField propertyNameTF;
    @javafx.fxml.FXML
    private DatePicker publishDateDP;
    @javafx.fxml.FXML
    private TableColumn propertyIdTC;
    @javafx.fxml.FXML
    private Label successorErrorLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void cancelButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void publishButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addListingButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchListingButtonOA(ActionEvent actionEvent) {
    }
}