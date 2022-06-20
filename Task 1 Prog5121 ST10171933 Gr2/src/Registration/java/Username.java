
/**
 *
 * @author Neo Paballo Bopape
 */
package Registration.java;


import java.util.Scanner;
import java.util.regex.*;
class Username {
    
    //Function to validate the Username
    public static boolean CheckUsername(String User)
    {
        //regex to check valid username.
        String regex = "^[A-Za-z]\\w{0,5}$";
        
        // Compile the regex
           Pattern p = Pattern.compile(regex);
        
           // If username is empty
           // return false
           if (User == null)
          
           {
               return false;
           }
           
    
    
           Matcher m = p.matcher(User);
          // Return if the username 
           //matched with the regex
           return m.matches();
                   
    }
    
    static {
    }        
   
   
    
   // Driver code 
    public static void main(String[] args)
    {
        //Test case :1
        String str1 = "NP_BP";
        System.out.println(CheckUsername(str1));
        
        //Test case :2
        String str3 = " ";
        System.out.println(CheckUsername(str3));
        
        // Test case 3
        String str5 = "NLLz_";
        System.out.println(CheckUsername(str5));
        
    }
    private Object Registration;
    
public boolean checkUsername(){
    if(Registration.Username.contains("_")){
            if (Registration.Username.length() <=5) {
                return true;
            }
            else{
                return false;
            }
            }
        return true;
        
}
public boolean loginUser(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the previously entered details: ");
    String Username2 = input.nextLine();
   
    String password2= input.nextLine();
    System.out.println("The details entered matches regex");
    
    return true;
     
  }
public String returnLoginStatus(){
    if(loginUser()){
        return "Welcome it's great to see you again" + Registration.firstName;
                } 
    else{
        return null;
}
}