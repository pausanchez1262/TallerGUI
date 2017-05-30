/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4.LoanCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author javier
 */
public class Controller implements ActionListener{
    
    private Model model;
    private View view;
    
    public Controller(Model model, View view){ 
      this.model = model;
      this.view = view;
      this.view.setController(this);
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        String interest = view.getField1().getText();
        double annualInterest = Double.parseDouble(interest);
        
        String year = view.getField2().getText();
        int numberYear = Integer.parseInt(year);
        
        String amount = view.getField3().getText();
        double loanAmount = Double.parseDouble(amount);
        
        double total = loanAmount*(annualInterest/100);
        view.getField5().setText(" " + total);
        
        double monthly = total/12;
        view.getField4().setText(" " + monthly);
        
    }
    
    public void startApplication(){
        this.view.setVisible(true);
    } 
}