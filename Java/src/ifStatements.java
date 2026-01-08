import java.util.Scanner;
public class ifStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Group 1
        String name;

        System.out.print("Enter your name : ");
        name = scanner.nextLine();

        if(name.isEmpty()){
            System.out.println("You did not enter a name");
        }else{
            System.out.println("Hello " + name);
        }


        //Group 2

        boolean isStudent;

        System.out.print("Are you a student (true/false)?");
        isStudent = scanner.nextBoolean();

        if(isStudent){
            System.out.println("You can enter");
        }else{
            System.out.println("You can not enter");
        }



        //Group 3

        int age;

        System.out.print("Enter your age : ");
        age = scanner.nextInt();

        if(age >= 65){
            System.out.println("You are a senior driver...");
        }
        else if (age >=18){
            System.out.println("You can drive");
        }
        else if(age < 0){
            System.out.println("How the heck are you even applying");
        }
        else if(age == 0 ){
            System.out.println("You are a damn baby");
        }
        else {
            System.out.println("You can't Drive");
        }


        scanner.close();
    }
}
