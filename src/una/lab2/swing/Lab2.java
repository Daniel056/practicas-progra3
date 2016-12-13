/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.lab2.swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author Estudiante
 */
public class Lab2 extends JFrame {

    /**
     * @param args the command line arguments
     */
    
    JPanel panel1= new JPanel();
    JTextField username= new JTextField(15);
    JTextField cel= new JTextField(15);
    JButton accept= new JButton("Accept");
    JButton clear= new JButton("Clear");
    JLabel name= new JLabel("Name");
    JLabel tel= new JLabel("Cel");
    JLabel sexo= new JLabel("Sexo");
    JLabel result= new JLabel("Resultado");
    String[] sexos= {"M", "F"};
    JComboBox sexoComboBox= new JComboBox(sexos); 
    JTextArea textarea= new JTextArea(4,20);
    

    public Lab2(){
        super("Lab2");
        setSize(250,300);
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout lm = new FlowLayout(FlowLayout.LEFT);
        panel1.setLayout(lm);
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        
        panel1.setName("Form");
        name.setName("lblName");
        tel.setName("lblPhone");
        sexo.setName("lblGender");
        result.setName("lblResult");

        username.setName("name");
        cel.setName("phone");
        sexoComboBox.setName("gender");
        textarea.setName("comments");
        accept.setName("ok");
        clear.setName("clean");
        
        panel1.add(name);
        panel1.add(username);
        panel1.add(tel);
        panel1.add(cel);
        panel1.add(sexo);
        panel1.add(sexoComboBox);
        panel1.add(result);
        panel1.add(textarea);
        panel1.add(accept);
        panel1.add(clear);
       
        add(panel1);
        setVisible(true);
       
    }
    
     private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Lab2 lb= new Lab2();
    }
    
}
