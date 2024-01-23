package bank.management.system;

import java.util.Random;
import java.awt.event.*;
import java.awt.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Signup3 extends JFrame implements ActionListener {

     JRadioButton r1,r2,r3,r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel ;
    String formno;
    
Signup3( String formno){
    this.formno=formno;
    
    setLayout(null);
    JLabel l1= new JLabel("Page 3 : Account Details ");
    l1.setFont(new Font ("Raleway" , Font.BOLD, 22));
    l1.setBounds(280, 40, 400, 22);
    add(l1); 
    
     //to make the frame
    setSize(850 , 820);
    setLocation(350, 0);
    setVisible(true);
    
    getContentPane().setBackground(Color.WHITE);

    
    JLabel type = new JLabel("Account Type ");
    type.setFont(new Font ("Raleway" , Font.BOLD, 22));
    type.setBounds(100, 100, 200, 30);
    add(type); 

    r1=new JRadioButton(" Fixed Deposit Account");
    r1.setFont(new Font ("Raleway" , Font.BOLD, 16));
    r1.setBounds(100, 140, 250, 20);
    r1.setBackground(Color.WHITE);
    add(r1); 
    
    r2=new JRadioButton(" Current Account");
    r2.setFont(new Font ("Raleway" , Font.BOLD, 16));
    r2.setBounds(350, 140, 250, 20);
    r2.setBackground(Color.WHITE);
    add(r2); 
    
    r3=new JRadioButton(" Recurring Deposit Account");
    r3.setFont(new Font ("Raleway" , Font.BOLD, 16));
    r3.setBounds(100, 180, 250, 20);
    r3.setBackground(Color.WHITE);
    add(r3); 
    
    r4=new JRadioButton(" Saving Account");
    r4.setFont(new Font ("Raleway" , Font.BOLD, 16));
    r4.setBounds(350, 180, 250, 20);
    r4.setBackground(Color.WHITE);
    add(r4); 
    
    ButtonGroup groupaccount = new ButtonGroup();
    groupaccount.add(r1);
    groupaccount.add(r2);
    groupaccount.add(r3);
    groupaccount.add(r4);

     JLabel card = new JLabel("Card Number ");
    card.setFont(new Font ("Raleway" , Font.BOLD, 22));
    card.setBounds(100, 240, 200, 20);
    add(card); 
    
    JLabel number = new JLabel("XXXX-XXXX-XXXX-8184 ");
    number.setFont(new Font ("Raleway" , Font.BOLD, 22));
    number.setBounds(330, 240, 300, 20);
    add(number); 
    
     JLabel carddeatil = new JLabel("Your 16 digit Card Number ");
    carddeatil.setFont(new Font ("Raleway" , Font.BOLD, 12));
    carddeatil.setBounds(100, 270, 300, 20);
    add(carddeatil); 
    
     JLabel pin = new JLabel("PIN ");
    pin.setFont(new Font ("Raleway" , Font.BOLD, 22));
    pin.setBounds(100, 320, 200, 20);
    add(pin); 
   
      
    JLabel pnumber = new JLabel("XXXX ");
    pnumber.setFont(new Font ("Raleway" , Font.BOLD, 22));
    pnumber.setBounds(330, 320, 300, 20);
    add(pnumber); 
    
     JLabel pindeatil = new JLabel("Your 4 digit Password ");
    pindeatil.setFont(new Font ("Raleway" , Font.BOLD, 12));
    pindeatil.setBounds(100, 350, 300, 20);
    add(pindeatil);  
    
    JLabel services = new JLabel("Services Required : ");
    services.setFont(new Font ("Raleway" , Font.BOLD, 22));
    services.setBounds(100, 400, 300, 20);
    add(services); 
    
    c1= new JCheckBox("ATM CARD");
    c1.setFont(new Font ("Raleway" , Font.BOLD, 16));
    c1.setBounds(100, 440, 200, 20);
    c1.setBackground(Color.WHITE);
    add(c1);
    
     c2= new JCheckBox("INTERNET BANKING");
    c2.setFont(new Font ("Raleway" , Font.BOLD, 16));
    c2.setBounds(350, 440, 200, 20);
    c2.setBackground(Color.WHITE);
    add(c2);
    
     c3= new JCheckBox("Mobile Banking");
    c3.setFont(new Font ("Raleway" , Font.BOLD, 16));
    c3.setBounds(100, 480, 200, 20);
    c3.setBackground(Color.WHITE);
    add(c3);
    
     c4= new JCheckBox("EMAIL & SMS Alerts");
    c4.setFont(new Font ("Raleway" , Font.BOLD, 16));
    c4.setBounds(350, 480, 200, 20);
    c4.setBackground(Color.WHITE);
    add(c4);
    
     c5= new JCheckBox("Cheq Book");
    c5.setFont(new Font ("Raleway" , Font.BOLD, 16));
    c5.setBounds(100, 520, 200, 20);
    c5.setBackground(Color.WHITE);
    add(c5);
    
     c6= new JCheckBox("E Statement");
    c6.setFont(new Font ("Raleway" , Font.BOLD, 16));
    c6.setBounds(350, 520, 200, 20);
    c6.setBackground(Color.WHITE);
    add(c6);
    
      c7= new JCheckBox("I here by declared that the above enterd details are correct to the best of my knowledge ");
    c7.setFont(new Font ("Raleway" , Font.BOLD, 12));
    c7.setBounds(100, 570, 600, 20);
    c7.setBackground(Color.WHITE);
    add(c7);
    
    submit =new JButton("Submit");
    submit.setFont(new Font ("Raleway" , Font.BOLD, 12));
    submit.setBounds(250, 630, 100, 30);
    submit.setBackground(Color.BLACK);
    submit.setForeground(Color.WHITE);
    submit.addActionListener(this);
    add(submit);
    
     
    cancel =new JButton("Cancel");
    cancel.setFont(new Font ("Raleway" , Font.BOLD, 12));
    cancel.setBounds(420, 630, 100, 30);
    cancel.setBackground(Color.BLACK);
    cancel.setForeground(Color.WHITE);
    cancel.addActionListener(this);
    add(cancel);
    
       }
   
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()== submit){
           String accountType =  null; 
                 if(r1.isSelected()){
                accountType = "Saving Account";
            } else if (r2.isSelected()){
                accountType = "Fixed Deposit Account ";
            } else if (r3.isSelected()){
                accountType = "Current Account";
            }else if (r4.isSelected()){
                accountType = "Recurring Deposit Account";
            }
                 Random random =new Random();
                 String cardnumber= "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
   
                 String pinnumber= "" + Math.abs(random.nextLong() % 9000L + 1000L);
                 
                 String facility ="";
                 if(c1.isSelected()){
                     facility = facility + "ATM Card";
                 }else if (c2.isSelected()){
                     facility = facility + "INTERNET BANKING";
                 } else if (c3.isSelected()){
                     facility = facility + "Mobile Banking";
                 }else if (c4.isSelected()){
                     facility = facility + "EMAIL & SMS Alerts";
                 }else if (c5.isSelected()){
                     facility = facility + "Cheq Book";
                 }else if (c6.isSelected()){
                     facility = facility + "E Statement";
                 }
                
                  try {
                Connect c =new Connect();
                String query = "insert into signup3 values ('"+formno+" ','"+accountType+" ','"+cardnumber+" ' ,'"+pinnumber+" ' ,'"+facility+" ')";
                String query2 = "insert into login values ('"+formno+" ','"+cardnumber+" ' ,'"+pinnumber+" ')";

                c.s.executeUpdate(query);
                c.s.executeUpdate(query2);
          
          
          JOptionPane.showMessageDialog(null, "Card Number :" + cardnumber +  "\n  PIN :" + pinnumber);
          
          setVisible(false);
          new Deposit(pinnumber).setVisible(false);


         } 
         catch (Exception e) {
            System.out.println(e);
         }
    }
                 
         else if (ae.getSource()== cancel) {
            setVisible(false);
            new Login().setVisible(true);
    }
    }


    public static void main(String args[]) {
        new Signup3("");
    }
    
}
