import java.util.Scanner;
public class forever {
    public static void main (String[] args){
        System.out.println("Here we will ask the user for the difference between their time and the GMT timezone.");
        System.out.println("We will take the difference and change our output of GMT time to reflect their current time.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Offset amount: ");
        int offset = input.nextInt();
        long TotalMilliSeconds = System.currentTimeMillis();
        long TotalSeconds = TotalMilliSeconds / 1000;
        long CurrentSeconds = TotalSeconds % 60;
        long TotalMinutes = TotalSeconds / 60;
        long CurrentMinutes = TotalMinutes % 60;
        long TotalHours = TotalMinutes / 60;
        long CurrentHours = TotalMinutes % 24;
        System.out.println("Current GMT Time: " + CurrentHours + ":" + CurrentMinutes + ":" + CurrentSeconds);
        CurrentHours += offset;
        System.out.println("Your time is: " + CurrentHours + ":" + CurrentMinutes + ":" + CurrentSeconds);
    }
}
