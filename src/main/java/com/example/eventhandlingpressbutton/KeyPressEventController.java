package com.example.eventhandlingpressbutton;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class KeyPressEventController {
    @FXML
    private ImageView catPic;
    @FXML
    private AnchorPane anchorPane;

    public void initialize(Scene scene) {
        System.out.println("MovableImageController initialized");
        // Das ist eine Lambda Funktion
        // Wir lassen handleKeyPressEvent die Events verarbeiten die per Tastatur eingegeben werden

        scene.setOnKeyPressed(this::handleKeyPressEvent);


    }

    // Auf Pfeiltasten reagieren
    /*
     * Bei Reaktion auf ButtonClick -> Ne Methode zugeordnet, die ausgeführt wird
     *
     *
     * */

    public boolean collisionDetection(){
        boolean collosion=false;
        if (Math.abs(catPic.getX())> (anchorPane.getWidth()- catPic.getFitWidth())/2 || Math.abs(catPic.getY())> (anchorPane.getHeight()-catPic.getFitHeight())/2){
            collosion=true;
        }
        return collosion;
    }
    @FXML
    public void handleKeyPressEvent(KeyEvent keyEvent) {
        if (!collisionDetection()){
            switch (keyEvent.getCode()) {
                case W:
                    catPic.setY(catPic.getY()+(-5));
                    System.out.println((anchorPane.getHeight()-catPic.getFitHeight())/2);
                    System.out.println(Math.abs(catPic.getY()));
                    break;
                case S:
                    catPic.setY(catPic.getY()-(-5));
                    break;
                case D:
                    catPic.setX(catPic.getX()-(-5));
                    break;
                case A:
                    catPic.setX(catPic.getX()+(-5));
                    break;
            }
        }
        else {
            catPic.setX(0);
            catPic.setY(0);
        }

    }
}
