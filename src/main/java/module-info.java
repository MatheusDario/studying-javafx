module com.example.about_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.program to javafx.fxml;
    exports com.example.program;
    exports gui;
    opens gui to javafx.fxml;
}