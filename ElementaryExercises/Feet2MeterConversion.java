import java.util.Scanner;
public class forever {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Here we will convert feet to meters.");
        System.out.print("Enter Feet: ");
        double feet = input.nextDouble();
        double meters = feet * .305;
        System.out.println("Meters: " + meters);
    }
}
