
package com.project.Screens;

import java.util.Map;

import com.project.controller.serviceApp;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class CartScreen {

    private serviceApp app;
    private StackPane root;

    public CartScreen(serviceApp app) {
        this.app = app;
        root = new StackPane();
        showCartScreen();
    }

    private void showCartScreen() {
        VBox selectedItemsLayout = new VBox(20);
        selectedItemsLayout.setAlignment(Pos.CENTER);
        selectedItemsLayout.setStyle("-fx-background-color: #f5f5f5; -fx-padding: 20;");

        Map<String, Integer> selectedItems = app.getSelectedItems();
        Map<String, String> itemImages = app.getItemImages();
        Map<String, Double> itemPrices = app.getItemPrices();

        for (Map.Entry<String, Integer> entry : selectedItems.entrySet()) {
            String item = entry.getKey();
            int count = entry.getValue();
            String imagePath = itemImages.get(item);
            double price = itemPrices.get(item);

            HBox itemBox = new HBox(20);
            itemBox.setAlignment(Pos.CENTER);

            ImageView itemImage = new ImageView(new Image(imagePath));
            itemImage.setFitWidth(100);
            itemImage.setFitHeight(100);

            Label itemLabel = new Label(item + " x " + count + " = " + (count * price));
            itemLabel.setStyle("-fx-font-size: 20px;");

            itemBox.getChildren().addAll(itemImage, itemLabel);
            selectedItemsLayout.getChildren().add(itemBox);
        }

        Button backButton = new Button("Back to Menu");
        backButton.setOnAction(event -> app.navigateToScreen3());
        selectedItemsLayout.getChildren().add(backButton);

        root.getChildren().clear();
        root.getChildren().add(selectedItemsLayout);
    }

    public StackPane getView() {
        return root;
    }
}
