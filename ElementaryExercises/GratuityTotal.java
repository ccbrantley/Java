import java.util.Scanner;
public class forever {
    public static void main(String[] args){
        System.out.println("Here we will calculate tip with output of gratuity amount and total bill.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter SubTotal: ");
        double SubTotal = input.nextDouble();
        System.out.print("Enter Gratuity Rate(.08): ");
        double GratuityRate = input.nextDouble();
        double Gratuity = GratuityRate * SubTotal;
        double Total = Gratuity + SubTotal;
        System.out.println("Gratuity: " + Gratuity);
        System.out.println("Total: " + Total);
    }
}
