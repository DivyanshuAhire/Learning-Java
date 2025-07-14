import java.util.*;

public class Practice 
{   public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Think of any Number");
        int n = Integer.parseInt(sc.nextLine());
        //int x= Integer.parseInt(sc.nextLine());
        System.out.println(calculatingFactorial(n));
        
      // Diamond(n);

    }

    
    public static int calculatingFactorial(int n)
    {
        int box=1;

        for(int g=n; g>=1; g=g-1)
        {
            box=box*g;
        }

        return box;
    }


    public static void Diamond(int n)
    {
        
        for(int x=1; x<=n; x++)
        {
            for(int l=n-x; l>=1; l--)
            {
                System.out.print(" ");
            }

            for(int y=1; y<=x; y++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }


         for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(" ");
            }
           


            for(int k=n-i; k>=1; k--)
            {
                System.out.print("* ");
            }

        
            System.out.println();
        }
    }
}


