/**
 * Christopher Brantley
 * 1/31/2018
 * This is my original work.
 * For CSC 251, Rebecca Halsey
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // We create our two file objects  with our FoodProduct and CleaningProduct text files
        File foodInput = new File("src/FoodProduct");
        File cleaningInput = new File("src/CleaningProduct.txt");
        // Our scanner object "input" which we will use to first read our foodInput file
        // Later we will re-use this scanner for our cleaningInput file
        Scanner input = new Scanner("");
        // Our try statement attempts to read in our foodInput file with our scanner
        // If we receive an FileNotFound Exception we will print our stack trace report
        try {
            input = new Scanner(foodInput);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Data Attributes for our Food Product portion of program
        ArrayList<FoodProduct> foodProducts = new ArrayList<>();
        String name;
        int sku, refrigerationTemp, servingSize, caloriesPerServing;
        double price;
        Date expDate = new Date();
        // Here is our sequential list based on our text file
        //name, sku, price, date, refrigerationTemp, servingSize, caloriesPerServing, allergens
        // While we are still receiving data, in this scenario lines, We will create three tool variables
        // Our allergens, temporary, product string are declared/defined/initialized
        // Our temporary string brings in our next line and then we use our split method to...
        // Separate it's contents by it's ',' values
        // We then assign individual index values of our product string to our variables
        // When we get to ur date we will set up a date formatter...
        // Attempt to format the retrieved date and if not we will print our Stack Trace report
        // We also see multiple parsing methods in this code respective of our original data declarations
        while (input.hasNextLine()) {
            ArrayList<String> allergens = new ArrayList<>();
            String temporary = input.nextLine();
            String[] product = temporary.split(",");
            name = product[0];
            sku = Integer.parseInt(product[1]);
            price = Double.parseDouble(product[2]);
            String testDate = product[3];
            DateFormat formatter = new SimpleDateFormat("MM/yyyy");
            try {
                expDate = formatter.parse(testDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            refrigerationTemp = Integer.parseInt(product[4]);
            servingSize = Integer.parseInt(product[5]);
            caloriesPerServing = Integer.parseInt(product[6]);
            // This for loop will iterate while i is less then product.length
            // For any index's found at index 7 and beyond we will add them to our product array
            for (int i = 7; i < product.length; i++) {
                allergens.add(product[i]);
            }

            // This list once again stays as a reminder of proper ordering of our variables
            // name, sku, price, date, refrigerationTemp, servingSize, caloriesPerServing, allergens
            // We will add FoodProduct objects into our array as we finish our finish iterations of our while loop
            foodProducts.add(new FoodProduct(name, sku, price, expDate, refrigerationTemp, servingSize, caloriesPerServing, allergens));
        }
        // Our for each loop to print out each of our foodProduct objects in our array
        // We will call our toString methods
        for (FoodProduct b : foodProducts) {
            System.out.println(b.toString());
        }
        // Our Cleaning Product array list to store our CleaningProduct objects
        ArrayList<CleaningProduct> cleaningProduct = new ArrayList<>();
        // Here is our attempt at reading in our cleaningInput file object
        // This time if we catch our FileNotFoundException we will print our Stack Trace report..
        // And then end the program
        try {
            input = new Scanner(cleaningInput);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }
        String chemicalName, hazards, precautions, firstAid;
        //name, sku, price, chemicalName, hazards, precautions, firstAid, uses
        // Here is our sequential list base on our text file
        // While we are still receiving data lines, in this scenario, We will create three tool variables
        // Our uses, temporary, product string are declared/defined/initialized
        // Our temporary string brings in our next line and then we use our split method to...
        // Separate it's contents by it's ',' values
        // We then assign individual index values of our product string to our variables
        while (input.hasNextLine()) {
            ArrayList<String> uses = new ArrayList<>();
            String temporary = input.nextLine() + input.nextLine() + input.nextLine();
            String[] product = temporary.split(",");
            name = product[0];
            sku = Integer.parseInt(product[1]);
            price = Double.parseDouble(product[2]);
            chemicalName = product[3];
            hazards = product[4];
            precautions = product[5];
            firstAid = product[6];
            // This for loop will iterate while i is less then product.length
            // For any index's found at index 7 and beyond we will add them to our product array
            for (int i = 7; i < product.length; i++) {
                uses.add(product[i]);
            }
            //name, sku, price, chemicalName, hazards, precautions, firstAid, uses
            // Our ordered list once again to serve as a reminder of proper list order
            cleaningProduct.add(new CleaningProduct(name, sku, price, chemicalName, hazards, precautions, firstAid, uses));
        }
        // Here we will finish up our program by printing our toString() method for our objects...
        // In our CleaningProduct Array
        for (CleaningProduct b : cleaningProduct) {
            System.out.println(b.toString());
        }
    }
}
