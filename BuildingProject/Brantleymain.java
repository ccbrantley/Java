/*
Christopher Brantley
This is my original work.
1/16/2018
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    // Required package imports
public class BrantleyMain {
    // Inclusion of File Not Found Error Message
    public static void main(String []args) throws FileNotFoundException{
    // Creating our ArrayList, creating our file and passing it into our scanner
        List<Building> buildings = new ArrayList<>();
            File fileInput = new File("src/BuildingData.txt");
            Scanner input = new Scanner(fileInput);
            Scanner userInput = new Scanner(System.in);
    // While loop to iterate over each line we loaded into our input scanner
        while (input.hasNextLine()) {
            // Respective of position we create our variables, converting string to float as needed
            boolean instanceRaised = false;
            String campus = input.next();
            String name = input.next();
            double latitude = Double.parseDouble(input.next());
            double longitude = Double.parseDouble(input.next());
            String imageName = input.next();
            String buildingCode = input.next();
            // Do while loop to create our objects in our array list... until we trigger our instanceRaised as true
            // We will try adding our object and if we catch latitude/longitude exceptions we will print...
            // Our base message from our  exception class and also the identifying information for our error message
            // We will raise true on either/or and skip adding that array all-together
            do {
                try {
                    // We create our building object and then add that to our array list
                    buildings.add(new Building(campus, name, new Coordinate(latitude, longitude), imageName, buildingCode));
                    instanceRaised = true;
                } catch (InvalidLatitudeException e) {
                    System.out.print(e.getMessage() + "\nLocation: " + campus + ", " + name + "\n\n");
                    instanceRaised = true;
                } catch (InvalidLongitudeException e) {
                    System.out.print(e.getMessage() + "\nLocation: " + campus + ", " + name + "\n\n ");
                    instanceRaised = true;
                }
            } while (instanceRaised == false);
        }
    // To finish our program we will make use of a for each loop to iterate over each building's toString()
        for (Building b: buildings){ System.out.println(b.toString() + "\n"); }
    }
}
