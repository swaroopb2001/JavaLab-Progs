import java.util.Scanner;

/**Develop a Java program to create an abstract class named Shape that contains two integers and 
an empty method named printArea( ). Provide three classes named Rectangle, Triangle and 
Circle such that each one of the classes extends the class Shape. Each one of the classes 
contain only the method printArea( ) that prints the area of the given shape. */


abstract class shape{
    double a,b;
    abstract void area();
}

class Rectangle extends shape{
    void data(int x, int y){
        a=x;
        b=y;
    }

    @Override
    void area() {
        System.out.println("\n rectangle: "+(a*b));
        
    }
    
}

class Triangle extends shape{
    void data(int x, int y){
        a=x;
        b=y;
    }

    @Override
    void area() {
        System.out.println("\n circle: "+(0.5*a*b));
        
    }
    
}

class circle extends shape{
    void data(int y){
        a=y;
    }

    @Override
    void area() {
        System.out.println("\n circle: "+(a*a*3.14));
        
    }
}

public class program4 {
    public static void main(String[] args){
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        circle c=new circle();
        Scanner sc=new Scanner(System.in);
        int x,y;
        while(true){
            System.out.println("\n 1.rectange \n 2.circle \n 3.triangle \n 4.quit \n");
            int ch=sc.nextInt();

            switch(ch){
                case 1:System.out.println("\n enter a and b \n");
                x=sc.nextInt();
                y=sc.nextInt();
                 r.data(x,y);
                 break;
                 case 2:System.out.println("\n enter a and b \n");
                 x=sc.nextInt();
                 y=sc.nextInt();
                  t.data(x,y);
                  break;
                  case 3:System.out.println("\n enter r \n");
                  x=sc.nextInt();
                  
                   c.data(x);
                   break;

                   case 4: System.exit(0);
                   break;

                   default: System.out.println("\n invalid \n");

                 
            }
        }
    }
    
}
