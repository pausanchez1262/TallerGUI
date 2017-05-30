/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3.MVC;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Paula
 */
public class View extends JFrame{
    
    private Controller controller;
    
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField field1;
    private JTextField field2;
    private JButton button;
    
    public View(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(300, 500));
        setTitle("TextFieldTest");
        setLayout(new FlowLayout());
        label1 = new JLabel("Enter your first name: ");
        field1 = new JTextField(10);
        label2 = new JLabel("Enter your last name: ");
        field2 = new JTextField(10);
        this.button = new JButton("Done");
        label3 = new JLabel();
        setLayout(new FlowLayout());
        
        
        add(label1);
        add(field1);
        add(label2);
        add(field2);
        add(button);
        controller=new Controller(new Model(),this);
        button.addActionListener(controller);
        
        add(label3);
        setVisible(true);
    }
    
    public Controller getController() {
        return controller;
    }
    
    public JLabel getJLabel1(){
        return label1;
    }
    
    public JLabel getJLabel2(){
        return label2;
    }
    
    public JLabel getJLabel3(){
        return label3;
    }
    
    public JTextField getField1() {
        return field1;
    }
    
    public JTextField getField2() {
        return field2;
    }
    
    public JButton button(){
        return button;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
    
    public void setLabel1(JLabel label1){
        this.label1 = label1;
    }
    
    public void setLabel2(JLabel label2){
        this.label2 = label2;
    }
    
    public void setLabel3(JLabel label3){
        this.label3 = label3;
    }

    public void setField1(JTextField field1) {
        this.field1 = field1;
    }
    
    public void setField2(JTextField field2) {
        this.field2 = field2;
    }
    
    public void setButton(JButton button){
        this.button = button;
    }
}
