package com.example.real_estate_company;

import Tanha.SecurityIncident;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.*;

public class IncidentViewController
{
    @javafx.fxml.FXML
    private TableColumn<SecurityIncident,String> incidentDateTC;
    @javafx.fxml.FXML
    private TextField locationTF;
    @javafx.fxml.FXML
    private TableColumn<SecurityIncident,String> locationTC;
    @javafx.fxml.FXML
    private DatePicker incidentDateDP;
    @javafx.fxml.FXML
    private TableColumn<SecurityIncident,String> incidentIdTC;
    @javafx.fxml.FXML
    private TableColumn<SecurityIncident,String> evidenceStatusTC;
    @javafx.fxml.FXML
    private Label securityIncidentReportlabel;
    @javafx.fxml.FXML
    private ComboBox<String> incidentTypeCB;
    @javafx.fxml.FXML
    private TableColumn<SecurityIncident,String> incidentTypeTC;
    @javafx.fxml.FXML
    private TextArea descriptionTA;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void securityIncidentReportTableView(Event event) {
    }

    @javafx.fxml.FXML
    public void uploadEvidenceButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitButtonOA(ActionEvent actionEvent) {
    }
}