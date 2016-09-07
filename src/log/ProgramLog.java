package log;

import java.awt.CheckboxMenuItem;
import java.time.LocalDate;
import java.util.ArrayList;

import gui.CustomStage;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import run.ProgramInfo;

public class ProgramLog extends CustomStage {
    
    private static final ProgramLog PROGRAM_LOG = new ProgramLog();
    
    private final int WIDTH = 500;
    private final int HEIGHT = 300;
    
    private LocalDate date;
    private static ArrayList<LogEntry> logEntries;
    
    private MenuBar menuBar;
    private Menu showMenu;
    private CheckboxMenuItem[] showCheckboxMenuItems;
    
    private static boolean isVisibleAfterNewLogEntry = false;
    
    private ProgramLog() {
        date = LocalDate.now();
        
        this.setCustomTitle(ProgramInfo.getName() + " Program Log: " + date);
        this.setResizable(false);
        this.setWidth(WIDTH);
        this.setHeight(HEIGHT);
        this.setTitleBarColor("#000000"); //black
        this.setTitleTextColor("#FFFFFF"); //White
        
        
        //Menu init
        
        //Table init
        
    }
    
    public static void log(LogType logType, String message) {
        logEntries.add(new LogEntry(logType, message));
        
        //Add to table
        
        if (isVisibleAfterNewLogEntry) {
            setVisible(true);
        }
    }
    
    private void refreshTable() {
        
    }
    
    public static void setVisible(boolean isVisible) {
        if (isVisible) {
            PROGRAM_LOG.show();
        } else {
            PROGRAM_LOG.hide();
        }
    }

    public static void setVisibleAfterNewLogEntry(
            boolean isVisibleAfterNewLogEntry) {
        ProgramLog.isVisibleAfterNewLogEntry = isVisibleAfterNewLogEntry;
    }
}
