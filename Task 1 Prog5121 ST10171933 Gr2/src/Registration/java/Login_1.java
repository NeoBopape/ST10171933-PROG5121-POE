

/**
 *
 * @author Neo Paballo Bopape
 */
package Registration.java;


public class Login_1 
{
    

    //this method recieves a password to check password complexity
    public boolean checkUsername(){
if(Registration.Username.contains("_") && Registration.Username.length() <=5){
    return true;
    }            
else{ 
    return false;
    }   
 }
    
    /**
     *
     * @param Uppercase
     * @return
     */
    public boolean checkPasswordComplexity(boolean Uppercase){
    
    boolean passwordStatus = false;
    boolean length = false;
    boolean number = false;
    boolean specialCharacter = false;
    char p;
    
    if(Registration.Password.length() >=8){
        length = true;
    }
    for (int i= 0 ; i < Registration.Password.length(); i = i+1 ){
        p= Registration.Password.charAt(i);
        
    if(Character.isDigit(p)){
        number = true;
    }
        if(Character.isUpperCase(p)){
            Uppercase = true;
        }
        if(!Character.isLetterOrDigit(p)){
            specialCharacter = true;
        }
        passwordStatus = specialCharacter && number && length && Uppercase;
    {
        return passwordStatus;   
        }
    }
            System.out.println("The username is incorrectly formated");
     return true;
     
}

 
    

 
            
            
            

    


