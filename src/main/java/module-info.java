module com.example.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens gui to javafx.fxml;
    opens model.entities to javafx.base;
    exports application;
}