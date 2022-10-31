/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1y2;
import javax.swing.JOptionPane;

/**
 *
 * @author LeonardoCZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamano = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Digite el tamaño del arreglo"));
        ejercicio1y2 ejercicio1y2 = new ejercicio1y2(tamano);
        ejercicio1y2.rellenarArreglo();
        ejercicio1y2.imprimirArreglo();
        ejercicio1y2.encontrarNumero();
        
       
                
    }
    
}
