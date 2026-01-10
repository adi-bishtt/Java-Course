public class stringMethods {
    public static void main(String[] args) {

       String name = "password";

        /* int length = name.length();
        System.out.println(length);

        char letter = name.charAt(0);
        System.out.println(letter);

        int index = name.indexOf(" ");
        System.out.println(index);

//        name = name.toUpperCase();
//        System.out.println(name);
//
//        name = name.trim();
//        System.out.println(name);

        name = name.replace("i" ,"y");
        System.out.println(name);*/

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }else{
            System.out.println("Hello "+name);
        }




    }
}
