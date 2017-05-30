/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4.LoanCalculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author javier
 */
public class View extends JFrame{
    
    private Controller controller;
    
    private JLabel labelT;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField field1;
    private JTextField field2;
    private JTextField field3;
    private JTextField field4;
    private JTextField field5;
    private JButton button;
    
    public View(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(300, 250));
        setTitle("LoanCalculator");
        setLayout(new FlowLayout());
        
        labelT = new JLabel("Enter loan amount, interest rate, and years ");
        label1 = new JLabel("Annual Interest Rate ");
        field1 = new JTextField(10);
        label2 = new JLabel("Number of years ");
        field2 = new JTextField(10);
        label3 = new JLabel("Loan Amount ");
        field3 = new JTextField(10);
        label4 = new JLabel("Monthly Payment ");
        field4 = new JTextField(10);
        label5 = new JLabel("Total Payment ");
        field5 = new JTextField(10);
        button = new JButton("Compute Payment");
        setLayout(new FlowLayout());
        
        add((labelT), BorderLayout.NORTH);
        add(label1);
        add(field1);
        add(label2);
        add(field2);
        add(label3);
        add(field3);
        add(label4);
        add(field4);
        add(label5);
        add(field5);
        add(button);
        controller = new Controller(new Model(),this);
        button.addActionListener(controller);
        
        setVisible(true);
    }

    public Controller getController(){
        return controller;
    }
    
    public JLabel getJLabelT(){
        return labelT;
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
    
    public JLabel getJLabel4(){
        return label4;
    }
    
    public JLabel getJLabel5(){
        return label5;
    }
    
    public JTextField getField1() {
        return field1;
    }
    
    public JTextField getField2() {
        return field2;
    }
    
    public JTextField getField3() {
        return field3;
    }
    
    public JTextField getField4() {
        return field4;
    }
    
    public JTextField getField5() {
        return field5;
    }
    
    public JButton button(){
        return button;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
    
    public void setLabelT(JLabel labelT){
        this.labelT = labelT;
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
    
    public void setLabel4(JLabel label4){
        this.label4 = label4;
    }
    
    public void setLabel5(JLabel label5){
        this.label5 = label5;
    }

    public void setField1(JTextField field1) {
        this.field1 = field1;
    }
    
    public void setField2(JTextField field2) {
        this.field2 = field2;
    }
    
    public void setField3(JTextField field3) {
        this.field3 = field3;
    }
    
    public void setField4(JTextField field4) {
        this.field4 = field4;
    }
    
    public void setField5(JTextField field5) {
        this.field5 = field5;
    }
    
    public void setButton(JButton button){
        this.button = button;
    }
}
