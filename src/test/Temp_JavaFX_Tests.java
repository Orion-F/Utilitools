package test;

import javafx.BackupToolGUI;
import javafx.application.Application;
import javafx.stage.Stage;

public class Temp_JavaFX_Tests extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        new BackupToolGUI();
    }
    
}
