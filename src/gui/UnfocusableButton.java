package gui;

import javafx.scene.Node;
import javafx.scene.control.Button;

public class UnfocusableButton extends Button {
    
    public UnfocusableButton() {
        super();
    }
    
    public UnfocusableButton(String text) {
        super(text);
    }
    
    public UnfocusableButton(String text, Node graphic) {
        super(text, graphic);
    }
    
    @Override
    public void requestFocus(){
        //Do Nothing
    }
}
