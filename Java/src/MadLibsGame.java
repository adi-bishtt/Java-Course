import java.util.Scanner;
public class MadLibsGame {
    public static void main(String[] args) {
        //Mad libs game : Mad Libs is a word game where players fill in blanks in a story with words like nouns, verbs, and adjectives,
        // without knowing the story's context, then read the resulting hilarious, nonsensical story aloud, making it a fun, creative,
        // and educational tool for practicing grammar and vocabulary.

        Scanner scanner =new Scanner(System.in);

         String adjective1;
         String noun1;
         String adjective2;
         String verb1;
         String adjective3;

        System.out.print("Enter the first adjective: ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();
        System.out.print("Enter the second adjective: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter the third adjective: ");
        adjective3 = scanner.nextLine();




        System.out.println("\nToday I was doing MATHS and it was very " + adjective1);
        System.out.println("I wanted to go to " + noun1);
        System.out.println(noun1 + "is somewhat like maths because it is" + adjective1 + "but its also " + adjective2);
        System.out.println("I was " + verb1 + " to " + noun1 + "but then i suddenly saw a " + adjective3 + " cat");

        scanner.close();


    }
}
