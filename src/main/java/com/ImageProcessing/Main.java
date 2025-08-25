package com.chat;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        TextArea textArea = new TextArea();
        textArea.setEditable(false);

        textArea.appendText("Hello and welcome!\n");
        for (int i = 1; i <= 5; i++) {
            textArea.appendText("i = " + i + "\n");
        }

        Scene scene = new Scene(textArea, 400, 300);
        stage.setTitle("JavaFX Output Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
