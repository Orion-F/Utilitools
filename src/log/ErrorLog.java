package log;

public class ErrorLog extends Console {

    private static ErrorLog errorLog;
    
    private ErrorLog() {
        
    }
    
    public static void log() {
        initIfNeeded();
        
    }
    
    private static void initIfNeeded() {
        if (errorLog == null) {
            errorLog = new ErrorLog();
        }
    }
}
