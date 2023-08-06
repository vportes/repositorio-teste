package com.vportes.apptest.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class firstController {
    private static final Logger logger = Logger.getLogger(firstController.class.getName()); //logger

    @FXML private Label testeText;
    @FXML private TextField usuario1;
    @FXML private PasswordField senha1;
    @FXML protected void onLoginButtonClick() {
        String correctPassword = "123";
        String correctUser = "Vinicius";
        String user = usuario1.getText();
        String pw = senha1.getText();
        if (user.equals(correctUser) && pw.equals(correctPassword)) {
            try { // Carregar second-view.fxml
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/vportes/apptest/fxml/second-view.fxml"));
                Parent root = loader.load();
                Scene secondViewScene = new Scene(root);
                Stage stage = (Stage) testeText.getScene().getWindow(); // Pegar a cena em que testeText pertence (a atual)
                stage.setScene(secondViewScene);
                stage.show();
            }
            catch (Exception e) {
                logger.log(Level.SEVERE, "An error occurred: ", e);
            }
        }
    }
}
