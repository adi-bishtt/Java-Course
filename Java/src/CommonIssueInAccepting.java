import  java.util.Scanner;
public class CommonIssueInAccepting {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your Fav. Color : ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " you like the color " + color);

        scanner.close();

    }
}
