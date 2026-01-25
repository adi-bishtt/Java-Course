import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {


        //  JAVA QUIZ GAME ...

        //Questions array[]
        String[] questions = {"Which planet in our solar system is known as the \"Red Planet\" due to the iron oxide on its surface?",
                              "Approximately how long does it take for light from the Sun to reach Earth?",
                              "What is the name of the closest spiral galaxy to our own Milky Way?",
                              "What do astronomers call a massive star that has reached the end of its life and exploded?",
                              "Which planet has the most extensive and visible ring system in our solar system?"};
        //Options array[][]
        String[][] options = {
                {"1. Venus", "2. Mars", "3. Jupiter", "4. Saturn"},
                {"1. 8 seconds", "2. 8 minutes", "3. 8 hours", "4. 8 days"},
                {"1. Andromeda", "2. Sombrero", "3. Triangulum", "4. Whirlpool"},
                {"1. Black Hole", "2. Nebula", "3. Supernova", "4. Red Giant"},
                {"1. Neptune", "2. Uranus", "3. Jupiter", "4. Saturn"}
        };

        //Declare variables
        int[] answer = {2,2,1,3,4};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);


        //Welcome message
        System.out.println("--------------------------------");
        System.out.println("Welcome to Astronomy Quiz Game!");
        System.out.println("--------------------------------");
        //Question loop
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);


            //Options
            for(String option : options[i]){
                System.out.println(option);
            }
            //Guess from user
            System.out.print("Please enter your choice: ");
            guess = scanner.nextInt();

            //Check the guess
            if(guess == answer[i]){
                System.out.println("Correct!");
                score++;
            }else{
                System.out.println("Wrong!");
            }

        }

        //Display the final score
        System.out.println("Your score is " + score + " out of " + questions.length);

        scanner.close();

    }
}
