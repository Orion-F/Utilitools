package img;

import java.io.InputStream;

import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;

public class SafeImage {
    
    Image image;
    
    /**
     * Constructs a SafeImage of the image file at the given path.
     * This constructor skips giving a width and height.
     * Therefore, if the image is not found, then the there will be a
     *  empty image of size 1x1 pixels in its place.
     * 
     * @param path - the String representation of the path of the image file
     */
    public SafeImage(String path) {
        this(path, 1, 1);
    }
    
    /**
     * Constructs a SafeImage of the image file at the given path.
     * If the image is not found, a blank backup image will be created in
     *  its place with the given width and height.
     * 
     * @param path - the String representation of the path of the image file
     * @param width - an integer to be the width of the backup image.
     * @param height - an integer to be the height of the backup image.
     */
    public SafeImage(String path, int width, int height) {
        InputStream imageStream = SafeImage.class.getResourceAsStream(path);
        if (imageStream != null) {
            image = new Image(SafeImage.class.getResourceAsStream(path));
        } else {
            image = new WritableImage(width, height);
        }
    }
    
    /**
     * Returns the Image object held by this SafeImage
     * 
     * @return an Image object
     */
    public Image get() {
        return image;
    }
}
