import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking basic information for Array;
        System.out.println("Enter Number of Rows");
        int rows = sc.nextInt();
        System.out.println("Enter Number of Columns");
        int columns = sc.nextInt();

       
        


        //Edge Case Check
        if(rows<0 || columns<0)
        {
            System.out.println("invalid Matrix ");
            return;
        }
        else if (rows == 0 || columns==0)
        {
            System.out.println("Its a Zero Matrix");
            return;
        }
        //Initialising the Array
         int[][] array = new int[rows][columns];

        //Taking Array as User Input
        System.out.println("Plz Enter Values Of Array");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                array[i][j]=sc.nextInt();

            }

        }

        
        
        
        
        //Printing Sum Of Rows
        for(int i=0; i<rows; i++)
        {
            int rowSum=0;
            for(int j=0; j<columns; j++)
            {
                rowSum=rowSum+array[i][j];
                
            }
            System.out.println("Sum of Row " + (i+1) + " = " + rowSum);

            

        }


        //Printing Sum coloumn wise
        for(int i=0; i<columns; i++)
        {
            int colSum=0;
            for(int j=0; j<rows; j++)
            {
                colSum=colSum+array[j][i];
            }

            System.out.println("Columns " + (i+1)+" = " + colSum);
        }

      


       
    }
}
