package ru.iamlukovkin.map;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 */
public class App extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello, JavaFX!");
        Scene scene = new Scene(label, 300, 250);
        stage.setScene(scene);
        stage.show();
    }
}
