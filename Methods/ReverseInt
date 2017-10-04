/* Reverse Integer from
  User input*/
import java.util.Scanner;
public class ReverseInt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Integer: ");
        int userInput = input.nextInt();
        int inputLength = Integer.toString(userInput).length();
        int old_digit = userInput;
        int new_digit = 0;
        int digit;
        for(int i = 0; i < inputLength; i++){
            digit = old_digit % 10;
            new_digit *= 10;
            new_digit += digit;
            old_digit /= 10;
        }
        System.out.println("Reversed Integer: " + new_digit);
    }
}
