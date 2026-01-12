public class logicalOperators {
    public static void main(String[] args) {

        // && = AND
        // || = OR
        // ! = NOT


        double temp = 20;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is nice");
            System.out.println("Its sunny outside");
        }else{
            System.out.println("The weather is idk");
        }


    }
}
