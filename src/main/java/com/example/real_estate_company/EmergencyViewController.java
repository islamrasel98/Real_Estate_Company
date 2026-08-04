package com.example.real_estate_company;

import Tanha.EmergencyResponse;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class EmergencyViewController
{
    @javafx.fxml.FXML
    private Text severity;
    @javafx.fxml.FXML
    private TextField locationTF;
    @javafx.fxml.FXML
    private TableView<EmergencyResponse> emergencyResponseTableView;
    @javafx.fxml.FXML
    private TableColumn<EmergencyResponse,String> locationTC;
    @javafx.fxml.FXML
    private TextArea statusTA;
    @javafx.fxml.FXML
    private ComboBox<String> emergencyTypeCB;
    @javafx.fxml.FXML
    private Label emergencyResponseLabel;
    @javafx.fxml.FXML
    private TableColumn<EmergencyResponse,String>  responseTeamTC;
    @javafx.fxml.FXML
    private TableColumn<EmergencyResponse,String>  emergencyTypeTC;
    @javafx.fxml.FXML
    private ComboBox<String> severityCB;
    @javafx.fxml.FXML
    private TableColumn<EmergencyResponse,String>  statusTC;
    @javafx.fxml.FXML
    private TableColumn <EmergencyResponse,String> emergencyIdButtonOA;
    @javafx.fxml.FXML
    private ComboBox<String> responseTeamCB;
    ArrayList<EmergencyResponse> emergencyResponseArrayList= new ArrayList<>();
    @javafx.fxml.FXML
    public void initialize() {
        emergencyTypeCB.getItems().addAll( "Fire", "Medical", "Security", "Natural Disaster");
        severityCB.getItems().addAll("Pending", "In Progress", "Completed");
        responseTeamCB.getItems().addAll( "Fire Team", "Medical Team", "Security Team");
        emergencyIdButtonOA.setCellValueFactory(
                new PropertyValueFactory<>("emergencyId"));

        emergencyTypeTC.setCellValueFactory(
                new PropertyValueFactory<>("emergencyType"));

        locationTC.setCellValueFactory(
                new PropertyValueFactory<>("location"));

        responseTeamTC.setCellValueFactory(
                new PropertyValueFactory<>("responseTeam"));

        statusTC.setCellValueFactory(
                new PropertyValueFactory<>("status"));

        emergencyResponseTableView.setItems((ObservableList<EmergencyResponse>) emergencyResponseArrayList);
    }

    @javafx.fxml.FXML
    public void dispatchButtonOA(ActionEvent actionEvent) {
        String location = locationTF.getText();
        String emergencyType = emergencyTypeCB.getValue();
        String severity = severityCB.getValue();
        String responseTeam = responseTeamCB.getValue();
        if(location.isEmpty() || emergencyType == null || severity == null || responseTeam == null) {
            emergencyResponseLabel.setText("Please fill all fields.");
            return;
        }
        for(EmergencyResponse e : emergencyResponseArrayList) {
            if(e.getLocation().equalsIgnoreCase(location)) {
                emergencyResponseLabel.setText("Emergency already reported at this location.");
                return;
            }
        }
        EmergencyResponse newEmergency = new EmergencyResponse(
                location,
                emergencyType,
                severity,
                responseTeam,
                java.time.LocalDateTime.now().toString()
        );
        emergencyResponseArrayList.add(newEmergency);
    }
    private void clearFields() {

    locationTF.clear();

    emergencyTypeCB.setValue(null);
    severityCB.setValue(null);
    responseTeamCB.setValue(null);

    statusTA.clear();
}

}