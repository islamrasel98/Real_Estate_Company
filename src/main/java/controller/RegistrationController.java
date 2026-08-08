package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
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

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    @javafx.fxml.FXML
    public void registerButtonOnAction(ActionEvent actionEvent) throws IOException {

        Parent root = FXMLLoader.load(
                Objects.requireNonNull(getClass().getResource("/com/example/real_estate_company/Login.fxml")));

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

}