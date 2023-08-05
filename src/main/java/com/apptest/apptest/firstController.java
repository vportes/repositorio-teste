package com.apptest.apptest;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class firstController {
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
                Scene secondViewScene = new Scene(root, 320, 240);
                Stage stage = (Stage) testeText.getScene().getWindow(); // Pegar a cena em que testeText pertence (a atual)
                stage.setScene(secondViewScene);
                stage.show();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
