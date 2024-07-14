package com.project.Screens;

import com.project.controller.serviceApp;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Screen2 {
    private serviceApp app;
    private GridPane view;
    public String yourtable;

    public Screen2(serviceApp app) {
        this.app = app;
        initialize();
    }

    private void initialize() {
        view = new GridPane();
        view.setPadding(new Insets(20));
        view.setAlignment(Pos.CENTER);

        Button dineInButton = new Button("Save & Next");
        TextField tableno = new TextField();
        Label table = new Label("Enter Table Number");
        table.setStyle("-fx-font-size:24px; -fx-font-weight:bold");
       // Label emptyLabel = new Label();

        dineInButton.setOnAction(event -> {
            app.setTableNumber(tableno.getText());
            app.navigateToScreen3();
        });

        view.setVgap(20);
        view.add(table, 0, 0);
        view.add(tableno, 0, 1);
        view.add(dineInButton, 0, 2);
        view.setStyle("-fx-background-image: url('https://images.playground.com/95befc66cb2d48d7943cbd0b07cd338d.jpeg'); -fx-background-repeat: no-repeat; -fx-background-size: 1920 1080; -fx-background-position: center center;");
        view.getStylesheets().add(getClass().getResource("/Style1.css").toExternalForm());
    }

    public GridPane getView() {
        return view;
    }
}
