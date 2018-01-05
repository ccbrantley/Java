import java.util.Scanner;
public class forever {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This program will take user input of start/end velocity and time and convert acceleration.");
        System.out.print("Start Velocity: ");
        double StartingVelocity = input.nextDouble();
        System.out.print("End Velocity: ");
        double EndingVelocity = input.nextDouble();
        System.out.print("Duration of Time: ");
        double TimeSpan = input.nextDouble();
        double Acceleration = (EndingVelocity - StartingVelocity) / TimeSpan;
        System.out.println("Acceleration: " + Acceleration);
    }
}
