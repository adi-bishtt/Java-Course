import java.util.Scanner;

import java.util.Scanner;
public class userInputInArrays {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String[] food;
        int size;

        System.out.print("What # of food do you want? : ");
        size = scanner.nextInt();
        scanner.nextLine();

        food = new String[size];


        for(int i = 0; i < food.length; i++){
            System.out.print("Enter a food : ");
            food[i] = scanner.nextLine();
        }

        for(String foods : food){
            System.out.println(foods);
        }

        scanner.close();

    }
}
