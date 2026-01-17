public class overloadedMethods {
    public static void main(String[] args){


        // Overloaded methods : methods that share name but have diff parameters ... (signature = name + parameter)


//        System.out.println(add(2,3,3));

        String pizza = bakePizza("Flat Bread" , "Idk any cheese");
        System.out.println(pizza);

    }
    static double add(double a, double b){
        return a+b;
    }
    static double add(double a, double b,double c){
        return a+b+c;
    }
    static String bakePizza(String bread , String cheese){
        return cheese + " " + bread + "pizza";
    }
}
