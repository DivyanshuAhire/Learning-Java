import java.util.Scanner;
public class ATM_UI 
{
    static Scanner sc = new Scanner(System.in);
    static int Balance = 1000;

    static String name ="xxx";
    static String pass = "123";
  

    public static void main(String[] args)
    {
     
       System.out.println("This Is Main Page----------------------------------");
         System.out.println("type Sign In / Sign Up ");
        String SigningMethod= sc.nextLine();

        ATM_UI.LoginMethod(SigningMethod);
       
        
    }


    //Function For Directing User to SignUp/SignIn Function
    public static void LoginMethod(String SigningMethod)
    {   


        if(SigningMethod.equalsIgnoreCase("Sign Up"))
        {   
           
           //Call Sign Up Function
            System.out.println("Redirecting u to SignUp P");
            signUp();

        
        }
        else if (SigningMethod.equalsIgnoreCase("Sign In"))
        {
            //String[] userCred = signUp();

           // String name = userCred[0];
           // String pass = userCred[1];

           

            signIn(name, pass);    
            
        }
        else
        {
            System.out.println("Invalid Command");
            
        }  

       
    }
    //Sign Up Page---------
    public static String[] signUp()
    {
        System.out.println("This Is SignUp Page--------------------");
        System.out.println("Enter Name");
        String name= sc.nextLine();
        System.out.println("Enter Password");
        String pass = sc.nextLine();

        System.out.println("SignUp Succesfull");
        System.out.println("Redirecting you to SignIn page......");
        signIn(name, pass);

        return new String[]{name, pass};
        
    }

    //Sign In Page---------
    public static void signIn(String name,String pass)
    {

        System.out.println("This Is Sign In Page------------");

            if(name.isEmpty() || pass.isEmpty())
            {
                System.out.println("Plz SignUp First");
                System.out.println("Redirecting To SignUp Page..........");
                signUp();
            }
            else
            {
                System.out.println("Enter Your Registerd Name");
                String Tname = sc.nextLine();
                System.out.println("Password??");
                String Tpass = sc.nextLine();


                if (Tname.equals(name) && Tpass.equals(pass))
                {
                    System.out.println("Login SuccesFull");
                    menu();
                }
                else { System.out.println("Login Failed");
                signIn(name, pass);
                }
            }
    
    }

    public static void menu()
    {
        System.out.println("Enter One Of the Option");
        System.out.println("1- Check Balance");
        System.out.println("2- Withdraw");
        System.out.println("3- Deposit");
        System.out.println("4- Exit");
        


        int Input = Integer.parseInt(sc.nextLine());
        switch(Input)
        {
            case 1: System.out.println(Balance);
                    menu();
                    break;

            case 2: withdraw();
                    menu();
                    break;
                    
            case 3:Deposit();
                    menu();
                    break;

            case 4: exit();
                    break;
                    
            


            default: menu();


        }
    }


    //Withdraw Function
    public static int withdraw()
    {
        System.out.println("Enter amt to withdraw");

        int amt= Integer.parseInt(sc.nextLine());

        if(amt<Balance)
        {
            Balance = Balance - amt;
            System.out.println("Your Updated Balance is" + Balance);
        }
        else System.out.println("Insufficient Balance");
        

        
        return Balance;
    }
    

    //Deposit Function
    public static int Deposit()
    {
        System.out.println("Enter Amt To Deposit");
        int amt = Integer.parseInt(sc.nextLine());

        Balance = Balance + amt;

        System.out.println("Your Updated Balance is" + Balance);

        return Balance;
    }


    public static void exit()
    {
        System.out.println("Exiting the program");
        sc.close();
    }




}
