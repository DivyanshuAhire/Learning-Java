import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(sc.nextLine());

        if(age<13)
        {
            System.out.println("Child");
        }
        else if(age>=13 && age<=19)
        {
            System.out.println("teen");
        }
        else if(age>=20 && age<=59)
        {
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior");
        }
    }
}
