// Our maximum courses exception
public class TooManySectionException extends Exception {
    public TooManySectionException() {
        this ("Maximum courses exceeded.");
    }
    public TooManySectionException(String message){
        super(message);
    }
}
