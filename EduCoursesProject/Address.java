public class Address {
    //Our default Constructor
    public Address(){ this ("", "", "", ""); }
    //Our overloaded Constructor
    public Address(String street, String city, String state, String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;}

    // Declaring our private variables
    private String street, city, state, zip;
    // Our getter/setter methods
    public String getStreet(){
        return street;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }
    public String getZip(){
        return zip;
    }
    public void setZip(String zip){
        this.zip = zip;
    }
    // Our toString() override
    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
