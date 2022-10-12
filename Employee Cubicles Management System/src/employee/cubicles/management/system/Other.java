
package employee.cubicles.management.system;
import javax.swing.*;    
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.net.URL;
public class Other extends JFrame implements ActionListener {  
    Other(){
        JButton b,b2;
          b=new JButton("Task");  
         b2=new JButton("Query");  
    b.setBounds(50,100,95,30);  
     b.addActionListener(this);
     b2.setBounds(150,100,95,30);  
      b2.addActionListener(this);
    add(b); 
    add(b2);
     setTitle("Other ");
    setSize(400,400);  
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLocationRelativeTo(null);
    setLayout(null);  
    setVisible(true);
    }
     public void actionPerformed(ActionEvent ae) {
       try{
             Desktop.getDesktop().browse(new URL("https://otp-generator-14949.web.app/").toURI());  // react
              Desktop.getDesktop().browse(new URL("https://task-reactjs-1ad22.web.app/").toURI());  //react
               Desktop.getDesktop().browse(new URL("http://localhost:8080/pr2_lang_u_know/").toURI());  //jsp
        }
        catch(Exception e){
        
        }
   }
      
public static void main(String[] args) {  
    
      new Other();
}  
}  
