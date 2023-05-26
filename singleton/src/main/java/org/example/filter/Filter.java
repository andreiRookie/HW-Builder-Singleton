package org.example.filter;

import org.example.ILogger;
import org.example.LoggerDC;

import java.util.List;

public class Filter implements IFilter<Integer> {
    private int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public List<Integer> filterOut(List<Integer> source) {
        ILogger logger = LoggerDC.getInstance();
        logger.log("Запускаем фильтрацию");

        source.forEach(i -> logger.log("Элемент " + i + ((i < threshold) ? " проходит" : " не проходит")));

        List<Integer> result = source.stream()
                .filter( integer -> integer < threshold)
                .toList();

        logger.log("Фильтр прошло " + result.size() + " элемента(ов) из " + source.size());

        return result;
    }
}
