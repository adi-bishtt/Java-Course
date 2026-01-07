import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;


        System.out.print("What Item would you like to buy : ");
        item = scanner.nextLine();

        System.out.print("What is its price of each item: ");
        price = scanner.nextDouble();

        System.out.print("How many quantity of items would you like to buy: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("You have bought " + quantity + " " + item+"/s ");
        System.out.println("Your total is " + currency+ total);
        scanner.close();
    }

}
