package com.example.eventhandlingpressbutton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class keyPressEventApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(keyPressEventApp.class.getResource("/com/example/eventhandlingpressbutton/keyPressEvent.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        // Wir brauchen den KeyPressEventController
        KeyPressEventController keyPressEventController = fxmlLoader.getController();
        keyPressEventController.initialize(scene);

        stage.resizableProperty().set(false);
        stage.setTitle("KeyPressEventApp!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
