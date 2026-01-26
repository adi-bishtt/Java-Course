import java.util.Random;
import java.util.Scanner;

public class slotMachine {
    public static void main(String[] args) {

        //Java slot machine
        Scanner scanner = new Scanner(System.in);

        //Declare variables
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        //Welcome Message
        System.out.println("------------------------------");
        System.out.println("Welcome to Hakari slot game");
        System.out.println(" Symbols : 🍒 🍉 🍋 🔔 ⭐️ ");
        System.out.println("------------------------------");

        //Play if balance is > 0
        while(balance>0){
            System.out.println("Current balance: $" + balance);
            //Enter bet amount
            System.out.print("Place your bet amount : ");
            bet = scanner.nextInt();
            scanner.nextLine();

            //Verify bet is > balance
            if(bet>balance){
                System.out.println("Invalid bet amount");
                continue;
                //Verify if bet is > 0
            }else if(bet<=0){
                System.out.println("Bet must be greater than zero");
                //Subtract bet from balance
            }else{
                balance -= bet;
            }

            System.out.println("Spinning .... ");

            row = spinRow();//Spin row
            printRow(row);//Print row

            payout = getPayout(row,bet);

            //Get payout
            if(payout>0){
                System.out.println("You won $" + payout);
                balance += payout;
            }else{
                System.out.println("Sorry you lost this round");
            }

            System.out.print("Do you want to continue? [Y/N]");
            playAgain = scanner.nextLine().toUpperCase();

            //Ask to play again
            if(!playAgain.equals("Y")){
                break;
            }
        }
        //Display exit message
        System.out.println("Game over , Your final balance is $" + balance);



        scanner.close();

    }
    static String[] spinRow(){

        String[] symbols = {"🍒","🍉","🍋","🔔","⭐️"};
        String[] row = new String[3];
        Random random = new Random();


        for(int i=0;i<3;i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println(" " + String.join(" | ", row));

    }
    static int getPayout(String[] row,int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet*3;
                case "🍉" -> bet*4;
                case "🍋" -> bet*5;
                case "🔔" -> bet*10;
                case "⭐️" -> bet*20;
                default -> 0;

            };
        }else if(row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐️" -> bet * 10;
                default -> 0;
            };
        }else if(row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet *2;
                case "🍉" -> bet *3;
                case "🍋" -> bet *4;
                case "🔔" -> bet *5;
                case "⭐️" -> bet *10;
                default -> 0;
            };
        }
        return 0;
    }
}
