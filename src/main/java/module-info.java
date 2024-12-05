module ru.iamlukovkin.map {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires static lombok;
    opens ru.iamlukovkin.map to javafx.fxml;
    exports ru.iamlukovkin.map;
}