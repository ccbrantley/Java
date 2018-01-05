import java.util.Scanner;
public class forever {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This program will take numbers and calculate sum of individual digits.");
        System.out.print("Enter Digit: ");
        int digit =  input.nextInt();
        int totalSum = 0;
        while (digit != 0){
            int truncate = digit % 10;
            totalSum += truncate;
            digit /= 10;
        }
        System.out.println("Total Sum: " + totalSum);
    }
}
