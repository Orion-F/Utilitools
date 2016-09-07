package log;

public enum LogType {
    ERROR(true),
    UTILITOOLS(false),
    INFO(true),
    CUSTOM(true);
    
    private LogType(boolean defaultShow) {
        
    }
}
