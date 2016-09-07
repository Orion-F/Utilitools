package run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class VersionReader {
    
    private static String version = "???";
    
    private VersionReader() {}
    
    /**
     * Grabs the version file with the given name using any
     *  given class in the same package
     * 
     * @param anchor - any class in the same package
     * @param name - the String name of the version file, including file extension
     * @throws VersionFileNotFoundException 
     */
    public static void use(Class<?> anchor, String name) {
        InputStream versionStream = anchor.getResourceAsStream("/" + anchor.getPackage().getName() + "/" + name);
        if (versionStream != null) {
            BufferedReader versionReader = new BufferedReader(new InputStreamReader(versionStream));
            try {
                version = versionReader.readLine();
                ProgramInfo.setVersion(version);
            } catch (IOException e) {
                
            }
        }
    }
    
    /**
     * Grabs the version file with the name "VERSION.txt" using any
     *  given class in the same package
     *  
     * @param anchor - any Class in the same package
     */
    public static void useDefault(Class<?> anchor) {
        use(anchor, "VERSION.txt");
    }
    
    /**
     * Returns the Version String of this program, given by the
     * version file assigned to this class.
     * If the version file path is not set or the file is not found,
     *  it will default to "???".
     * 
     * @return a String object
     */
    public static String get() {
        return version;
    }
}
