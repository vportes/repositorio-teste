package com.apptest.apptest;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML private Label testeText;
    @FXML private TextField user1;
    @FXML private PasswordField password1;
    @FXML protected void onTestButtonClick() {
        String correctPassword = "123";
        String correctUser = "Vinicius";
        String user = user1.getText();
        String pw = password1.getText();
        if (user.equals(correctUser) && (pw.equals(correctPassword))) {
            testeText.setText("Login feito com sucesso!");
        }
    }
}