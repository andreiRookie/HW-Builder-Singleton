package org.example.singleton;

import java.util.Random;
import java.util.Scanner;

public class MainSingleton {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ILogger logger = LoggerDC.getInstance();

        logger.log("Запускаем программу");

        while (true) {

        }

    }
}
