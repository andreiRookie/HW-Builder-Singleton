package org.example;

public class MainFacade {
    public static void main(String[] args) {
        String a = Integer.toBinaryString(123);
        String b = Integer.toBinaryString(321);

        BinOps binOps = new BinOpsImpl();

        binOps.sum(a, b);
        binOps.mult(a,b);
    }
}