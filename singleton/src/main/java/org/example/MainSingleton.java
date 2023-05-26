package org.example;

import org.example.filter.Filter;
import org.example.filter.IFilter;

import java.util.*;

public class MainSingleton {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ILogger logger = LoggerDC.getInstance();
        Random random = new Random();

        logger.log("Запускаем программу");
        logger.log("Введите сначала размер списка, потом верхнюю границу значений");

        int size = Integer.parseInt(scanner.nextLine());
        logger.log("Размер:" + size);
        int maxInt = Integer.parseInt(scanner.nextLine());
        logger.log("Граница:" + maxInt);

        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(maxInt));
        }
        logger.log("Сгенерированный список: ");
        list.forEach(element -> System.out.print(" " + element));
        System.out.println();

        logger.log("Введите порог для фильтра");
        int threshold = Integer.parseInt(scanner.nextLine());
        logger.log("Порог для фильтра: " + threshold);

        IFilter<Integer> filter = new Filter(threshold);
        List<Integer> filteredList = filter.filterOut(list);

        logger.log("Отфильтрованный список: ");
        filteredList.forEach(element -> System.out.print(" " + element));
        System.out.println();

        logger.log("Завершаем программу");
    }
}
