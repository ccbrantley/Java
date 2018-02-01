public class Building {
    // Creating our private variables
    private String campus, name, imageName, buildingCode;
    private Coordinate coordinate;
    // Our Overloaded constructor
    public Building(String campus, String name, Coordinate coordinate, String imageName ,String buildingCode){
        this.campus = campus;
        this.name = name;
        this.imageName = imageName;
        this.buildingCode = buildingCode;
        this.coordinate = coordinate;
    }
    // Our mutator methods
    public void setCampus (String campus){ this.campus = campus;}
    public void setName (String name){this.name = name;}
    public void setImageName (String imageName){ this.imageName = imageName;}
    public void setBuildingCode (String buildingCode){this.buildingCode = buildingCode;}
    public void setCoordinate(Coordinate coordinate){this.coordinate = coordinate;}
    //throws keyword to declare our expected exceptions
    public void setLatitude(double latitude) throws InvalidLatitudeException {
        try {
            this.coordinate.setLatitude(latitude);
            // If we catch our exception we will throw it to our calling method, looking for our handler
        } catch (InvalidLatitudeException e) {
            throw new InvalidLatitudeException();
        }
    }
    //throws keyword to declare our expected exceptions
    public void setLongitude(double longitude) throws InvalidLongitudeException {
        try {
            this.coordinate.setLongitude(longitude);
            // If we catch our exception we will throw it to our calling method, looking for our handler
        } catch (InvalidLongitudeException e) {
            throw new InvalidLongitudeException();
        }
    }
    // Our accessor methods
    public String getCampus(){ return this.campus;}
    public String getName() { return this.name;}
    public String getImageName(){return this.imageName;}
    public String getBuildingCode(){return this.buildingCode;}
    public Coordinate getCoordinate(){return this.coordinate;}
    // Our overridden toString method with custom formatting
    @Override
    public String toString() {
        String output = name + " (" + buildingCode + "), " + campus + coordinate + "\n" + imageName;
        return output;
    }
}
