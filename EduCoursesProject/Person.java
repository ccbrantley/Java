public class Person {
//Our default Constructor
public Person(){ this ("", "", 0, new Address());}
//Our overloaded Constructor
public Person(String firstName, String lastName, int age, Address address){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.address = address;
}
// Declaring our private variables
    private String firstName, lastName;
    private int age;
    private Address address;
// Our getter/setter methods
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Address getAddress(){
        return address;
    }
    public void setAddress(Address address){
        this.address = address;
    }
// Our toString() override
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
