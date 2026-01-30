
public class OOP {
    public static void main(String[] args) {

        //This is object hence you need to see the car file


        car ford = new car();

        System.out.println(ford.isRunning);
        ford.start();
        System.out.println(ford.isRunning);
        ford.stop();
        System.out.println(ford.isRunning);

    }
}
