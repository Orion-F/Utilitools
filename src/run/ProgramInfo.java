package run;

public class ProgramInfo {
    
    private static String name = "";
    private static String author = "";
    private static String version = "";
    
    private ProgramInfo() {
        //Do Nothing
    }
    
    public static void set(String name, String version, String author) {
        ProgramInfo.name = name;
        ProgramInfo.version = version;
        ProgramInfo.author = author;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        ProgramInfo.name = name;
    }
    
    public static String getVersion() {
        return version;
    }

    public static void setVersion(String version) {
        ProgramInfo.version = version;
    }

    public static String getAuthor() {
        return author;
    }

    public static void setAuthor(String author) {
        ProgramInfo.author = author;
    }
}
