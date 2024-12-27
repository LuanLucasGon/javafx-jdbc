module com.example.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens gui to javafx.fxml;
    exports application;
}