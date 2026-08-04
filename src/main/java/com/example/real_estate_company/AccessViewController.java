package com.example.real_estate_company;

import Tanha.AccessVerification;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccessViewController
{
    @javafx.fxml.FXML
    private TextField residentIdTF;
    @javafx.fxml.FXML
    private ComboBox<String> accessAreaCB;
    @javafx.fxml.FXML
    private TextField employeeIdTF;
    @javafx.fxml.FXML
    private TableView<AccessVerification> accessViewTableView;
    @javafx.fxml.FXML
    private TableColumn<AccessVerification,String> residentIdTC;
    @javafx.fxml.FXML
    private TableColumn<AccessVerification,String> AccessIdTC;
    @javafx.fxml.FXML
    private TableColumn<AccessVerification,String> verificationStatusTC;
    @javafx.fxml.FXML
    private TableColumn <AccessVerification,String>accessAreaTC;
    @javafx.fxml.FXML
    private Label accessVerificationLabel;
    @javafx.fxml.FXML
    private ComboBox<String> verificationStatusCB1;

    @javafx.fxml.FXML
    public void initialize() {
        accessAreaCB.getItems().addAll("Main Gate", "Office", "Parking", "Restricted Area");
        verificationStatusCB1.getItems().addAll("Granted", "Denied");

    }

    @Deprecated
    public void verificationStatusButtonOA(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void verifyButtonOA(ActionEvent actionEvent) {
        AccessVerification selectedItem = accessViewTableView.getSelectionModel().getSelectedItem();

        if (selectedItem == null) {
            showAlert("Error", "Please select an access record to update status.", Alert.AlertType.WARNING);
            return;
        }
        String newStatus = verificationStatusCB1.getValue();

        if (newStatus == null) {
            showAlert("Error", "Please select a verification status.", Alert.AlertType.ERROR);
            return;
        }

        try {
            selectedItem.setVerificationStatus(newStatus);
            selectedItem.setLastUpdated(getCurrentTimestamp());
            accessViewTableView.refresh();

            showAlert("Success", "Verification status updated to: " + newStatus +
                            " for Access ID: " + selectedItem.getAccessId(),
                    Alert.AlertType.INFORMATION);

        } catch (Exception e) {
            showAlert("Error", "Failed to update status: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }
    private void showAlert(String title, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    private String getCurrentTimestamp() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }
}