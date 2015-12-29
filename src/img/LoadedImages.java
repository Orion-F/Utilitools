package img;

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
            LoadedImages.class.getResourceAsStream("minimizeIcon.png"));
    
    /**
     * Icon used for a close button in a title bar.
     * 
     * <br><br><b>Size:</b> 14x14
     */
    public static final Image CLOSE_ICON = new Image(
            LoadedImages.class.getResourceAsStream("closeIcon.png"));
    
    /**
     * Icon used for representing an annotation
     * 
     * <br><br><b>Size:</b> 16x16
     */
    public static final Image ANNOTATION_ICON = new Image(
            LoadedImages.class.getResourceAsStream("annotationIcon.png"));
    
    /**
     * Icon used for representing a class
     * 
     * <br><br><b>Size:</b> 16x16
     */
    public static final Image CLASS_ICON = new Image(
            LoadedImages.class.getResourceAsStream("classIcon.png"));
    
    /**
     * Icon used for representing an empty package
     * 
     * <br><br><b>Size:</b> 16x16
     */
    public static final Image EMPTY_PACKAGE_ICON = new Image(
            LoadedImages.class.getResourceAsStream("emptyPackageIcon.png"));
    
    /**
     * Icon used for representing an enum
     * 
     * <br><br><b>Size:</b> 16x16
     */
    public static final Image ENUM_ICON = new Image(
            LoadedImages.class.getResourceAsStream("enumIcon.png"));
    
    /**
     * Icon used for representing an interface
     * 
     * <br><br><b>Size:</b> 16x16
     */
    public static final Image INTERFACE_ICON = new Image(
            LoadedImages.class.getResourceAsStream("interfaceIcon.png"));
    
    /**
     * Icon used for representing a package
     * 
     * <br><br><b>Size:</b> 16x16
     */
    public static final Image PACKAGE_ICON = new Image(
            LoadedImages.class.getResourceAsStream("packageIcon.png"));
    
    /**
     * Icon used for representing a private method
     * 
     * <br><br><b>Size:</b> 16x16
     */
    public static final Image PRIVATE_METHOD_ICON = new Image(
            LoadedImages.class.getResourceAsStream("privateMethodIcon.png"));
    
    /**
     * Icon used for representing a protected method
     * 
     * <br><br><b>Size:</b> 16x16
     */
    public static final Image PROTECTED_METHOD_ICON = new Image(
            LoadedImages.class.getResourceAsStream("protectedMethodIcon.png"));
    
    /**
     * Icon used for representing a public method
     * 
     * <br><br><b>Size:</b> 16x16
     */
    public static final Image PUBLIC_METHOD_ICON = new Image(
            LoadedImages.class.getResourceAsStream("publicMethodIcon.png"));
    
}
