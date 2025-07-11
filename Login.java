//package bank.management.system

import java.awt.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {

  JLabel label1, label2, label3;

  JTextField textField2;

  JPasswordField passwordField3;

  JButton button1, button2, button3;

  Login(){
    super("Bank management System");


    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank.png"));
    Image i2 =i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(400,10,100,100);
    add(image);


    ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("cardes.pngg"));
    Image ii2 =ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
    ImageIcon ii3 = new ImageIcon(ii2);
    JLabel iimage = new JLabel(ii3);
    iimage.setBounds(630,350,100,100);
    add(iimage);

    label1 = new JLabel("WELCOME TO ATM");
    label1.setForeground( Color.white);
    label1.setFont(new Font("AvantGarde",Font.BOLD,38));;
    label1.setBounds(230,125,450,40);
    add(label1);


    label2 = new JLabel("Card No:");
    label2.setFont(new Font("Ralway", Font.BOLD,28));
    label2.setForeground(Color.WHITE);
    label2.setBounds(150,190,375,30);
    add(label2);

    textField2 = new JTextField(15);
    textField2.setBounds(325,190,230,30);
    textField2.setFont(new Font("Arial", Font.BOLD, 14));
    textField2.setForeground(Color.black);
    add(textField2);


    label3 = new JLabel("PIN:");
    label3.setFont(new Font("Ralway", Font.BOLD,28));
    label3.setForeground(Color.WHITE);
    label3.setBounds(150,250,375,30);
    add(label3);

    passwordField3 = new JPasswordField(15);
    passwordField3.setBounds(325,250,230,30);
    passwordField3.setFont(new Font("Arial", Font.BOLD, 30));
    passwordField3.setForeground(Color.black);
    add(passwordField3);

    button1 = new JButton("SING IN..");
    button1.setFont(new Font("Arial",Font.BOLD,14));
    button1.setForeground(Color.black);
    button1.setBounds(300,300,100,30);
    button1.setBackground(Color.green);
    button1.addActionListener(this);
    add(button1);

    button2 = new JButton("CLEAR..");
    button2.setFont(new Font("Arial",Font.BOLD,14));
    button2.setForeground(Color.black);
    button2.setBounds(450,300,100,30);
    button2.setBackground(Color.green);
    button2.addActionListener(this);
    add(button2);


    button3 = new JButton("SING UP..");
    button3.setFont(new Font("Arial",Font.BOLD,14));
    button2.setForeground(Color.black);
    button3.setBounds(300,350,250,30);
    button3.setBackground(Color.green);
    button3.addActionListener(this);
    add(button3);


    ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("backbge.png"));
    Image iii2 =iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
    ImageIcon iii3 = new ImageIcon(iii2);
    JLabel iiimage = new JLabel(iii3);
    iiimage.setBounds(0,0,850,480);
    add(iiimage);

    setLayout(null);
    setSize(850,480);
    setLocation(450,200);
    setVisible(true);
  }
  @Override
  public void actionPerformed(ActionEvent e){
    try{
      if(e.getSource()==button1){

      }else if (e.getSource()==button2){
        textField2.setText("");
        passwordField3.setText("");

      }else if(e.getSource()==button3){

      }

    }catch(Exception E){
      E.printStackTrace();
    }

  }
  public static void main(String[] args) {
    new Login();
  }
  
}
