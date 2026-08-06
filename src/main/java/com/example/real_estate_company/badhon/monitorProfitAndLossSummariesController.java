package com.example.real_estate_company.badhon;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class monitorProfitAndLossSummariesController
{
    @javafx.fxml.FXML
    private DatePicker endDateDatePicker;
    @javafx.fxml.FXML
    private Label reportOutputLabel;
    @javafx.fxml.FXML
    private DatePicker choicePeriodDatePicker;
    @javafx.fxml.FXML
    private DatePicker startDateDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateReportOnAction(ActionEvent actionEvent) {
    }
}