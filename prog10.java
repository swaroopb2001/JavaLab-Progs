/**Write a program that creates a user interface to perform integer divisions. The user enters two 
numbers in the text fields, Num1 and Num2. The division of Num1 and Num2 is displayed in 
the Result field when the Divide button is clicked. If Num1 or Num2 were not an integer, the 
program would throw a NumberFormatException. If Num2 were Zero, the program would 
throw an Arithmetic Exception Display the exception in a message dialog box. */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class program10 implements ActionListener{

public static void main(String[] args){
    JFrame mainframe =new JFrame("calculator.exe");
    mainframe.setSize(500,500);
    JLabel label1=new JLabel("num1");
    JLabel label2=new JLabel("num2");
    JTextField tf1=new JTextField();
    JTextField tf2=new JTextField();
    JTextField res=new JTextField();
    JButton calc= new JButton("calculate");
    JButton clr= new JButton("clear");
    label1.setBounds(0,0,100,50);
    label2.setBounds(0,60,100,50);
    tf1.setBounds(110,0,100,50);
    tf2.setBounds(110,60,100,50);
    res.setBounds(0,80,100,50);
    calc.setBounds(0,140,100,30);
    clr.setBounds(0,180,100,30);

    calc.addActionListener(e->{
        try{
            int a= Integer.parseInt(tf1.getText());
            int b= Integer.parseInt(tf2.getText());
            int soln= a/b;
            res.setText("result: "+soln);

        }
        catch(ArithmeticException ex){
            res.setText("arithmetic exeption ");
        }
        catch(NumberFormatException ex){
            res.setText("number format exception ");
        }

    });

    clr.addActionListener(e->{
        tf1.setText("");
        tf2.setText("");
    });


    mainframe.add(label1);
    mainframe.add(label2);
    mainframe.add(tf1);
    mainframe.add(tf2);
    mainframe.add(calc);
    mainframe.add(clr);

    mainframe.setLayout(null);
    mainframe.setVisible(true);

}


@Override
public void actionPerformed(ActionEvent e){

}
}