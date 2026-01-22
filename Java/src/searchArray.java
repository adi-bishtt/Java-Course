import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class searchArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        String[] fruits = {"apple","orange","banana","coconut"};
        boolean isFound = false;
        String target;

        System.out.print("Enter the fruit you want to search: ");
        target = scanner.nextLine();

        for(int i=0;i<fruits.length;i++){
            if (fruits[i].equals(target)){
                System.out.println("Element found at index : " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found");
        }

    scanner.close();
    }
}
