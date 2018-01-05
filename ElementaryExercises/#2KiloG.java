import java.util.Scanner;
public class forever {
    public static void main(String[] args){
        System.out.println("Here we will convert pounds into kilograms.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter pounds: ");
        double pounds = input.nextDouble();
        double kilograms = pounds * .454;
        System.out.println("Kilograms: " + kilograms);
    }
}
