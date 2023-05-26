package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerDC implements ILogger {
    private int counter;
    private final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    private LoggerDC(){}

    private static volatile LoggerDC instance;

    public static LoggerDC getInstance() {
        if (instance == null) {
            synchronized (LoggerDC.class) {
                if (instance == null) {
                    instance = new LoggerDC();
                }
            }
        }
        return instance;
    }

    @Override
    public void log(String msg) {
        System.out.println("[" + TIME_FORMATTER.format(LocalDateTime.now()) +
                " " + (++counter) + "] " + msg);
    }
}
