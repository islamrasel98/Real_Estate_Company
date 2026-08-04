package com.example.real_estate_company;

import Tanha.Advertisement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
    ArrayList<Advertisement> advertisementList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        propertyCB.getItems().addAll("Apartment", "Commercial Space", "Office", "Land");
        statusComboBox.getItems().addAll("Pending", "Published", "Rejected");
        publicationChannelCB.getItems().addAll("Website", "Facebook", "Instagram", "LinkedIn");
        propertyNameCB.getItems().addAll("Apartment", "Villa", "Office", "Commercial Space", "Land");
        statusCB.getItems().addAll("Pending", "Published", "Rejected");
    }

    @Deprecated
    public void cancelButtonOA(ActionEvent actionEvent) {
        clearFields();

        successorerrormessageLabel.setText("Operation Cancelled.");

    }

    @Deprecated
    public void publishButtonOA(ActionEvent actionEvent) {
        Advertisement advertisement =
                propertyAdvertisementTableView.getSelectionModel().getSelectedItem();

        if(advertisement == null){

            successorerrormessageLabel.setText("Select an advertisement.");

            return;
        }

        advertisement.setStatus("Published");

        propertyAdvertisementTableView.refresh();

        successorerrormessageLabel.setText("Advertisement Published.");

    }

    @Deprecated
    public void saveButtonOA(ActionEvent actionEvent) {
        successorerrormessageLabel.setText("Advertisement Saved.");

    }

    @javafx.fxml.FXML
    public void searchButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearButtonOA(ActionEvent actionEvent) {
        clearFields();

        propertyAdvertisementTableView.getItems().clear();

        successorerrormessageLabel.setText("Cleared.");
    }

    @javafx.fxml.FXML
    public void searchAdvertisementButtonOA(ActionEvent actionEvent) {
        ObservableList<Advertisement> filteredList =
                FXCollections.observableArrayList();

        for(Advertisement a : advertisementList){

            if(a.getPropertyName().equals(propertyNameCB.getValue())
                    &&
                    a.getStatus().equals(statusComboBox.getValue())){

                filteredList.add(a);

            }

        }

        propertyAdvertisementTableView.setItems(filteredList);
    }

    @javafx.fxml.FXML
    public void addAdvertisementButtonOA(ActionEvent actionEvent) {

            float budget;

            try {
                budget = Float.parseFloat(budgetTF.getText());
            }
            catch(NumberFormatException e){

                successorerrormessageLabel.setText("Budget must be numeric.");
                return;
            }

            for(Advertisement a : advertisementList){

                if(a.getAdvertisementTitle().equalsIgnoreCase(advertisementTitleTF.getText())){

                    successorerrormessageLabel.setText("Advertisement title already exists.");
                    return;
                }

            }


            Advertisement advertisement = new Advertisement(

                    advertisementIdTF.getText(),
                    advertisementTitleTF.getText(),
                    propertyNameCB.getValue(),
                    budget,
                    publicationDateDP.getValue().toString(),
                    publicationChannelCB.getValue(),
                    statusComboBox.getValue()
            );


            advertisementList.add(advertisement);

            successorerrormessageLabel.setText("Advertisement Added Successfully.");

            clearFields();

        }
    private void clearFields() {
        advertisementIdTF.clear();
        advertisementTitleTF.clear();
        budgetTF.clear();
        publicationDateDP.setValue(null);
        propertyNameCB.setValue(null);
        publicationChannelCB.setValue(null);
        statusComboBox.setValue(null);
        successorerrormessageLabel.setText("");
    }
}
