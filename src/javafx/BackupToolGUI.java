package javafx;

public class BackupToolGUI extends CustomStage {
    
    private final String VERSION = "0.0.1";
    
    private final int WIDTH = 300;
    private final int HEIGHT = 400;
    
    public BackupToolGUI() {
        this.setCustomTitle("BackupToolGUI V" + VERSION);
        this.setResizable(false);
        this.setWidth(WIDTH);
        this.setHeight(HEIGHT);
        this.setTitleBarColor("#363652"); //Purple-ish
        this.setTitleTextColor("#FFFFFF"); //White
        
        this.show();
    }
}
