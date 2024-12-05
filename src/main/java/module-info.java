module ru.iamlukovkin.map {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    opens ru.iamlukovkin.map to javafx.fxml;
    exports ru.iamlukovkin.map;
}