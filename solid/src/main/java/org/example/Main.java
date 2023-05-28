package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();
        products.put("Хлеб", 56);
        products.put("Масло", 153);
        products.put("Колбаса", 211);
        products.put("Пирожок", 45);

        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        printProducts(products);
//        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
//            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
//        }

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
//        Purchase purchase = new Purchase();

        PurchaseCart purchaseCart = new PurchaseCart(products.size());

        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
//            purchase.addPurchase(product, count);

            purchaseCart.addPurchase(new Purchase(product,count));
        }
//        long sum = purchase.sum(products);
        long sum = purchaseCart.sum(products);

        purchaseCart.printPurchases(products);

        System.out.println("ИТОГО: " + sum);
    }

    private static void printProducts(HashMap<String, Integer> products) {
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }
}