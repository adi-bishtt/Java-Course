import java.util.Scanner;
public class ifNesting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        boolean isStudent;
        boolean isSenior;


        System.out.print("Are you a Student (true/false)? ");
        isStudent = scanner.nextBoolean();

        System.out.print("Are you a Senior (true/false)? ");
        isSenior = scanner.nextBoolean();


        double price = 9.99;



        if(isStudent){
            if(isSenior){
                System.out.println("You get a Senior discount of 20%");
                System.out.println("You get a Student discount of 10%");
                price *= 0.70;
            }else {
                System.out.println("You get a Student discount of 10%.");
                price *= .9;
            }
        }else{
                if(isSenior){
                    System.out.println("You get a Senior discount of 20%");
                    price *= .8;
                }else{
                    System.out.println("You get no discount");
                    price *= 1;
                }
        }

        System.out.printf("The price is $%.2f", price);



    }
}
