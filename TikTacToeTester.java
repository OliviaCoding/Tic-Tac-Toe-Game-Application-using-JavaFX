package com.example.tiktaktoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class TikTakToeTester extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        TikTakToe t;
        t = new TikTakToe();
        Pane v1 = t.getV1();

        Scene scene = new Scene(v1, 300, 400);

        stage.setTitle("Olivia's TikTakToe");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}