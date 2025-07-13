import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Any Number");
        int n = Integer.parseInt(sc.nextLine());
        
        System.out.println("Even Numbers---");
        for(int i=2; i<=n; i=i+2)
            {
                System.out.print(i + " ");
            }
        
        System.out.println();
        System.out.println("Odd Numbers");
       for(int i=1; i<=n; i=i+2 )
            {
                System.out.print(i + " ");
            }

    }
}
