//I made this myself , soo the code might not be the most efficient !
import java.util.Scanner;
public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Calculate the area of a rectangle ...

        System.out.print("Enter the height of your rectangle in cms: ");
        double height = scanner.nextDouble();

        System.out.print("Enter the width of your rectangle in cms: ");
        double width = scanner.nextDouble();

        System.out.println("The area of the rectangle is " + height * width + "cm^2");

        scanner.close();

    }
}
