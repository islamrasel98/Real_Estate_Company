package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class RegistrationController
{
    @javafx.fxml.FXML
    private TextField phoneTextField;
    @javafx.fxml.FXML
    private TextField customerIdTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField passwordField;
    @javafx.fxml.FXML
    private TextField confirmPasswordField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backToLoginButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(
                    Objects.requireNonNull(getClass().getResource("/com/example/real_estate_company/Login.fxml")));
            Stage stage = (Stage) ((Node)
                    actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root)); stage.show(); }
        catch (IOException e) { e.printStackTrace(); }
    }



    @javafx.fxml.FXML
    public void registerButtonOnAction(ActionEvent actionEvent) {
        String phone = phoneTextField.getText();
        String customerId = customerIdTextField.getText();
        String email = emailTextField.getText();
        String name = nameTextField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (phone.isEmpty() ||
                customerId.isEmpty() ||
                email.isEmpty() ||
                name.isEmpty() ||
                password.isEmpty() ||
                confirmPassword.isEmpty()) {

            System.out.println("Please fill all fields.");
            return;
        }

        if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match.");
            return;
        }

        System.out.println("Registration Successful!");
    }
}