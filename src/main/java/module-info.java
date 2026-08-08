module com.example.real_estate_company {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.graphics;
    requires com.example.real_estate_company;


    opens com.example.real_estate_company to javafx.fxml;
    exports com.example.real_estate_company;
    opens controller to javafx.fxml;
}