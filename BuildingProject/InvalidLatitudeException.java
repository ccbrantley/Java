public class InvalidLatitudeException extends Exception{
    @Override
    // Latitude Exception getMessage override for user knowledge
    public String getMessage() { return "Invalid Value for Latitude..."; }
}
