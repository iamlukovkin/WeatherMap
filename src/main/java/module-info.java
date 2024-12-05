module ru.iamlukovkin.map {
    requires javafx.controls;
    requires transitive javafx.graphics;
    requires javafx.fxml;
    requires java.desktop;
    requires static lombok;
    opens ru.iamlukovkin.map to javafx.fxml, javafx.graphics;
    exports ru.iamlukovkin.map;
}