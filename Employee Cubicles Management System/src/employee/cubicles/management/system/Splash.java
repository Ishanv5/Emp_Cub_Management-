package employee.cubicles.management.system;
import java.awt.Color;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
public class Splash extends JFrame implements ActionListener {
    Splash(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       JLabel heading = new JLabel("EMPLOYEE CUBICLES MANAGEMENT SYSTEM! "); 
        JLabel heading2 = new JLabel("By Ishan And his Teams. "); 
       heading.setBounds(80,30,1200,60);
       heading.setFont(new Font("serif",Font.PLAIN,50));
       heading.setForeground(Color.BLACK);
         add(heading);
         add(heading2);
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
       Image i2=i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       image.setBounds(50,90,1050,500);
       add(image);
       JButton clickhere=new JButton("CLICK HERE TO CONTINUE ");
       clickhere.setBounds(400,400,300,70);
       clickhere.setBackground(Color.BLACK);
       clickhere.setForeground(Color.WHITE);
       clickhere.addActionListener(this);
       image.add(clickhere);
       Image icons = Toolkit.getDefaultToolkit().getImage("icons/c.png");    
       setIconImage(icons);   
      setSize(1250,650);
      setLocation(200,50);
      setTitle("Ishan & Akib & Shubham & Neha  - Employee cubical management System ");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      while(true){
      heading.setVisible(false);
      try{
      Thread.sleep(500);
      }
      catch(Exception e){
      
      }
      heading.setVisible(true);
      try{
      Thread.sleep(500);
      }
      catch(Exception e){
      
      }
      }
    }
    public void actionPerformed(ActionEvent ae){
      setVisible(false);
      new Login();
    }
   public static void main(String args[]){
   new Splash();
   }    
}
