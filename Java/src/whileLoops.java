import java.sql.SQLOutput;
import java.util.Scanner;
public class whileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String name = "";
//      while(name.isEmpty()){
//          System.out.print("Please enter your name : ");
//          name = scanner.nextLine();
//      }
//
//        System.out.println("Hello " + name);

//        String response = "";
//
//        while(!response.equals("Q")){
//            System.out.println("You are playing a game");
//            System.out.print("Press Q to quit : ");
//            response = scanner.nextLine().toUpperCase();
//        }
//
//        System.out.println("Meh , you are weak");


//        int age = 0;
//
//        System.out.print("Enter your age : ");
//        age = scanner.nextInt();
//
//        do{
//            System.out.println("Your age cannot be negative");
//            System.out.print("Enter your age : ");
//            age = scanner.nextInt();
//        }while(age < 0);
//
//        System.out.println("Your age is " + age);



        int number = 0;

       do{
            System.out.print("Enter a number between 1 and 10 : ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        System.out.println("You picked " + number);

        scanner.close();
    }
}
