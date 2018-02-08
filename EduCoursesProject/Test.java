import java.util.Scanner;

/*
Christopher Brantley
12/5/2017
This is my original work.
 */
public class Test {
    public static void main (String [] args) {
// Creating our input, our string variables and our int variable
        Scanner input = new Scanner(System.in);
        String id, firstName, lastName, street, city, state, zip;
        int age;
        // Student: id, firstName, lastName, age, Address address
        // Address: street, city, state, zip
        // Getting all of our information
        System.out.print("ID: ");
        id = input.nextLine();
        System.out.print("First Name: ");
        firstName = input.nextLine();
        System.out.print("Last Name: ");
        lastName = input.nextLine();
        System.out.print("Age: ");
        age = input.nextInt();
        input.nextLine();
        System.out.print("Street: ");
        // Clearing our buffer
        street = input.nextLine();
        System.out.print("City: ");
        city = input.nextLine();
        System.out.print("State: ");
        state = input.nextLine();
        System.out.print("Zip: ");
        zip = input.nextLine();
        // Creating our classes
        Address address = new Address(street, city, state, zip);
        Student user = new Student(id, firstName, lastName, age, address);
        DataStore d1 = DataStore.getInstance();
        System.out.println(user.toString());
        // Storing our data from our singleton in our test class
        Section[] data_store = d1.getSections();
        // Creating a counter variable
        int i = 1;
        // For each loop for our menu driven program// relating position with classes for applicable signup
        for (Section s : data_store){
            System.out.println(i++ + ": " + s.toString());

        }
        // Starting off at -1 for a while loop to quit on the presence of 0
        // Otherwise we will loop and then print out our exception errors when needed for
        // Duplicates and on the occurence that too many sections are signed up for
        int k = -1;
        System.out.println("Enter 0 anytime to display schedule and exit program.");
        while (k != 0) {
            System.out.println("Enter course 1-15 to register: ");
            k = input.nextInt();
            try{
                user.addSection(data_store[k]);
            } catch (TooManySectionException tm) {
                System.out.println(tm.getMessage());
            }catch (SecondSectionException se){
                System.out.println(se.getMessage());
            }

        }
        // Print our information
        System.out.println(user.toString());

    }
}
