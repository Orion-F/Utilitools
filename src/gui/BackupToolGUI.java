package gui;

public class BackupToolGUI extends CustomStage {
    
    private final int WIDTH = 300;
    private final int HEIGHT = 400;
    
    public BackupToolGUI() {
        this.setCustomTitle("BackupToolGUI");
        this.setResizable(false);
        this.setWidth(WIDTH);
        this.setHeight(HEIGHT);
        this.setTitleBarColor("#363652"); //Purple-ish
        this.setTitleTextColor("#FFFFFF"); //White
        
        this.show();
    }
}
