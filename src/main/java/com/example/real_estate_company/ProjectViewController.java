package com.example.real_estate_company;

import Tanha.ProjectInformation;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ProjectViewController
{
    @javafx.fxml.FXML
    private Label projectInformationLabel;
    @javafx.fxml.FXML
    private TableColumn<ProjectInformation,String> publishByTC;
    @javafx.fxml.FXML
    private TableColumn <ProjectInformation,String>projectIdTC;
    @javafx.fxml.FXML
    private TableColumn<ProjectInformation,String> projectNameTC;
    @javafx.fxml.FXML
    private TableColumn<ProjectInformation,String> statusTC;
    @javafx.fxml.FXML
    private TableColumn<ProjectInformation,String> lastUpdatedTC;
    @javafx.fxml.FXML
    private TableView<ProjectInformation> projectInformationTableView;
    @javafx.fxml.FXML
    private TextField projectNameTF;
    @javafx.fxml.FXML
    private TextArea descriptionTA;
    @javafx.fxml.FXML
    private TextField projectIdTF;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        statusComboBox.getItems().addAll("Draft", "Published", "Archived");
    }

    @Deprecated
    public void uploadVideoButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void uploadImagebuttonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void publishButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveButtonOA(ActionEvent actionEvent) {
    }
}