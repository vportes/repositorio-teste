package com.apptest.apptest;

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
    @FXML private TextField user1;
    @FXML private PasswordField password1;
    @FXML protected void onTestButtonClick() {
        String correctPassword = "123";
        String correctUser = "Vinicius";
        String user = user1.getText();
        String pw = password1.getText();
        if (user.equals(correctUser) && pw.equals(correctPassword)) {
            try { // Carregar second-view.fxml
                FXMLLoader loader = new FXMLLoader(getClass().getResource("second-view.fxml"));
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
