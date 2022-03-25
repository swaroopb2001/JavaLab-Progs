/*Write a program that demonstrates handling of exceptions in inheritance tree. Create a base 
class called “Father” and derived class called “Son” which extends the base class. In Father 
class, implement a constructor which takes the age and throws the exception Wrong Age( ) 
when the input age<0. In Son class, implement a constructor that cases both father and son’s 
age and throws an exception if son’s age is >=father’s age.*/
package program8;

import java.rmi.server.ExportException;
import java.util.Scanner;

class wrong extends Exception{
    String message(){
        return ("wrong age");
    }

}


class wrongson extends Exception{
    String message(){
        return("son are greater than fathers age \n")
    }
}
 class fatherage{
    Scanner sc=new Scanner(System.in);
    int age;
    fatherage(){
        System.out.println("\n enter age \n");
        age=sc.nextInt();
    }
    
    void check() throws wrong{
        
        if(age<=0)
        throw new wrong();
            System.out.println("\n father:"+age);

        
    }
}

class son extends fatherage{
    int sage;
    
    son(){
        System.out.println("enet son age: \n");
        sage=sc.nextInt();
        
    }
    void checkson()throws wrongson{
        
            if(sage>=age)
            throw new wrongson();
            System.out.println("\n son:" +sage);

       
}}


public class father{
    public static void main(String[]args){
        fatherage f=new fatherage();
        try {
            f.check();
            
        } catch (wrong e) {
           
            e.printStackTrace();
        }
        son s=new son();
        try{
           
            s.checkson();
        }
        catch(wrongson e){
            e.printStackTrace();
        }
        
    }
}