package com.project.Screens;

import com.project.controller.serviceApp;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

public class Screen1 {
    private serviceApp app;
    private GridPane view;

    public Screen1(serviceApp app) {
        this.app = app;
        initialize();
    }

    private void initialize() {
        view = new GridPane();
        view.getStyleClass().add("root");

        // Applying padding and alignment
        view.setPadding(new Insets(20));
        view.setAlignment(Pos.CENTER);
        view.setMaxHeight(100);
        view.setMaxWidth(600);

        // Creating the button with CSS styling
        Button getStartedButton = new Button("Order Now");
       
        getStartedButton.getStyleClass().add("button");

        // Adding fade transition animation
        FadeTransition fadeIn = new FadeTransition(Duration.millis(1500), getStartedButton);
        fadeIn.setFromValue(0.0);
        fadeIn.setToValue(1.0);
        fadeIn.play();

        // Handling button click
        getStartedButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                app.navigateToScreen2();
            }
        });

        // Adding the button to the view
        view.add(getStartedButton, 2, 2);
        view.setStyle( "-fx-background-image: url('https://images.playground.com/95befc66cb2d48d7943cbd0b07cd338d.jpeg'); -fx-background-repeat: no-repeat; -fx-background-size: 1920 1080; -fx-background-position: center center;");

        // Applying styles
        view.getStylesheets().add(getClass().getResource("/Style1.css").toExternalForm());
    }

    public GridPane getView() {
        return view;
    }
}
