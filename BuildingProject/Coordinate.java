public class Coordinate {
    private double latitude, longitude;
    //throws keyword to declare our expected exceptions
    public Coordinate(double latitude, double longitude) throws InvalidLongitudeException, InvalidLatitudeException {
        // Input our latitude, longitude straight into our setter methods since we are re-using logic
        setLatitude(latitude);
        setLongitude(longitude);
    }
// Getters and Accessers
    public double getLatitude() { return latitude; }
    //throws keyword to declare our expected exceptions
    public void setLatitude(double latitude) throws InvalidLatitudeException {
        // Our required filter of 34-36 degrees of latitude
        if (latitude >= 34 && latitude <= 36) {
            this.latitude = latitude;
        } else {
            // Throw our exception to the calling method, looking for it's handler
            throw new InvalidLatitudeException();
        }
    }
    public double getLongitude() { return longitude; }
    //throws keyword to declare our expected exceptions
    public void setLongitude(double longitude) throws InvalidLongitudeException {
        // Our required filter of -78 - -80 degrees of longitude
        if (longitude >= -80 && longitude <= -78) {
            this.longitude = longitude;
        } else {
            // Throw our exception to the calling method, looking for it's handler
            throw new InvalidLongitudeException();
        }
    }
    @Override
    // Our overridden to String() method with our latitude/longitude information
    public String toString() {
        String output = ("\nLatitude: " + latitude + "\nLongitude: " + longitude);
        return output;

    }
}
