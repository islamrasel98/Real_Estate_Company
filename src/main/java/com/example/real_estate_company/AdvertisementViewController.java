package com.example.real_estate_company;

import Tanha.Advertisement;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class AdvertisementViewController
{
    @javafx.fxml.FXML
    private TextField advertisementTitleTF;
    @javafx.fxml.FXML
    private DatePicker publicationDateDP;
    @javafx.fxml.FXML
    private Label propertyAdvertisementlabel;
    @javafx.fxml.FXML
    private TableView<Advertisement> propertyAdvertisementTableView;
    @javafx.fxml.FXML
    private ComboBox<String> propertyCB;
    @javafx.fxml.FXML
    private TextField budgetTF;
    @javafx.fxml.FXML
    private TextField advertisementIdTF;
    @javafx.fxml.FXML
    private TableColumn<Advertisement,String> advertisementIdTC;
    @javafx.fxml.FXML
    private ComboBox<String> statusCB;
    @javafx.fxml.FXML
    private TableColumn<Advertisement,String> propertyTC;
    @javafx.fxml.FXML
    private TableColumn<Advertisement,String> publishDateTC;
    @javafx.fxml.FXML
    private TableColumn<Advertisement,String>channelTC;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> propertyNameCB;
    @javafx.fxml.FXML
    private TableColumn<Advertisement,String> statusTC;
    @javafx.fxml.FXML
    private ComboBox<String> publicationChannelCB;
    @javafx.fxml.FXML
    private Label successorerrormessageLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void cancelButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void uploadImageButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void publishButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void saveButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchAdvertisementButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addAdvertisementButtonOA(ActionEvent actionEvent) {
    }
}