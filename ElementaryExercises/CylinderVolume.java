import java.util.Scanner;
public class forever {
    public static void main(String[] args){
        System.out.println("Here we will calculate volume of a cylinder from user input");
        Scanner input = new Scanner(System.in);
        System.out.println("Cylinder Radius: ");
        double radius = input.nextDouble();
        System.out.println("Cylinder Length: ");
        double length = input.nextDouble();
        double CylinderArea = radius * radius * 3.14;
        double CylinderVolume = CylinderArea * length;
        System.out.println("Cylinder Area: " + CylinderArea);
        System.out.println("Cylinder Volume: " + CylinderVolume);
    }

}
