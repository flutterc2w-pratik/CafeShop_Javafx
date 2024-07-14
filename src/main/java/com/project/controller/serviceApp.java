// package com.project.controller;

// import com.project.Screens.Screen1;
// import com.project.Screens.Screen2;
// import com.project.Screens.Screen3;
// import com.project.Screens.Screen4;

// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.stage.Stage;

// public class serviceApp extends Application {
//     private Stage primaryStage;
//     private Scene s1Scene;
//     private Scene s2Scene;
//     private Scene s3Scene;
//     private Scene s4Scene;
//     private Screen1 s1;
//     private Screen2 s2;
//     private Screen3 s3;
//     private Screen4 s4;

//     @Override
//     public void start(Stage primaryStage) throws Exception {
//         this.primaryStage = primaryStage;
//         s1 = new Screen1(this);
//         s1Scene = new Scene(s1.getView(), 300, 200);

//         primaryStage.setScene(s1Scene);
//         primaryStage.setTitle("Welcome Page");
//         primaryStage.show();
//     }

//     public void navigateToScreen2() {
//         s2 = new Screen2(this);
//         s2Scene = new Scene(s2.getView(), 300, 200);

//         primaryStage.setScene(s2Scene);
//         primaryStage.setTitle("Options Page");
//     }

//     public void navigateToScreen3() {
//         s3 = new Screen3(this);
//         s3Scene = new Scene(s3.getView(), 300, 400);

//         primaryStage.setScene(s3Scene);
//         primaryStage.setTitle("Menu Page");
//     }

//     public void navigateToScreen4(String category) {
//         s4 = new Screen4(this, category);
//         s4Scene = new Scene(s4.getView(), 300, 400);

//         primaryStage.setScene(s4Scene);
//         primaryStage.setTitle("Category Items Page");
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }

/*package com.project.controller;

import com.project.Screens.Screen1;
import com.project.Screens.Screen2;
import com.project.Screens.Screen3;
import com.project.Screens.coffee;
import com.project.Screens.colddrinks;
import com.project.Screens.pizza;
import com.project.Screens.wraps;
import com.project.Screens.Burger;
import com.project.Screens.Fries;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class serviceApp extends Application {
    private Stage primaryStage;
    private Scene s1Scene;
    private Scene s2Scene;
    private Scene s3Scene;
    private Scene s4Scene;
    private Scene s5Scene;
    private Scene s6Scene;
    private Scene s7Scene;
    private Scene s8Scene;
    private Scene s9Scene;
    private Screen1 s1;
    private Screen2 s2;
    private Screen3 s3;
    private Burger s4;
    private Fries s5;
    private pizza s6;
    private coffee s7;
    private colddrinks s8;
    private wraps s9;

    private String tableNumber;

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        s1 = new Screen1(this);
        s1Scene = new Scene(s1.getView(), 1800, 1000);

        primaryStage.setScene(s1Scene);
        primaryStage.setTitle("Welcome Page");
        primaryStage.show();
    }

    public void navigateToScreen2() {
        s2 = new Screen2(this);
        s2Scene = new Scene(s2.getView(), 1800, 1000);

        primaryStage.setScene(s2Scene);
        primaryStage.setTitle("Options Page");
    }

    public void navigateToScreen3() {
        s3 = new Screen3(this);
        s3Scene = new Scene(s3.getView(), 1800, 1000);

        primaryStage.setScene(s3Scene);
        primaryStage.setTitle("Menu Page");
    }

    public void navigateToBurger() {
        s4 = new Burger(this);
        s4Scene = new Scene(s4.getView(), 1800, 1000);
        primaryStage.setScene(s4Scene);
        primaryStage.setTitle("Category Items Page");
    }

    public void navigateToFries(String category) {
        s5 = new Fries(this);
        s5Scene = new Scene(s5.getView(), 1800, 1000);

        primaryStage.setScene(s5Scene);
        primaryStage.setTitle("Category Items Page");
    }

    public void navigateToPizza(String category) {
        s6 = new pizza(this);
        s6Scene = new Scene(s6.getView(), 1800, 1000);

        primaryStage.setScene(s6Scene);
        primaryStage.setTitle("Category Items Page");
    }
    public void navigateToCoffee(String category) {
        s7 = new coffee(this);
        s7Scene = new Scene(s7.getView(), 1800, 1000);

        primaryStage.setScene(s7Scene);
        primaryStage.setTitle("Category Items Page");
    }
    public void navigateToColdDrinks(String category) {
        s8 = new colddrinks(this);
        s8Scene = new Scene(s8.getView(), 1800, 1000);

        primaryStage.setScene(s8Scene);
        primaryStage.setTitle("Category Items Page");
    }
    public void navigateToWraps(String category) {
        s9 = new wraps(this);
        s9Scene = new Scene(s9.getView(), 1800, 1000);

        primaryStage.setScene(s9Scene);
        primaryStage.setTitle("Category Items Page");
    }

    // public static void main(String[] args) {
    // launch(args);
    // }
}*/
package com.project.controller;

import com.project.Screens.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class serviceApp extends Application {
    private Stage primaryStage;
    private Scene s1Scene;
    private Scene s2Scene;
    private Scene s3Scene;
    private Scene s4Scene;
    private Scene s5Scene;
    private Scene s6Scene;
    private Scene s7Scene;
    private Scene s8Scene;
    private Scene s9Scene;
    private Scene cartScene;

    private Screen1 s1;
    private Screen2 s2;
    private Screen3 s3;
    private Burger s4;
    private Fries s5;
    private pizza s6;
    private coffee s7;
    private colddrinks s8;
    private wraps s9;
    private CartScreen cartScreen;

    private String tableNumber;

    private Map<String, Integer> selectedItems = new HashMap<>();
    private Map<String, String> itemImages = new HashMap<>();
    private Map<String, Double> itemPrices = new HashMap<>();

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public Map<String, Integer> getSelectedItems() {
        return selectedItems;
    }

    public Map<String, String> getItemImages() {
        return itemImages;
    }

    public Map<String, Double> getItemPrices() {
        return itemPrices;
    }

    public void addItem(String label, int count, String imagePath, double price) {
        selectedItems.put(label, count);
        itemImages.put(label, imagePath);
        itemPrices.put(label, price);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        s1 = new Screen1(this);
        s1Scene = new Scene(s1.getView(), 1800, 1000);

        primaryStage.setScene(s1Scene);
        primaryStage.setTitle("Welcome Page");
        primaryStage.show();
    }

    public void navigateToScreen2() {
        s2 = new Screen2(this);
        s2Scene = new Scene(s2.getView(), 1800, 1000);

        primaryStage.setScene(s2Scene);
        primaryStage.setTitle("Options Page");
    }

    public void navigateToScreen3() {
        s3 = new Screen3(this);
        s3Scene = new Scene(s3.getView(), 1800, 1000);

        primaryStage.setScene(s3Scene);
        primaryStage.setTitle("Menu Page");
    }

    public void navigateToBurger() {
        if (s4 == null) {
            s4 = new Burger(this);
            s4Scene = new Scene(s4.getView(), 1800, 1000);
        }
        primaryStage.setScene(s4Scene);
        primaryStage.setTitle("Category Items Page");
    }

    public void navigateToFries() {
        if (s5 == null) {
            s5 = new Fries(this);
            s5Scene = new Scene(s5.getView(), 1800, 1000);
        }
        primaryStage.setScene(s5Scene);
        primaryStage.setTitle("Category Items Page");
    }

    public void navigateToPizza() {
        if (s6 == null) {
            s6 = new pizza(this);
            s6Scene = new Scene(s6.getView(), 1800, 1000);
        }
        primaryStage.setScene(s6Scene);
        primaryStage.setTitle("Category Items Page");
    }

    public void navigateToCoffee() {
        if (s7 == null) {
            s7 = new coffee(this);
            s7Scene = new Scene(s7.getView(), 1800, 1000);
        }
        primaryStage.setScene(s7Scene);
        primaryStage.setTitle("Category Items Page");
    }

    public void navigateToColdDrinks() {
        if (s8 == null) {
            s8 = new colddrinks(this);
            s8Scene = new Scene(s8.getView(), 1800, 1000);
        }
        primaryStage.setScene(s8Scene);
        primaryStage.setTitle("Category Items Page");
    }

    public void navigateToWraps() {
        if (s9 == null) {
            s9 = new wraps(this);
            s9Scene = new Scene(s9.getView(), 1800, 1000);
        }
        primaryStage.setScene(s9Scene);
        primaryStage.setTitle("Category Items Page");
    }

    public void navigateToCart() {
        cartScreen = new CartScreen(this);
        cartScene = new Scene(cartScreen.getView(), 1800, 1000);

        primaryStage.setScene(cartScene);
        primaryStage.setTitle("Cart Page");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
