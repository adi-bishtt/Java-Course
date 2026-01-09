import java.util.Scanner;
public class CompoundInterestCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() /100;

        System.out.print("Enter the number of times the compound interest per year: ");
        timesCompound = scanner.nextInt();

        System.out.print("Enter the years of compound interest: ");
        years = scanner.nextInt();

        amount = principal*Math.pow(1 + rate / timesCompound , timesCompound*years);

        System.out.println("The amount after " + years + " years is $"+amount);








        scanner.close();
    }
}
