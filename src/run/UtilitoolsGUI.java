package run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import gui.CustomStage;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class UtilitoolsGUI extends CustomStage {
    
    private final int WIDTH = 300;
    private final int HEIGHT = 200;
    
    private Label infoLabel;
    
    public UtilitoolsGUI() {
        InputStream versionStream = UtilitoolsGUI.class.getResourceAsStream("/run/VERSION.txt");
        String version = "???";
        if (versionStream != null) {
            BufferedReader versionReader = new BufferedReader(new InputStreamReader(versionStream));
            try {
                version = versionReader.readLine();
            } catch (IOException e) {
                //Do nothing
            }
        }
        this.setCustomTitle("Utilitools V" + version + " - Library Information");
        this.setResizable(false);
        this.setWidth(WIDTH);
        this.setHeight(HEIGHT);
        this.setTitleBarColor("#999999"); //Grey
        this.setTitleTextColor("#EEEEEE"); //Very light Grey
        
        infoLabel = new Label("Utilitools Library\n" +
                                "Version " + version + "\n" +
                                "\n" +
                                "Orion Forowycz");
        infoLabel.setFont(new Font("Cambria", 30));
        infoLabel.setTextAlignment(TextAlignment.CENTER);
        
        this.setMajor(infoLabel);
        
        this.show();
    }
}