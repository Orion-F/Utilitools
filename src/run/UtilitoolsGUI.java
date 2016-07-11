package run;

import gui.CustomStage;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class UtilitoolsGUI extends CustomStage {
    
    private final int WIDTH = 300;
    private final int HEIGHT = 200;
    
    private Label infoLabel;
    
    public UtilitoolsGUI() {
        
        this.setCustomTitle("Utilitools V" + UtilitoolsRunner.getVersion() + " - Library Information");
        this.setResizable(false);
        this.setWidth(WIDTH);
        this.setHeight(HEIGHT);
        this.setTitleBarColor("#999999"); //Grey
        this.setTitleTextColor("#EEEEEE"); //Very light Grey
        
        infoLabel = new Label("Utilitools Library\n" +
                                "Version " + UtilitoolsRunner.getVersion() + "\n" +
                                "\n" +
                                "Orion Forowycz");
        infoLabel.setFont(new Font("Cambria", 30));
        infoLabel.setTextAlignment(TextAlignment.CENTER);
        
        this.setMajor(infoLabel);
        
        this.show();
    }
}
