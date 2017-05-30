/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1.Calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author javier
 */
public class Calculadora {

    public static void main(String [] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(360,230));
        frame.setTitle("Calculator");
        frame.setLayout(new BorderLayout());
        
        
        JTextField texto = new JTextField(25);       
        frame.add(texto, BorderLayout.PAGE_START);
        
        FlowLayout BackSpace = new FlowLayout();  
        BackSpace.setVgap(5);
        JPanel boton = new JPanel(BackSpace);
        boton.add(new JButton("BackSpace")).setForeground(Color.red);
        boton.add(new JButton("      CE       ")).setForeground(Color.red);
        boton.add(new JButton("       C       ")).setForeground(Color.red);
        frame.add(boton,BorderLayout.AFTER_LAST_LINE);
        
      
        JPanel MR = new JPanel(new GridLayout(4,1));
        MR.add(new JButton("MC")).setForeground(Color.red);
        MR.add(new JButton("MR")).setForeground(Color.red);
        MR.add(new JButton("MS")).setForeground(Color.red);
        MR.add(new JButton("M+")).setForeground(Color.red);
        MR.setBackground(Color.WHITE);
        frame.add(MR, BorderLayout.WEST);
        
        
        JPanel A = new JPanel(new GridLayout(4,2));
        A.add(new JButton("/")).setForeground(Color.red);
        A.add(new JButton("sqrt"));
        A.add(new JButton("*")).setForeground(Color.red);
        A.add(new JButton("%"));
        A.add(new JButton("-")).setForeground(Color.red);
        A.add(new JButton("1/x"));
        A.add(new JButton("+")).setForeground(Color.red);
        A.add(new JButton("=")).setForeground(Color.red);
        A.setBackground(Color.WHITE);
        frame.add(A, BorderLayout.EAST);
        
        
        
        JPanel centerPanel = new JPanel(new GridLayout(4,3));
        centerPanel.add(new JButton("7"));
        centerPanel.add(new JButton("8"));
        centerPanel.add(new JButton("9"));
        centerPanel.add(new JButton("4"));
        centerPanel.add(new JButton("5"));
        centerPanel.add(new JButton("6"));
        centerPanel.add(new JButton("1"));
        centerPanel.add(new JButton("2"));
        centerPanel.add(new JButton("3"));
        centerPanel.add(new JButton("0"));
        centerPanel.add(new JButton("+/-"));
        centerPanel.add(new JButton("."));
        frame.add(centerPanel, BorderLayout.CENTER); 
        

        frame.setVisible(true);
        
        
        
        }
}
