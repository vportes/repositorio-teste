package com.apptest.apptest;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class secondController {
    private static final Logger logger = Logger.getLogger(secondController.class.getName()); //logger

    @FXML private Text secondText;

    @FXML protected void onVoltarButtonClick() {
        try { // Carregar start-view.fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("start-view.fxml"));
            Parent root = loader.load();
            Scene startViewScene = new Scene(root, 320, 240);
            Stage stage = (Stage) secondText.getScene().getWindow(); // Pegar a cena em que secondText pertence (a atual)
            stage.setScene(startViewScene);
            stage.show();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An error occurred: ", e);
        }
    }
}