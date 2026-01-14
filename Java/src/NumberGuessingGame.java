import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max + 1);


        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between 1 and %d-%d\n", min,max);

        do{
            System.out.print("Enter a guess : ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW , TRY AGAIN");
            }else if(guess > randomNumber){
                System.out.println("TOO HIGH, TRY AGAIN");
            }else{
                System.out.println("You guessed Correctly , The number is " + guess);
                System.out.println("# of attempts : " + attempts);
            }

        }while(guess != randomNumber);

        System.out.println("You have won");






        scanner.close();
    }
}
