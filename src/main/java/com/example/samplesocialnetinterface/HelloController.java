package com.example.samplesocialnetinterface;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void handleStatus(ActionEvent actionEvent) {
    }

    public void handlePicture(ActionEvent actionEvent) {
    }

    public void handleAddFriend(ActionEvent actionEvent) {
    }

    public void handleUnfriend(ActionEvent actionEvent) {
    }

    public void handleQuote(ActionEvent actionEvent) {
    }

    public void handleExit(ActionEvent actionEvent) {
        Platform.exit();
    }
}