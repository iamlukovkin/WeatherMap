package ru.iamlukovkin.map;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ApplicationExtension.class)
public class AppTest extends ApplicationTest {

    private final App app = new App();

    @Override
    public void start(Stage stage) {
        app.start(stage);
    }

    /**
     * Test entry point
     */
    @Test
    public void startTest() {
        assertDoesNotThrow(() -> {
            AppTest.launch(App.class);
        });
    }

    /*
     * Test creation of the root element
     */
    @Test
    public void createRootTest() {
        assertDoesNotThrow(() -> {
            VBox root = app.createRoot();
            assert !root.getChildren().isEmpty();
            Node node = root.getChildren().getFirst();
            assert node instanceof Label;
            Label label = (Label) node;
            assert label.getText().equals("Hello, JavaFX!");
        });
    }

    /*
     * Test creation of the scene
     */
    @Test
    public void createSceneTest() {
        assertDoesNotThrow(() -> {
            Scene scene = app.createScene();
            Node node = scene.getRoot();
            assert node instanceof Pane;
            assertEquals(scene.getWidth(), app.getWidth());
            assertEquals(scene.getHeight(), app.getHeight());
        });
    }

}
