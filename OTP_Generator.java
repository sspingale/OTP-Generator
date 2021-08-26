package Learn;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class OTP_Generator {
    public static void main(String[] args) {
        //declaring frame f in swing window in java
        JFrame f = new JFrame();
        //declaring and initializing variables min and max
        int min = 100000,max = 999999;
        //getting random numbers from the computer
        int p = (int)((Math.random()*(max-min+1))+min);
        int q = (int)((Math.random()*(max-min+1))+min);
        //adding label 1 to show the output and setting its boundaries
        JLabel l1 = new JLabel("Your one time OTP is "+p);
        l1.setBounds(165, 200, 200, 30);
        //setting the label 1 as not visible 
        l1.setVisible(false);
        //addling label 2 to show the output and setting its boundaries
        JLabel l2 = new JLabel("Your one time OTP is "+q);
        l2.setBounds(164, 200, 200, 30);
        //keeping the label 2 initially not visible to the user
        l2.setVisible(false);
        //adding button 2 and setting its boundaries
        JButton b2 = new JButton(" Clear ");
        b2.setBounds(100, 300, 75, 30);
        //keeping the button initially not visible to the user 
        b2.setVisible(false);
        //setting function on the clear button in swing window in java frame f
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e1){
                l1.setText("");
                l2.setText("");
            }
        });
        //adding button 3 and setting its boundaries
        JButton b3 = new JButton(" Get Another OTP");
        b3.setBounds(165, 100, 150, 30);
        //keepingl the button initially not visible to the user
        b3.setVisible(false);
        //adding function to the button 3 in the swing window frame f in java
        b3.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e3){
                int x = e3.getClickCount();
                if(x%2!=0){
                    l1.setVisible(false);
                    l2.setVisible(true);
                }
                else{
                    l2.setVisible(false);
                    l1.setVisible(true);
                }
            }
        });
        //adding button 4 and setting its boundaries
        JButton b4 = new JButton(" Exit ");
        b4.setBounds(300, 300, 75, 30);
        //keeping the button 4 invisible to the user initially
        b4.setVisible(false);
        //adding fucntion to the button exit to close the swing window frame f in java
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e3){
                System.exit(0);
            }
        });
        //adding button get otp and setting its boundaries
        JButton b1 = new JButton(" Get OTP ");
        b1.setBounds(165, 100, 150, 30);
        //adding function to the button 1
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b1.setVisible(false);
                l1.setVisible(true);
                b2.setVisible(true);
                b3.setVisible(true);
                b4.setVisible(true);
            }
        });
        //adding button 1, 2, 3, 4 and label 1 to the swing window frame f
        f.add(b1);f.add(l1);f.add(l2);f.add(b2);f.add(b3);f.add(b4);
        //setting title to the swing window frame f 
        f.setTitle(" OTP Generator ");
        //setting size of the the swing window frame f
        f.setSize(500, 500);
        //setting the swing window frame f to open at the center of the screen when we compile and run the program
        f.setLocationRelativeTo(null);
        //setting layout to the swing window frame f
        f.setLayout(null);
        //keeping the swing frame window f visible on the screen when you run the program
        f.setVisible(true);
        //applying function to the "X" button on the top right corner of the swing window frame f
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
