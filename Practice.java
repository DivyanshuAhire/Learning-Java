import java.util.*;

public class Practice 
{   public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Think of any Number");
        int n = Integer.parseInt(sc.nextLine());
        

        System.out.println("Is Even : " + isEven(n));
        System.out.println("Is Prime : " + isPrime(n));
        System.out.println("factorial : " + factorial(n));
    }

    public static boolean isEven(int n)
    {
        return n%2==0;
    }

    public static boolean  isPrime(int n)
    {
        if(n<1)
        {
            return false;

        }
        for(int j=2; j<=Math.sqrt(n); j++)
        {
            if(n%j==0) return false;
        }
        return true;
    }

    public static int factorial(int n)
    {
        int box=1;

        for(int h=n; h>=1; h--)
        {
            box = box * h;
        }
        return box;
    }
}


