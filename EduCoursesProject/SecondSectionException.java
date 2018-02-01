// Example Exception
// Overloaded case scenario
public class SecondSectionException extends Exception{
    public SecondSectionException(String message, Section c){
        super(message + " " + c.getSubject() + " " + c.getNumber());
    }
}
