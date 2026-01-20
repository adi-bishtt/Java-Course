import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        // array = a collection of value of same type .

        String[] fruits = {"apple" , "orange" , "banana" , "coconut"};

        //fruits[0] = "papaya";
//        int numOfFruits = fruits.length;
//
//
//        for(int i = 0 ; i<numOfFruits; i++){
//            System.out.print(fruits[i] + ",");

        Arrays.fill(fruits , "pineapple");

        //Enhanced for loops
        for(String fruit : fruits){
            System.out.println(fruit);
        }



    }
}
