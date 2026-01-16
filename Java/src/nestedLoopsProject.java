import java.util.Scanner;

public class nestedLoopsProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int row;
        int columns;
        char symbols;

        System.out.print("Enter the number of rows : ");
        row = scanner.nextInt();

        System.out.print("Enter the number of columns : ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use  :");
        symbols = scanner.next().charAt(0);

        for(int j =0;j<row;j++){
            for(int i = 0;i<columns;i++){
                System.out.print(symbols + " ");
            }
            System.out.println();
        }



        scanner.close();
    }
}
