package img;

import javafx.CustomStage;
import javafx.scene.image.Image;

/**
 * Class that initializes all of the images used in the library.
 * All images are public, static, and final so that they are 
 * created only once, are immutable, can be used from anywhere in the library.
 * This class was created to consolidate and simplify the loading
 * of images in the library.
 * 
 * @author Orion
 *
 */
public class LoadedImages {
    
    /**
     * Icon used for a minimize button in a title bar.
     * 
     * <br><br><b>Size:</b> 14x14
     */
    public static final Image MINIMIZE_ICON = new Image(
            CustomStage.class.getResourceAsStream("minimizeIcon.png"));
    
    /**
     * Icon used for a close button in a title bar.
     * 
     * <br><br><b>Size:</b> 14x14
     */
    public static final Image CLOSE_ICON = new Image(
            CustomStage.class.getResourceAsStream("closeIcon.png"));

}
