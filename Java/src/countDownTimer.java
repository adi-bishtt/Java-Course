import java.util.Scanner;
public class countDownTimer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("How many seconds to count down : ");
        int start = scanner.nextInt();


        for(int i = start; i >0; i--){
            System.out.println(i);
        }

        System.out.println("Happy new year");


        scanner.close();
    }
}
