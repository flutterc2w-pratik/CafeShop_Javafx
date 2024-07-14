package com.project.controller;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {
    private Map<String, Integer> selectedItems;
    private Map<String, String> itemImages;
    private Map<String, Double> itemPrices;

    public OrderManager() {
        this.selectedItems = new HashMap<>();
        this.itemImages = new HashMap<>();
        this.itemPrices = new HashMap<>();
    }

    public void addItem(String item, int count, String imagePath, double price) {
        selectedItems.put(item, count);
        itemImages.put(item, imagePath);
        itemPrices.put(item, price);
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

    public void clearOrder() {
        selectedItems.clear();
        itemImages.clear();
        itemPrices.clear();
    }
}