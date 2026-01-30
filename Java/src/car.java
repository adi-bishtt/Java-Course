public class car {

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 50000.00;
    boolean isRunning = true;

    void start(){
        isRunning = false;
        System.out.println("Starting Car");
    }
    void stop (){
        isRunning = true;
        System.out.println("Stopping Car");
    }
}
