package com.example.real_estate_company;

import Tanha.Promotion;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class PromotionViewController
{
    @javafx.fxml.FXML
    private TableColumn<Promotion,Float> discountTC;
    @javafx.fxml.FXML
    private Label promotionandDiscountLabel;
    @javafx.fxml.FXML
    private TextField discountTF;
    @javafx.fxml.FXML
    private DatePicker endDateDP;
    @javafx.fxml.FXML
    private TableColumn<Promotion,String> promotionNameTC;
    @javafx.fxml.FXML
    private TableColumn<Promotion,String> statusTC;
    @javafx.fxml.FXML
    private TextField promotionNameTF;
    @javafx.fxml.FXML
    private TableColumn<Promotion,String> endDateTC;
    @javafx.fxml.FXML
    private TableView<Promotion> promotionandDiscountTableView;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        statusComboBox.getItems().addAll("Active","Inactive","Expired");
    }

    @Deprecated
    public void activeButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void savebuttonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addpromotionButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchPromotionbuttonOA(ActionEvent actionEvent) {
    }
}