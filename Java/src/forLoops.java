import java.util.Scanner;
public class forLoops {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        //for loop = execute some code for a CERTAIN amount of time...

        //for(int i = 10;i > 0 ;i--){
        //.out.println(i);
        //}


        System.out.print("Enter how many times you want to loop : ");
        int max = scanner.nextInt();


        for(int i=0;i<max;i++){
            System.out.println(i);
        }

        scanner.close();
    }
}
