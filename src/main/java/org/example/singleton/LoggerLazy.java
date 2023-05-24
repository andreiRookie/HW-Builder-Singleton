package org.example.singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerLazy implements ILogger {
    private int counter;
    private final DateTimeFormatter DT_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private LoggerLazy() { }

    private static class LoggerHolder {
        private static final LoggerLazy INSTANCE = new LoggerLazy();

    }

    public static LoggerLazy getInstance() {
        return LoggerHolder.INSTANCE;
    }
    @Override
    public void log(String msg) {
        System.out.println("[" + DT_FORMATTER.format(LocalDateTime.now()) +
                (++counter) + "] " + msg);
    }
}
