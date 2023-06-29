module com.example.eventhandlingpressbutton {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.eventhandlingpressbutton to javafx.fxml;
    exports com.example.eventhandlingpressbutton;
}