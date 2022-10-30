/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo_bidimensional;
import javax.swing.JOptionPane;
/**
 *
 * @author danic
 */
public class Arreglo_Bidimensional {

    /**
     * @param args the command line arguments
     * Piense en una matriz de N x N,solicitando el tamaño al usuario. 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese el tamaño que desea para la matriz:"));  
        Arreglo arreglo = new Arreglo(size);
        arreglo.rellenarArreglo();
        arreglo.sumaEsquinas();
        arreglo.sumaDiagonal();
        
        
        
        
        
        
    }
    
}
