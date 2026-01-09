import java.util.Scanner;
public class MathClassExercise {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //Hypotenuse c of a right angle triangle


        double side1;
        double side2;
        double side3;

        System.out.print("Enter the Perpendicular : ");
        side1 = scanner.nextDouble();

        System.out.print("Enter the Base : ");
        side2 = scanner.nextDouble();

        double perpendicular = Math.pow(side1, 2);
        double base = Math.pow(side2, 2);

        side3 = Math.sqrt(perpendicular + base);
        System.out.println("Hypotenuse is " + side3 + " cms");

        scanner.close();

    }
}
