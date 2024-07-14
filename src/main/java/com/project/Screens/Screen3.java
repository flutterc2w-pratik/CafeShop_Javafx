
package com.project.Screens;

import com.project.controller.serviceApp;
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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Screen3 {

    private serviceApp app;
    private StackPane root;

    public Screen3(serviceApp app) {
        this.app = app;
        root = new StackPane();
        showMenuScreen();
    }

    private void showMenuScreen() {
        ScrollPane scrollPane = new ScrollPane();

        VBox mainLayout = new VBox(20);
        mainLayout.setAlignment(Pos.CENTER);
        mainLayout.setStyle("-fx-background-color: #f5f5f5;");
        mainLayout.getStylesheets().add(getClass().getResource("/Style1.css").toExternalForm());

        String tableNumber = app.getTableNumber();
        Label menu = new Label("Select Menu for Table Number " + (tableNumber != null ? tableNumber : ""));
        menu.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        mainLayout.getChildren().add(menu);

        FlowPane menuLayout = new FlowPane(80, 80);
        menuLayout.setAlignment(Pos.CENTER);
        menuLayout.setPrefWrapLength(800);
        menuLayout.setPrefHeight(800);

        addMenuItem(menuLayout, "Burger", "file:src\\main\\resources\\images\\Fresh beef burger isolated -4.jpg",
                this::navigateToBurger);
        addMenuItem(menuLayout, "Fries", "file:src\\main\\resources\\images\\fries.jpg", this::navigateToFries);
        addMenuItem(menuLayout, "Coffee", "file:src\\main\\resources\\images\\hot coffe.jpg", this::navigateToCoffee);
        addMenuItem(menuLayout, "Pizza", "file:src\\main\\resources\\images\\pizzza.jpg", this::navigateToPizza);
        addMenuItem(menuLayout, "Wraps", "file:src\\main\\resources\\images\\wraps.jpg", this::navigateToWraps);
        addMenuItem(menuLayout, "Cold Drinks", "file:src\\main\\resources\\images\\cold drink.jpg",
                this::navigateToColdDrinks);

        Button cartButton = new Button("Cart");
        cartButton.setOnAction(event -> app.navigateToCart());
        mainLayout.getChildren().addAll(menuLayout, cartButton);

        scrollPane.setContent(mainLayout);
        scrollPane.setFitToWidth(true);

        root.getChildren().clear();
        root.getChildren().add(scrollPane);

        Image backgroundImage = new Image("https://images.playground.com/95befc66cb2d48d7943cbd0b07cd338d.jpeg");
        BackgroundImage bgImage = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        root.setBackground(new Background(bgImage));
    }

    private void addMenuItem(FlowPane menuLayout, String label, String imagePath, Runnable navigationAction) {
        VBox itemBox = new VBox(10);
        itemBox.setAlignment(Pos.CENTER);
        itemBox.setStyle(
                "-fx-background-color: white; -fx-padding: 40; -fx-border-color: lightgray; -fx-border-width: 1; -fx-border-radius: 5; -fx-background-radius: 5;");
        itemBox.setPrefWidth(200);
        itemBox.setPrefHeight(300);

        ImageView itemImage = new ImageView(new Image(imagePath));
        itemImage.setFitWidth(150);
        itemImage.setFitHeight(150);
        itemImage.setStyle("-fx-border-color: black; -fx-border-width: 1; -fx-padding: 5;");

        Label itemLabel = new Label(label);
        itemLabel.setStyle("-fx-font-size:24px; -fx-font-weight:bold");

        Button viewButton = new Button("View");
        viewButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px");
        viewButton.setOnAction(event -> navigationAction.run());

        itemBox.getChildren().addAll(itemImage, itemLabel, viewButton);
        menuLayout.getChildren().add(itemBox);
    }

    private void navigateToBurger() {
        app.navigateToBurger();
    }

    private void navigateToFries() {
        app.navigateToFries();
    }

    private void navigateToCoffee() {
        app.navigateToCoffee();
    }

    private void navigateToPizza() {
        app.navigateToPizza();
    }

    private void navigateToWraps() {
        app.navigateToWraps();
    }

    private void navigateToColdDrinks() {
        app.navigateToColdDrinks();
    }

    public StackPane getView() {
        return root;
    }
}


