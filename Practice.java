import java.util.*;

public class Practice 
{   public static void main(String[] args) 
    {

        //long start = System.currentTimeMillis();//timer starts


        Scanner sc = new Scanner(System.in);

        System.out.println("Think of any Number");
        int sizeArray = Integer.parseInt(sc.nextLine());
        
        int array[] = new int[sizeArray];
        int tempArray = 0;

        for (int i =0; i < array.length ; i++) {
            
          array[i]=Integer.parseInt(sc.nextLine());

        }





        for(int i=0; i<array.length; i++)
        {

          
          
            tempArray=tempArray+array[i];

            
          

        }

        System.out.println("Avg is " + tempArray/array.length);

        System.out.println("Sum of Array is " + tempArray);


    
       //long end = System.currentTimeMillis();//timer ends
       //System.out.println("Time taken: " + (end - start) + " ms");
    }

    

    
}


