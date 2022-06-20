/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poe;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Neo Paballo Bopape
 */
public class _POE
       
        {


  
//task 2
    public static void main(String[] args) {
     
     String[] Options ={"Add Task","Show Report","Quit"};  
        
    int Val = JOptionPane.showOptionDialog(
            null,
            "Please Enter An Option" ,
            "Task Option",
            JOptionPane.YES_NO_CANCEL_OPTION ,
            JOptionPane.PLAIN_MESSAGE,
            null,
            Options,
            0);
            
    System.out.println(Val);
    
    while(Val !=1){
        
        if(Val ==0){
            
        TaskNum();
        break;
        
        }
        
        if(Val == 2){
        break;
            
        }
        if(Val ==1);
    }
    
        }
    
    public static boolean TaskNum(){
    
    String Number = JOptionPane.showInputDialog("Please Add Number of Tasks:");
    int a = Integer.parseInt(Number);
    
    for(int i = 0; i< a; i++){
        
    TaskMaker();

    
    }
   
    return true;
    }
    public static boolean TaskMaker(){
    
    String Tname = JOptionPane.showInputDialog("Please Enter Task Name : ");
    
    String Tnum = JOptionPane.showInputDialog("Please Add Task Number : ");
    
    
    String Tdes = JOptionPane.showInputDialog("Please Enter the Task Description : ");
        
        String Ddet = JOptionPane.showInputDialog("Developer Details");
        
        String Ddur = JOptionPane.showInputDialog("Task Duration(hrs)");
        
        String Last3 = Ddet.substring(Ddet.length() - 3);
        String Tn = Tname.substring(0,2);
       JOptionPane.showMessageDialog(null,"Task ID - " + (Tn + "i" + Tnum + Last3).toLowerCase());
       
       String[] Status ={"To Do", "Doing", "Done"};
       int State = JOptionPane.showOptionDialog(null,
               "Task Status",
               "Task Status",
               JOptionPane.YES_NO_CANCEL_OPTION,
               JOptionPane.INFORMATION_MESSAGE,
               null,
               Status,
               0);
       
       JOptionPane.showMessageDialog(null,
               "Task Status: " + State + "\n" +
               "Developer Detail: " + Ddet + "\n" +
               "Task Number: " + Tnum + "\n" +
               "Task Description :" + Tdes + "\n" +
               "Task ID - " + (Tn + "i" + Tnum + "i" + Last3).toUpperCase() + "\n" +
               "Task Duration: " + Ddur + "hrs"
       );
       
       //Task 3
       ArrayList<String> List = new ArrayList<>();
       
       List.add("Developer " + Ddet);
       List.add("Task Name " + Tname);       
       List.add("Task ID " + (Tn + "i" + Tnum + "i" + Last3).toUpperCase());
       List.add("Task Duration " + Ddur);
       List.add("Task Status " + Status[State] );
       
       String[] Poppu = List.toArray(new String[0]);
        System.out.println("The Array is " + Arrays.toString(Poppu) );
        
       
        ArrayApp();
        return true;
        }
//task3      
    public static boolean ArrayApp(){
            int Listop; 
            do{
               Listop = JOptionPane.showOptionDialog(null,
                        "Would you like to see the task lists?",
                        "List Option",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        0); 
            String[] Options = {"Completed Tasks","Longest Task","Search Task","Search Developer","Delete Task","Display Report","Cancel"};
            
            JOptionPane.showOptionDialog(null,
                    "Please select option",
                    "List App",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                   JOptionPane.PLAIN_MESSAGE,
                    null,
                    Options,
                    0);
           //user information in arrays 
            String[] Person1 = {"Mike Smith","Create Login","5","To Do"};
            String[] Person2 = {"Edward Harrison","Create Add Features","8","Doing"};
            String[] Person3 = {"Samantha Paulson","Create Reports","2","Done"};
            String[] Person4 = {"Glenda Oberholzer","Add Arrays","11","To Do"};
            
            
             //this display the completed tasks   
            if(Listop == 0){}
             
                if(Arrays.asList(Person3).contains("Done")){
                    
                    for(String a :Person3){
                        
                        System.out.println(a);
                    }}
            
            
            if(Listop == 1){}
            
                if(Arrays.asList(Person4).contains("11")){
                    for(String b : Person4){
                        System.out.println(b);
                        
                }}
                
                    //searching for task by name
            if(Listop == 2){}
            
                String Task1 = JOptionPane.showInputDialog("Please Enter Task Name");
                
                if(Arrays.asList(Person1).contains(Task1)){
                
                for(String c : Person1){
                    System.out.println(c);
                }}
              //find task assigned to developer      
            if(Listop == 3){}
            
             String Dev = JOptionPane.showInputDialog("Please enter Developer name :");
            
              if(Arrays.asList(Person1).contains(Dev)){
                    
                    for(String d : Person1){
                        System.out.println(d);
                    }
                }
              
               if(Arrays.asList(Person2).contains(Dev)){
                    
                    for(String d : Person2){
                        System.out.println(d);
                    }
               }
               
                if(Arrays.asList(Person3).contains(Dev)){
                    
                    for(String d : Person3){
                        System.out.println(d);
                    }
                }
                
                 if(Arrays.asList(Person4).contains(Dev)){
                    
                    for(String d : Person4){
                        System.out.println(d);
                    }
                 }
                 //deletion of task by name
            if(Listop == 4){}
            String Tdes = JOptionPane.showInputDialog("Please Enter Task Name :");
            
           
             if(Arrays.asList(Person1).contains(Tdes)){
                
                Person1[0] = null;
                Person1[1] = null;
                Person1[2] = null;
                Person1[3] = null;
                
                System.out.println("Your Task Has Been Deleted");
                
                    for(String e : Person1){
                        System.out.println(e);
                    }}
             
              if(Arrays.asList(Person1).contains(Tdes)){
                
                Person2[0] = null;
                Person2[1] = null;
                Person2[2] = null;
                Person2[3] = null;
                
                System.out.println("Your Task Has Been Deleted");
                
                    for(String e : Person2){
                        System.out.println(e);
                    }}
              
               if(Arrays.asList(Person3).contains(Tdes)){
                
                Person3[0] = null;
                Person3[1] = null;
                Person3[2] = null;
                Person3[3] = null;
                
                System.out.println("Your Task Has Been Deleted");
                
                    for(String e : Person3){
                        System.out.println(e);
                    }}
               
                if(Arrays.asList(Person1).contains(Tdes)){
                
                Person4[0] = null;
                Person4[1] = null;
                Person4[2] = null;
                Person4[3] = null;
                
                System.out.println("Your Task Has Been Deleted");
                
                    for(String e : Person4){
                        System.out.println(e);
                    }}
               //display full report of tasks 
            if(Listop == 5){} 
                            System.out.println("    ");

                   for(String f : Person1){

                       System.out.println("f");

                             System.out.println("    ");
                              }
                              
                   for(String f : Person2){

                      System.out.println("f");

                         System.out.println("    ");
                         }
                         
                  for(String f : Person3){

                    System.out.println("f");

                        System.out.println("    ");
                         }
                  for(String f : Person4){

                    System.out.println("f");
                         
                         
            }
              
            
            
            JOptionPane.showMessageDialog(null,"Have A Nice Day!");
              break;
            
            
          
            }while(Listop !=1);
    
            
    return true;
    }

}     
    

