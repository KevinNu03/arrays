/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author diego
 */

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import vista.Funciones;


public class Cine extends JFrame implements ActionListener{
    
    //ArrayList aut = new ArrayList();
 
    
    Funciones fu = new Funciones();
    JLabel l1;
    JLabel l2;
    JTextArea a1;
    JTextArea a2;
    JTextField t1;
    JTextField t2;
    JButton b1;
    JButton b2;
    JButton b3;
    
    
    public Cine(){
         
        a1 = new JTextArea( "1)El rey león                                      6)Joker\n"
                                   +"2)Vengadores: Endgame               7)Aladdin\n"
                                   +"3)Toy Story 4                                      8)Dumbo\n"
                                   +"4)Spider-Man: Lejos de casa         9)Frozen II\n"
                                   +"5)Capitana Marvel                            10)Maléfica: Maestra del Mal\n",5,42 );
        l2 = new JLabel("pelicula ");
        t1 = new JTextField(40);
        l1= new JLabel("cantidad de tiquetes");
        t2 = new JTextField(40);
        b1 =new JButton(" Informacion: ");
        b2 = new JButton(" Valor a pagar: ");
        a2 = new JTextArea(10, 40);
        b3 = new JButton("Limpiar");

        
        setBounds(200,200,500,500);
        setLayout(new FlowLayout());
        add(a1);
        add(l2);
        add(t2);
        add(l1);
        add(t1);
        add(b1);
        add(b2);
        add(a2);
        add(b3);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
                
        setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String texBoton;
        
         
         texBoton = e.getActionCommand();
         if (e.getSource() == b1) {
         fu.llenar();
         fu.buscar(t2.getText());
         
        
        } else if(e.getSource() == b2) {
            int i;
            i=Integer.parseInt(t1.getText());
            a2.setText("total  a pagar : " + i*5000 + ", Tiquetes " + i);
            JOptionPane.showMessageDialog(null, "Total  a pagar: " + i + " Tiquetes" );
            
            
        }else if (e.getSource() == b3){
            a2.setText(null);
            t1.setText(null);
            t2.setText(null);
        }
        
            
    }
   

  
        
            
     }

 
    

