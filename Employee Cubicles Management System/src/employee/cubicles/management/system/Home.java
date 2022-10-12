
package employee.cubicles.management.system;

import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
public class Home extends JFrame implements ActionListener  {
      JButton add,view,update,remove,query,task;
    Home(){
        
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
       Image i2=i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       image.setBounds(0,0,1120,630);
       add(image);
       JLabel heading =new JLabel("Employee Cubical Management System");
       heading.setBounds(650,20,400,40);
       heading.setFont(new Font("serif",Font.BOLD,20));
       image.add(heading);
       
       add=new JButton("Add Employee");
       add.setBounds(650,80,150,40);
       add.addActionListener(this);
       image.add(add);
       view=new JButton("View Employee");
       view.setBounds(820,80,150,40);
        view.addActionListener(this);
       image.add(view);
      update=new JButton("Update Employee");
       update.setBounds(650,140,150,40);
        update.addActionListener(this);
       image.add(update);
       remove=new JButton("Remove Employee");
       remove.setBounds(820,140,150,40);
        remove.addActionListener(this);
       image.add(remove);
       
    
       
       query=new JButton("Other");
       query.setBounds(800,200,160,40);
       query.addActionListener(this);
       image.add(query);
       
       
       
       setTitle("Home Page");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(1120,630);
      setLocationRelativeTo(null);
      setVisible(true);      
    }
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==add){
        new AddEmployee();
         
       }else if(ae.getSource()==view){
         new ViewEmployee();
       }
       else if(ae.getSource()==update){
          new ViewEmployee();
       }
       else if(ae.getSource()==remove){
        new RemoveEmployee();
       }else if(ae.getSource()==query){
           new Other();
       }
       
       else {
       
       }
       
    }
    public static void main(String args[]){
    new Home();
    }
}
