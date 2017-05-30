/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2.OpenClose;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author javier
 */
public class OpenClose extends JPanel implements ActionListener{

    public OpenClose(){
        
        panel1 = new JPanel(new GridLayout(3,1));
        JButton button =  new JButton();
        button.setText("Open/Close");
        button.setBackground(Color.RED);
        panel1.add(button);

        JTextField textField = new JTextField();
        textField.setText("1234");
        panel1.add(textField);
        
        JButton button2 =  new JButton();
        button2.setText("Change Combination");
        panel1.add(button2);
        add(panel1);
        
        panelVerde = new JPanel(new GridLayout(3,1));
        JButton button1 =  new JButton();
        button1.setText("Open/Close");
        button1.setBackground(Color.GREEN);
        panelVerde.add(button1);
        
        JTextField textFieldVerde = new JTextField();
        textFieldVerde.setText("1234");
        panelVerde.add(textFieldVerde);
        
        JButton button3 = new JButton();
        button3.setText("Change Combination");
        panelVerde.add(button3);    
    }
    private static JPanel panel1 = new JPanel();
    private static JPanel panelVerde = new JPanel();
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Combination();
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        for (Component component : getComponents())
            if (panel1 == component) {
                remove(panel1);
                add(panelVerde);
            } else {
                remove(panelVerde);
                add(panel1);
            }
        repaint();
        revalidate();
    }
    public static void Combination(){
        
        JFrame frame = new JFrame("PanelSwap");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent newContentPane = new OpenClose();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);

        frame.pack();
        frame.setVisible(true);
    }
}