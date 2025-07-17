import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array Setup
        System.out.println("How many Rows u  want? ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("How Many Coloumns U want? ");
        int coloumns= Integer.parseInt(sc.nextLine());

        int[][] matrix = new int[rows][coloumns];


        //Taking Input For 2D Array
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<coloumns; j++)
            {
                matrix[i][j]=Integer.parseInt(sc.nextLine());
            }
        }

        //printing the Array

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<coloumns; j++)
            {
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("For What Number to Hunt ?");
        int target = Integer.parseInt(sc.nextLine());

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<coloumns; j++)
            {
                if(matrix[i][j]==target)
                {
                    System.out.println("Target Found at Row " + i + " Coloumn " + j);
                }
            }
        }
       
    }
}
