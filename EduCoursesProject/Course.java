public class Course {
    //Our default Constructor
    public Course(){this("", "", "");}
    //Our overloaded Constructor
    public Course(String subject, String number, String name){
        this.subject = subject;
        this.number = number;
        this.name = name;
    }
    // Declaring our private variables
    private String subject, number, name;
    // Our getter/setter methods
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    // Our toString() override
    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
