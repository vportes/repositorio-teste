package com.apptest.apptest;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label testeText;

    @FXML
    protected void onTestButtonClick() {
        testeText.setText("Bem vindo ao aplicativo teste");
    }
}