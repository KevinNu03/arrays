/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import modelo.Pelicula;

/**
 *
 * @author diego
 */
public class Funciones {
    
    ArrayList<Pelicula> peli = new ArrayList();
    
    public void llenar(){
        
        Pelicula p1 = new Pelicula("El rey león", "Jon Favreau", 2019 ,"Buena Pelicula animada convertida en realista"  );
        Pelicula p2 = new Pelicula("Vengadores: Endgame", "Guy Ritchie", 2019 ,"excelente pelicula para todo publico"  );
        Pelicula p3 = new Pelicula("Toy Story 4" , "Josh Cooley", 2019 , "Buena pelicula infantil");
        Pelicula p4 = new Pelicula("Spider-Man: Lejos de casa", "Jon Watts", 2019 ,"Pelicula regular"  );
        Pelicula p5 = new Pelicula("Capitana Marvel", "Anna Boden", 2019 ,"Buena Pelicula  "  );
        Pelicula p6 = new Pelicula("Joker", "Todd Phillips", 2019, "Pelicula de la historia del joker "  );
        Pelicula p7 = new Pelicula("Aladdin", "Guy Ritchie", 2019, "Excelente pelicula");
        Pelicula p8 = new Pelicula("Dumbo", "Tim Burton", 2019, "Excelente pelicula");
        Pelicula p9 = new Pelicula("Frozen II", "Jennifer Michelle Lee", 2019, "Pelicula animada e infantil ");
        Pelicula p10= new Pelicula("Maléfica: Maestra del Mal", "Joachim Rønning", 2019, "Buena pelicula ");
        
        peli.add(p1);
        peli.add(p2);
        peli.add(p3);
        peli.add(p4);
        peli.add(p5);
        peli.add(p6);
        peli.add(p7);
        peli.add(p8);
        peli.add(p9);
        peli.add(p10);
        
    }
    
    public void buscar(String nombrePeli){
         
        Iterator it = peli.iterator();
        
        while(it.hasNext()){
            Pelicula pelicula = (Pelicula)it.next();
            if ( nombrePeli.equalsIgnoreCase(pelicula.getNombre()) ) {
                JOptionPane.showMessageDialog(null,"Nombre: "+ pelicula.getNombre()+ " - Director: " + pelicula.getDirector()+ " - Año: " + pelicula.getAño() + " - Reseña: " + pelicula.getReseña() + ". ");
                
            }
        
        }
        
        
    }
    
    public void vender(int cantidad , String nombre ){
        Iterator it = peli.iterator();
        while(it.hasNext()){
            Pelicula pelicula = (Pelicula)it.next();
            if ( nombre.equalsIgnoreCase(pelicula.getNombre()) ) {
                JOptionPane.showMessageDialog(null, pelicula.getNombre() + pelicula.getDirector() + pelicula.getAño() + pelicula.getReseña());
                pelicula.setEntrada(cantidad + pelicula.getEntrada());
            }
            
        }
        
    }
    
    public void totalD(String nombre) {
        Iterator it = peli.iterator();
        while (it.hasNext() ){
           Pelicula pelicula = (Pelicula)it.next();
           if (nombre.equalsIgnoreCase(pelicula.getNombre())){
               JOptionPane.showMessageDialog(null, pelicula.getNombre());
           }
        } 
       
    }
 }

