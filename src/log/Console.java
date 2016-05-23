package log;

import gui.CustomStage;

public class Console extends CustomStage {
    
    private final int WIDTH = 300;
    private final int HEIGHT = 400;
    
    public Console() {
        this.setCustomTitle("Console");
        this.setResizable(false);
        this.setWidth(WIDTH);
        this.setHeight(HEIGHT);
        this.setTitleBarColor("#363652"); //Purple-ish
        this.setTitleTextColor("#FFFFFF"); //White
        
        this.show();
    }
    
    //All the stuff like println() print() etc.
}
