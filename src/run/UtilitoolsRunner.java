package run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javafx.application.Application;
import javafx.stage.Stage;

public class UtilitoolsRunner extends Application {
    public static void main(String[] args) {
        initVersion();
        launch(args);
    }
    
    private static String version = "???";

    @Override
    public void start(Stage arg0) throws Exception {
        new UtilitoolsGUI();
    }
    
    private static void initVersion() {
        InputStream versionStream = UtilitoolsRunner.class.getResourceAsStream("/run/VERSION.txt");
        if (versionStream != null) {
            BufferedReader versionReader = new BufferedReader(new InputStreamReader(versionStream));
            try {
                version = versionReader.readLine();
            } catch (IOException e) {
                //Do nothing
            }
        }
    }
    
    public static String getVersion() {
        return version;
    }
}
