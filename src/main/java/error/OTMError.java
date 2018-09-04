package error;

public class OTMError {
    public enum Level {Warning,Error}
    String description;
    Level mylevel;
    public OTMError(String description, Level mylevel){
        this.description = description;
        this.mylevel = mylevel;
    }
}