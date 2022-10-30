/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglo_bidimensional;
import javax.swing.JOptionPane;

/**
 *
 * @author danic
 */

public class Arreglo {
    private int size;
    private int matriz[][];

    public Arreglo(int size) {
        this.size = size;
        this.matriz = new int[this.size][this.size];
    }
    public void rellenarArreglo() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        null, "Ingrese los números que desea "
                        + "en la matriz:"));
            }
        }  
    } 
    public void sumaEsquinas() {
        int esquinas = matriz[0][0]+ matriz[0][size-1]+ 
                matriz[size-1][0]+ matriz[size-1][size-1];
        JOptionPane.showMessageDialog(null, "La suma de las cuatro "
                + "esquinas es:" + esquinas);
    }
    public void sumaDiagonal(){
        int diagonal[]=new int[this.size];
        int sumaDiagonal = 0;
        /**se recorre la matriz para determinar las posiciones de los números que 
        conforman la diagonal*/
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i==j){
                    diagonal[i]= matriz[i][j];
                    sumaDiagonal+=diagonal[i];
                }
            }
        }
        JOptionPane.showMessageDialog(null, "La suma de la diagonal"
                + " es: " + sumaDiagonal );
        }

        
}   
    

