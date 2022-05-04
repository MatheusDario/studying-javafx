module com.example.about_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.about_javafx to javafx.fxml;
    exports com.example.about_javafx;
}