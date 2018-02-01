import java.util.Arrays;
public class Student extends Person {
    private int numberEnrolled = 0;
    //Our default Constructor
    public Student() { this ("","","",0, new Address()); }
    //Our overloaded Constructor
    public Student(String id, String firstName, String lastName, int age, Address address) {
        super(firstName, lastName, age, address);
        this.id = id;
        for (int i = 0; i < section.length; i++){ section[i] = new Section(); }
    }
    // Declaring our variable, and array
    String id;
    Section [] section = new Section[5];
    // Our getter/setter methods
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
// Our method to add sections to our array
    // Include Try/catch blocks to ensure no similar (courses && subject)
    public void addSection(Section c) throws TooManySectionException, SecondSectionException {
        try {
            for (int i = 0; i < numberEnrolled; i++){
                if (section[i].getSubject().equals(c.getSubject()) && section[i].getNumber().equals(c.getNumber())) {
                    throw new SecondSectionException("Duplicate Course: ", c);
                }
            }
            section[numberEnrolled] = c;
            numberEnrolled++;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new TooManySectionException();
        }
    }
    // Our toString() override
    @Override
    public String toString() {
        String sectionList="";
        for (Section x: section){sectionList += "\n" + x.toString(); }
        return "Student{" +
                super.toString() +
                "id='" + id + '\'' +
                ", sections=" + sectionList +
                '}';
    }
}
