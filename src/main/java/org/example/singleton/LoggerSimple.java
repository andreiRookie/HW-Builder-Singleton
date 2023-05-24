package org.example.singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerSimple implements ILogger {

    private int counter;
    private final DateTimeFormatter DT_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private static LoggerSimple instance;

    private LoggerSimple() {}

    public static LoggerSimple getInstance() {
        if (instance == null) {
            instance = new LoggerSimple();
        }
        return instance;
    }
    @Override
    public void log(String msg) {
        System.out.println("[" + DT_FORMATTER.format(LocalDateTime.now()) +
                " " + (++counter) + "] " + msg);
    }
}
