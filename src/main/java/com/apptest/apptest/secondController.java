package com.apptest.apptest;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class secondController {
    @FXML
    private Text secondText;

    @FXML
    protected void onSecondButtonClick() {
        try { // Carregar start-view.fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("start-view.fxml"));
            Parent root = loader.load();
            Scene startViewScene = new Scene(root, 320, 240);
            Stage stage = (Stage) secondText.getScene().getWindow(); // Pegar a cena em que secondText pertence (a atual)
            stage.setScene(startViewScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}