package com.example.real_estate_company;

import Tanha.PropertyListing;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class PropertyListingViewController
{
    @javafx.fxml.FXML
    private Label propertyListingLabel;
    @javafx.fxml.FXML
    private TableView<PropertyListing> propertyListingTableView;
    @javafx.fxml.FXML
    private TableColumn<PropertyListing,String> propertyNameTC;
    @javafx.fxml.FXML
    private ComboBox<String> propertyCB;
    @javafx.fxml.FXML
    private TextField listingPriceTF;
    @javafx.fxml.FXML
    private TableColumn<PropertyListing,String> listingPriceTC;
    @javafx.fxml.FXML
    private TableColumn<PropertyListing,String> publishDateTC;
    @javafx.fxml.FXML
    private TextField propertyIDTF;
    @javafx.fxml.FXML
    private TextField propertyNameTF;
    @javafx.fxml.FXML
    private DatePicker publishDateDP;
    @javafx.fxml.FXML
    private TableColumn<PropertyListing,String> propertyIdTC;
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