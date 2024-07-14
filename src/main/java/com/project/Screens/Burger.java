package com.project.Screens;

import com.project.controller.serviceApp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.util.HashMap;
import java.util.Map;

public class Burger {

    private serviceApp app;
    private StackPane root;
    public boolean itemsSelected = false;
    

    public Burger(serviceApp app) {
        this.app = app;
       
        root = new StackPane();
        showMenuScreen();
    }

    private void showMenuScreen() {
        if (itemsSelected) {
            app.navigateToCart();
            return;
        }
        

        

        ScrollPane scrollPane = new ScrollPane();

        VBox mainLayout = new VBox(20);
        mainLayout.setAlignment(Pos.CENTER);
        mainLayout.getStylesheets().add(getClass().getResource("/Style1.css").toExternalForm());

        // Set the background image
        String imageUrl = "https://images.playground.com/95befc66cb2d48d7943cbd0b07cd338d.jpeg";
        Image backgroundImage = new Image(imageUrl);
        BackgroundImage bgImage = new BackgroundImage(
                backgroundImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(1920, 1080, false, false, false, false)
        );
        mainLayout.setBackground(new Background(bgImage));

        HBox topButtons = new HBox(1500);
        topButtons.setAlignment(Pos.CENTER);
        topButtons.setStyle("-fx-padding: 10;");

        Button backButton = new Button("Back");
        HBox.setHgrow(backButton, javafx.scene.layout.Priority.ALWAYS);
        backButton.setAlignment(Pos.TOP_LEFT);
        backButton.setOnAction(event -> app.navigateToScreen3());

        Button nextButton = new Button("Next");
        HBox.setHgrow(nextButton, javafx.scene.layout.Priority.ALWAYS);
        nextButton.setAlignment(Pos.TOP_RIGHT);
        nextButton.setOnAction(event -> app.navigateToCart());

        topButtons.getChildren().addAll(backButton, nextButton);

        FlowPane menuLayout = new FlowPane(80, 80);
        menuLayout.setAlignment(Pos.CENTER);
        menuLayout.setPrefWrapLength(800);
        menuLayout.setPrefHeight(800);

        addMenuItem(menuLayout, "Beanburger", 99,
                "file:src\\main\\resources\\images\\Burger images\\beanburger.jpg");
        addMenuItem(menuLayout, "CrispyChicken", 249,
                "file:src\\main\\resources\\images\\Burger images\\CrispyChickenBurger.jpg");
        addMenuItem(menuLayout, "Grilledchicken", 349,
                "file:src\\main\\resources\\images\\Burger images\\grilledchicken.jpg");
        addMenuItem(menuLayout, "viggieburger", 249,
                "file:src\\main\\resources\\images\\Burger images\\viggieburger.jpg");
        addMenuItem(menuLayout, "Mexicanburger", 246,
                "file:src\\main\\resources\\images\\Burger images\\mexicanburger.png");
        addMenuItem(menuLayout, "Deluxe Burger", 149,
                "file:src\\main\\resources\\images\\Burger images\\beanburger222.jpg");

        mainLayout.getChildren().addAll(topButtons, menuLayout);

        scrollPane.setContent(mainLayout);
        scrollPane.setFitToWidth(true);

        root.getChildren().clear();
        root.getChildren().add(scrollPane);
    }

    private void addMenuItem(FlowPane menuLayout, String label, double price, String imagePath) {
        

        VBox itemBox = new VBox(10);
        itemBox.setAlignment(Pos.CENTER);
        itemBox.setStyle(
                "-fx-background-color: white; -fx-padding: 40; -fx-border-color: lightgray; -fx-border-width: 1; -fx-border-radius: 5; -fx-background-radius: 5;");
        itemBox.setPrefWidth(250);
        itemBox.setPrefHeight(400);
        itemBox.getStylesheets().add(getClass().getResource("/Style1.css").toExternalForm());

        ImageView itemImage = new ImageView(new Image(imagePath));
        itemImage.setFitWidth(200);
        itemImage.setFitHeight(200);
        itemImage.setStyle("-fx-padding: 10;");

        Label itemLabel = new Label(label);
        itemLabel.setStyle("-fx-font-size:24px; -fx-font-weight:bold");

        Label itemPrice = new Label(String.valueOf(price));
        itemPrice.setStyle("-fx-font-size:20px;");

        HBox quantityBox = new HBox(10);
        quantityBox.setAlignment(Pos.CENTER);

        Button minusButton = new Button("-");
        Label quantityLabel = new Label("0");
        Button plusButton = new Button("+");

        minusButton.setOnAction(event -> {
            int currentValue = Integer.parseInt(quantityLabel.getText());
            if (currentValue > 0) {
                quantityLabel.setText(String.valueOf(currentValue - 1));
            }
        });

        plusButton.setOnAction(event -> {
            int currentValue = Integer.parseInt(quantityLabel.getText());
            if (currentValue < 10) {
                quantityLabel.setText(String.valueOf(currentValue + 1));
            }
        });

        quantityBox.getChildren().addAll(minusButton, quantityLabel, plusButton);

        Button selectButton = new Button("Select");
        selectButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px");
        selectButton.setOnAction(event -> {
            int count = Integer.parseInt(quantityLabel.getText());
            if (count > 0) {
               app.addItem(label, count, imagePath, price);
                selectButton.setStyle("-fx-background-color: yellow; -fx-text-fill: black;");
                selectButton.setText("Selected");
            }
        });

        itemBox.getChildren().addAll(itemImage, itemLabel, itemPrice, quantityBox, selectButton);
        menuLayout.getChildren().add(itemBox);
    }

    

    public StackPane getView() {
        return root;
    }
}
