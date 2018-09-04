package error;

import java.io.Serializable;

/**
 * Created by gomes on 4/25/2016.
 */
public class OTMException extends Exception implements Serializable {

    public OTMException(String string){
        super(string);
    }

    public OTMException(String message, Throwable cause) {
        super(message, cause);
    }

    public OTMException(Throwable exc) {
        super(exc);
    }

}
