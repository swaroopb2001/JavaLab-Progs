import java.util.Scanner;

/*Create a class Book which contains four members: name, author, price, num_pages. Include a 
constructor to set the values for the members. Include methods to set and get the details of the 
objects. Include a toString( ) method that could display the complete details of the book. 
Develop a Java program to create n book objects*/

class Book{
    String name,author;

    int price,num;
    Book(String name, String author, int price, int num){
        this.name = name;
        this.author = author;
        this.price= price;
        this.num=num;

    }
    void get(){
        Scanner sc= new Scanner(System.in);
        System.out.println("\n Enter name, author, price, pages");
        name=sc.nextLine();
        author=sc.nextLine();
        price=sc.nextInt();
        num=sc.nextInt();
        
    }
    public String toString(){
        return ("name: "+name+" \n price: "+price+"\n author: "+author+"\n num: "+num);
    }
}
public class program3 {
    public static void main(String args[]){
    Book b1=new Book("methwa","anish",120,100);
    System.out.println("\n constructor values: "+b1); 
    Book b[]=new Book[4];
    for(int i=0;i<4;i++){
        b[i].get();
    }
    for(int i=0;i<4;i++){
    System.out.println("\n "+b[i]);
    
    

}}}
