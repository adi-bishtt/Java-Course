import java.util.Scanner;

import java.util.Scanner;
public class EnhancedSwitches {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day ="PizzaDay";

        System.out.print("Enter the day of the week : ");
        day = scanner.nextLine();


        switch(day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("It is a weekday");
            case "Saturday","Sunday" -> System.out.println("It is the weekend");
            default -> System.out.println(day + " is not even a day.");
        }

        scanner.close();



    }
}
