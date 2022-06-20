
import java.util.Scanner;
import static sun.security.jgss.GSSUtil.login;





public class Registration{
    
      static  String FirstName;//THIS STRING HOLDS THE USERNAMES FIRSTNAME
       static String Surname;//THIS STRING HOLDS THE USERNAMES SURNAME
       static String Username;//THIS STRING HOLDS THE USERNAMES "USERNAMES FOR THE ACCOUNT THEY WIL BE CREATING
      static  String Password;//THIS STRING HOLDS THE USERS PASSWORD
       
public static void userInput(){;
        //PROMPTS THE USER FOR INPUTS
       
        Scanner userInput = new Scanner(System.in);
            System.out.print("Enter your First Name ");
            FirstName = userInput.nextLine();
            
            System.out.print("Enter your Last Name ");
            Surname = userInput.nextLine();
            
            System.out.print("Enter your Username ");
            Username = userInput.nextLine();
            
            System.out.print("Enter your password ");
            Password = userInput.nextLine();
           
            
    }
          public static void main(String[] args) {
            userInput();

            login logObject = new login();
            
            logObject.CheckPasswordComplexity();
            logObject.registerUser();
                    System.out.println(logObject.returnLoginStatus());
            }
   
      
  }
    
        
        
   

    
        
    

            
            
 
