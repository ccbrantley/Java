import java.util.Scanner;
public class forever {
    public static void main(String[] args){
        System.out.println("We will convert Celsius to Fahrenheit");
        System.out.print("Celsius: ");
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        double fahrenheit = (9.0/5) * celsius + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
