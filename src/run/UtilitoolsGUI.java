package run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import gui.CustomStage;

public class UtilitoolsGUI extends CustomStage {
    
    private final int WIDTH = 500;
    private final int HEIGHT = 400;
    
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
        
        this.show();
    }
}
