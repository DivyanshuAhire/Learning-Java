import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Marks?");
        int marks = Integer.parseInt(sc.nextLine());

        System.out.println("Entrance Exam Marks?");
        int Emarks = Integer.parseInt(sc.nextLine());


        System.out.println("Extra Curicular Activity ?? (Yes/No)");
        String EC = sc.nextLine();


        if (marks>=75)
        {
            if (Emarks>=120)
            {
                if(EC.equalsIgnoreCase("yes"))
                {
                    System.out.println("Eligible For Scholarship");
                }
                else{
                    System.out.println("Eligible for Admission Only");
                }
            }

            else{
                System.out.println("Not eligible DUe to Low Entrance Score");
            }
        }
        else{
            System.out.println("Not eligible DUe to Low Marks");
        }
    }
}
