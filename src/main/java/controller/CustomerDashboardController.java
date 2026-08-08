package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import model.Booking;

import java.io.IOException;
import java.util.Objects;

public class CustomerDashboardController
{
    @javafx.fxml.FXML
    private TableView<String> recentBookingsTable;
    @javafx.fxml.FXML
    private TableColumn<Booking, String> locationColumn;
    @javafx.fxml.FXML
    private Label customerIdLabel;
    @javafx.fxml.FXML
    private TableColumn<Booking, String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking, String> dateColumn;
    @javafx.fxml.FXML
    private Label customerPhoneLabel;
    @javafx.fxml.FXML
    private TableColumn<Booking, String> propertyColumn;
    @javafx.fxml.FXML
    private Label customerNameLabel;
    @javafx.fxml.FXML
    private Label customerEmailLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void paymentButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void bookButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void invoiceButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutButton(ActionEvent actionEvent) {
        try {
        Parent root = FXMLLoader.load(
                Objects.requireNonNull(getClass().getResource("/com/example/real_estate_company/Login.fxml")));
        Stage stage = (Stage) ((Node)
                actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root)); stage.show(); }
    catch (IOException e) { e.printStackTrace(); } }


    @javafx.fxml.FXML
    public void reserveButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void contractButton(ActionEvent actionEvent) {
    }
}