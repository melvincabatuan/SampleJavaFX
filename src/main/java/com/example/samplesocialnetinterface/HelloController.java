package com.example.samplesocialnetinterface;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController implements Initializable {
    
    @FXML
    private ListView<String> listView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> animals =
                FXCollections.observableArrayList("Jose Rizal", "Andres Bonifacio", "Bill Gates",
                        "Elon Musk", "Donald Trum", "Joe Biden");
        listView.setItems(animals);
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
