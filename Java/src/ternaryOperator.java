public class ternaryOperator {
    public static void main(String[] args) {

        // ternary operator ? = return 1 of 2 values if the condition is true

        //variable = (condition) / ifTrue : ifFalse;

        int score = 10;

//        if(score>=60) {
//            System.out.println("You pass");
//        }else{
//            System.out.println("You fail");
//        }
//

        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        System.out.println(passOrFail);



    }
}
