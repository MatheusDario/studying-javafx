package com.example.about_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("View.fxml"));
        Scene scene = new Scene(parent);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}