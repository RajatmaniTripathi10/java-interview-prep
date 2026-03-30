package Factory;

import java.util.Scanner;

interface LoggingFramework {
    void log(String message);
}
enum LoggingType {
    CONSOLE, FILE, DATABASE
}
class ConsoleLogger implements LoggingFramework {
    public void log(String message) {
        System.out.println("Logging to console: " + message);
    }
}

class FileLogger implements LoggingFramework {
    public void log(String message) {
        System.out.println("Logging to file: " + message);
    }
}

class DatabaseLogger implements LoggingFramework {
    public void log(String message) {
        System.out.println("Logging to database: " + message);
    }
}
class LoggingFactory {
    public static LoggingFramework getLogger(LoggingType type) {
        if(type == null) return null;
        switch (type) {
            case CONSOLE:
                return new ConsoleLogger();
            case FILE:
                return new FileLogger();
            case DATABASE:
                return new DatabaseLogger();
            default:
                throw new IllegalArgumentException("Invalid logging type");
        }
    }
}

public class LoggingFrameworkMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a logging type: CONSOLE, FILE or DATABASE");

        String s = sc.next();
        try {
            LoggingType type = LoggingType.valueOf(s.toUpperCase());
            LoggingFramework logger = LoggingFactory.getLogger(type);

            if (logger != null) {
                logger.log("This is a log message.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid logging type. Please choose CONSOLE, FILE or DATABASE.");
        }
    }
}
