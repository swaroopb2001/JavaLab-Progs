import java.util.Scanner;

/*Develop a Java program to create a class Student with members usn, name, an array credits 
and an array marks. Include methods to accept and display details and a method to calculate 
SGPA of a student*/


public class program2 {
  
        String usn,name;
        int []credits= new int[5];
        int []marks= new int[5];
        double sgpa;
        void accept(){
            Scanner sc=new Scanner(System.in);
            System.out.println("\n Enter name, usn, credits and marks \n");
            name=sc.nextLine();
            usn=sc.next();
            for(int i=0;i<5;i++){
                credits[i]=sc.nextInt();
            }
            for(int i=0;i<5;i++){
                marks[i]=sc.nextInt();
            }
        }

        void display(){
            System.out.println("\n SGPA: "+ sgpa);
        }

        void calculate(){
            int c,sum=0;
            for(int i=0;i<5;i++){
                if(marks[i]>=90){
                    c=10;
                }
                else if(marks[i]>=80 && marks[i]<90){
                    c=9;
                }
                else if(marks[i]>=70 && marks[i]<80){
                    c=8;
                }
                else if(marks[i]>=60 && marks[i]<70){
                    c=7;
                }
                else if(marks[i]>=50 && marks[i]<60){
                    c=6;
                }
                else if(marks[i]>=40 && marks[i]<50){
                    c=5;
                }
                else
                c=0;
                sgpa+=(credits[i]*c);
                sum+=credits[i];
            }
            sgpa/=sum;
        }
    
    public static void main(String[] args){
       program2 p=new program2();
        p.accept();
        p.calculate();
        p.display();
        


    }
    
}
