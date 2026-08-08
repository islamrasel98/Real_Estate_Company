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

public class HRDashboardController
{
    @javafx.fxml.FXML
    private Label managerEmailLabel;
    @javafx.fxml.FXML
    private TableColumn<Booking, String> statusColumn;
    @javafx.fxml.FXML
    private Label managerIdLabel;
    @javafx.fxml.FXML
    private TableColumn<Booking, String> employeeColumn;
    @javafx.fxml.FXML
    private TableView<String> recentActivitiesTable;
    @javafx.fxml.FXML
    private TableColumn<Booking, String> dateColumn;
    @javafx.fxml.FXML
    private Label managerNameLabel;
    @javafx.fxml.FXML
    private Label  departmentLabel;
    @javafx.fxml.FXML
    private TableColumn<Booking, String> activityColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void recruitEmployeeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void manageEmployeesButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void scheduleInterviewButton(ActionEvent actionEvent) {
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
    public void evaluateEmployeeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveRequestButton(ActionEvent actionEvent) {
    }
}