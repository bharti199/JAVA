
package bank.management.system;

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton login, signup, clear; // globally defined- to access outside the constructor
    JTextField  cardTextField;
    JPasswordField pinTextField ;
    
    Login()
    {
       setTitle("Automated Teller Machine");  
       setLayout(null);
      // JPanel mainPanel=new JPanel();
       //mainPanel.setLayout(new BorderLayout()); 
       setVisible(true);
       setSize(800, 480);
       setLocation(350,200);


       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
       Image i2= i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel label=new JLabel(i3);
       label.setBounds(70,10,100,100);
       add(label);

       getContentPane().setBackground(Color.WHITE);

        JLabel text= new JLabel("WELCOME TO ATM");
        text.setBounds(200, 40, 400, 40);
        text.setFont(new Font("Arial", Font.BOLD, 34));
        add(text);

        JLabel cardno = new JLabel("Card No. :");
        cardno.setBounds(120, 150, 150, 30);
        cardno.setFont(new Font("Arial", Font.BOLD, 24));
        add(cardno);

    cardTextField=new JTextField();
    cardTextField.setBounds(300, 150, 200, 30);
    cardTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        add(cardTextField);

        JLabel pin = new JLabel("PIN :");
        pin.setBounds(120, 220, 400, 30);
        pin.setFont(new Font("Arial", Font.BOLD, 24));
        add(pin);

    pinTextField=new JPasswordField();
    pinTextField.setBounds(300, 220, 200, 30);
    pinTextField.setFont(new Font("Raleway", Font.BOLD, 16));
    add(pinTextField);

    login= new JButton("SIGN IN");
    login.setBounds(300, 300, 100, 30);
    login.setBackground(Color.BLACK);
    login.setForeground(Color.WHITE);
    //to catch the event of the button
    login.addActionListener(this);
    add(login);

    clear= new JButton("CLEAR");
    clear.setBounds(430, 300, 100, 30);
    clear.setBackground(Color.BLACK);
    clear.setForeground(Color.WHITE);
    clear.addActionListener(this);
    add(clear);

    signup= new JButton("SIGN UP");
    signup.setBounds(300, 350, 230, 30);
    signup.setBackground(Color.BLACK);
    signup.setForeground(Color.WHITE);
    signup.addActionListener(this);
    add(signup);

}
public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()== clear) { 
         cardTextField.setText(" ");
        pinTextField.setText("");     //which button is clicked
    }  else if(ae.getSource()== login) {
        Connect conn = new Connect();
        String cardnumber= cardTextField.getText();
        String pinnumber= pinTextField.getText();
        String query = "select * from login where cardnumber ='"+cardnumber+"'and pin ='"+pinnumber+"'";
        try{
       ResultSet rs = conn.s.executeQuery(query);  //to return the data
        if(rs.next()){                   //if there is data then
           setVisible(false);               //to close the login frame
           new Transaction(pinnumber).setVisible(true);     // to open transaction frame
       } 
        else {
           JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
       }
        }catch (Exception e) {
           System.out.println(e);
        }
        
    }  else if(ae.getSource()== signup) {
        setVisible(false);
        new Signupone().setVisible(true);
    }

}
   public static void main(String args[]) {
     new Login(); 
    }
}
