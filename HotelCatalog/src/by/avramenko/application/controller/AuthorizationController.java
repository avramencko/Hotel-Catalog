package by.avramenko.application.controller;

import by.avramenko.application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class AuthorizationController {


    @FXML
    AnchorPane rootPane;

    @FXML
    private void handleEnter() throws IOException {

        AnchorPane pane = FXMLLoader.load(getClass().getResource("../view/Search.fxml"));
        rootPane.getChildren().setAll(pane);

    }

}
