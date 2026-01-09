public class PrintF {
    public static void main(String[] args) {

        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s",name);
        System.out.printf("\nYour name starts with a %c",firstLetter);
        System.out.printf("\nYour age is %d years old" ,age);
        System.out.printf("\nYour height is %f",height);
        System.out.printf("\nEmployed : %b\n",isEmployed);

        System.out.printf("%s is %d years old",name,age);
    }
}
