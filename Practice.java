import java.util.*;

public class Practice 
{   public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Think of any Number");
        int n = Integer.parseInt(sc.nextLine());
        
        System.out.println(countDividingDigit(n));
    }

    public static int countDividingDigit(int n)
    {
        int count =0;

        int Original= n;

        
        while(n>0){

            int digit=n%10;
            if(divides(Original, digit))
            {
                count++;
            }

            n=n/10;
        }

        

        return count;

    }

    public static Boolean divides(int n, int digit) 
    {
        if(digit==0) return false;
        return n%digit==0;    
    }

    
}


