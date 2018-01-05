import java.util.Scanner;
public class forever {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Here we will calculate the Joules of energy required to create user observed temperature change.");
        System.out.print("Weight in Kilo's: ");
        double KiloWeight = input.nextDouble();
        System.out.print("Final Temperature: (C)");
        double FinalTemp = input.nextDouble();
        System.out.print("Initial Temperature: (C)");
        double InitialTemp = input.nextDouble();
        double Energy = KiloWeight * (FinalTemp - InitialTemp) * 4184;
        System.out.println("Energy: " + Energy + " Joules");
    }
}
