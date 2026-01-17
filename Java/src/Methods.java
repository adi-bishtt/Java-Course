public class Methods {
    public static void main(String[] args){


        //methods : a block of code (reusable) that is executed when ()
        //methods are unfamiliar with any variables declared within other methods

    double num = cube(3);
    System.out.println(num);

    }
    static void happyBirthday(String name,int age){
        System.out.println("Happy birthday to you !");
        System.out.printf("Happy birthday dear %s\n",name);
        System.out.printf("You are %d years old\n",age);
        System.out.println("Happy birthday to you !\n");

    }
    static double square(double number){
        return number*number;
    }
    static double cube(double num){
        return num*num*num;
    }
}
