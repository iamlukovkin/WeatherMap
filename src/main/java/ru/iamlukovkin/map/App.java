package ru.iamlukovkin.map;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Class for creating a window
 */
public class App extends Application {

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    private final double width = 300;
    private final double height = 250;

    /**
     * Method for creating a window
     */
    @Override
    public void start(Stage stage) {
        Scene scene = createScene();
        scene.setRoot(createRoot());
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Creation of the root element
     * @return root element
     */
    public Parent createRoot() {
        VBox root = new VBox();
        Label label = new Label("Hello, JavaFX!");
        root.getChildren().add(label);
        return root;
    }

    /**
     * Initialization of the window
     * @return main scene
     */
    public Scene createScene() {
        return new Scene(new Pane(), width, height);
    }
}
