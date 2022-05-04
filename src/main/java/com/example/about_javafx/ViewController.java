package com.example.about_javafx;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class ViewController{

    @FXML
    private Button btTest;

    @FXML
    public void onBtTestAction() {
        Alerts.showAlert("Title", null, "Hello", Alert.AlertType.ERROR);
    }
}
