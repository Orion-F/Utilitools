package log;

import gui.CustomStage;

public class Console extends CustomStage {
    
    private final int WIDTH = 500;
    private final int HEIGHT = 300;
    
    
    
    public Console() {
        this.setCustomTitle("Console");
        this.setResizable(false);
        this.setWidth(WIDTH);
        this.setHeight(HEIGHT);
        this.setTitleBarColor("#000000"); //black
        this.setTitleTextColor("#FFFFFF"); //White
        
        
        
        
        this.show();
    }
    
    //All the stuff like println() print() etc.
}
