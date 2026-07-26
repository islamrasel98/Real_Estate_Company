package controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField PasswordTextField;
    @javafx.fxml.FXML
    private ComboBox<String> LoginAsComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        LoginAsComboBox.getItems().addAll("Customer", "HR Manager");
    }

    @javafx.fxml.FXML
    public void loginButtonOnAction(ActionEvent actionEvent) throws IOException {
        String email = emailTextField.getText();
        String password = PasswordTextField.getText();
        String role = LoginAsComboBox.getValue();

        if (email.isEmpty() || password.isEmpty() || role == null) {
            System.out.println("Please fill all fields.");
            return;
        }

        if (role.equals("Customer")) {

            try {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/CustomerDashboard.fxml"));
                Parent root = loader.load();

                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

                stage.setScene(new Scene(root));
                stage.setTitle("Customer Dashboard");
                stage.show();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {

            try {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/HRDashboard.fxml"));
                Parent root = loader.load();

                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

                stage.setScene(new Scene(root));
                stage.setTitle("HR Manager Dashboard");
                stage.show();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}



