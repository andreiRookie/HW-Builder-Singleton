package org.example;

import java.util.Map;

public class PurchaseCart {

    protected Purchase[] purchases;

    public PurchaseCart() {}

    public PurchaseCart(Purchase[] purchases) {
        this.purchases = purchases;
    }

    public PurchaseCart(int productTypesCount) {
        this.purchases = new Purchase[productTypesCount];
    }

    public void addPurchase(Purchase purchase) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = purchase;
                return;
            }
            if (purchases[i].title.equals(purchase.title)) {
                purchases[i].count += purchase.count;
                return;
            }
        }
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = purchases[i];
            if (purchase == null) continue;
            int purchaseCost = getPurchaseCost(purchase.count, prices.get(purchase.title));
            sum += purchaseCost;
        }
        return sum;
    }

    public void printPurchases(Map<String, Integer> prices) {
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = purchases[i];
            if (purchase == null) continue;
            int purchaseCost = getPurchaseCost(purchase.count, prices.get(purchase.title));
            System.out.println("\t" + purchase.title + " " +
                    purchase.count + " шт. в сумме " + purchaseCost + " руб.");
        }
    }

    private int getPurchaseCost(int count, int price) {
        return count * price;
    }

    public Purchase[] getPurchases() {
        return purchases;
    }

    public void setPurchases(Purchase[] purchases) {
        this.purchases = purchases;
    }
}
