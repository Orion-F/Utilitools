package log;

import java.time.LocalTime;

public class LogEntry {

    private LocalTime time;
    private LogType logType;
    private String message;
    
    public LogEntry(LogType logType, String message) {
        time = LocalTime.now();
        this.logType = logType;
        this.message = message;
    }

    public LocalTime getTime() {
        return time;
    }

    public LogType getLogType() {
        return logType;
    }

    public String getMessage() {
        return message;
    }
}
