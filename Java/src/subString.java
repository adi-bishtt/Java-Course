import java.util.Scanner;

public class subString {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String eMail;
        System.out.print("Enter your email : ");
        eMail = scanner.nextLine();

        if(eMail.contains("@")){
            System.out.println("Your username is : " + eMail.substring(0,eMail.indexOf("@")));
            System.out.println("Your domain used is : " + eMail.substring(eMail.indexOf("@")+1));
        }else{
            System.out.println("Email must contain @");
        }







        scanner.close();

    }
}
