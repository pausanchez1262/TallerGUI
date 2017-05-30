/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3.MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

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
        this.model.setText(this.view.getField1().getText());
        this.model.setText(this.view.getField2().getText());
        
        this.view.getJLabel3( ).setText( "Hello, " + this.view.getField1().getText() + " " + this.view.getField2().getText() );
    }
    
    public void startApplication(){
        this.view.setVisible(true);
    } 
}
