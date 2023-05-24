package org.example.singleton.filter;

import org.example.singleton.ILogger;
import org.example.singleton.LoggerDC;
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

        List<Integer> result = source.stream()
                .filter( integer -> integer < threshold)
                .toList();

        logger.log("Прошло фильтр " + result.size() + "элемента(ов) из " + source.size());

        return result;
    }
}
