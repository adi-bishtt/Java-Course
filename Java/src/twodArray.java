public class twodArray {
    public static void main(String[] args) {

        String[] fruits = {"apple", "banana", "cherry", "lemon", "grapes"};
        String[] vegetables = {"onion" , "potato" , "carrot"};
        String[] colors = {"red", "green", "blue"};

        String[][] buyList = {fruits, vegetables, colors};


        buyList[1][1] = "pineapple";


        for(String[] list : buyList){
            for(String buy : list){
                System.out.print(buy + " ");
            }
            System.out.println();
        }


    }
}
