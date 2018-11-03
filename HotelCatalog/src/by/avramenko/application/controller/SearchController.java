package by.avramenko.application.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SearchController {
    @FXML
    AnchorPane rootPane;

    @FXML
    private void Search() throws IOException {

        AnchorPane pane = FXMLLoader.load(getClass().getResource("../view/SearchResults.fxml"));
        rootPane.getChildren().setAll(pane);

    }
}
