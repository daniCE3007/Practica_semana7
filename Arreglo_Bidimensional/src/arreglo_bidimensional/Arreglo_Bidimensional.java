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
        
        int a = 0;
        while (a != 5) {
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione "
                    + "la opcion que desea ejecutar \n"
                    + "1. Sumar Esquinas \n"
                    + "2. Sumar Diagonal \n"
                    + "3. Sumar Diagonal Inversa \n"
                    + "4. Numero mayor de la matriz \n"
                    + "5. Salir \n"));

            if (a == 1) {
                arreglo.sumaEsquinas();
            } else if (a == 2) {
                arreglo.sumaDiagonal();
            } else if (a == 3) { 
                arreglo.sumaDiagonalInversa();
            } else if (a == 4) {
                arreglo.mayorNumeroMat();
            } else if (a == 5) {
                JOptionPane.showMessageDialog(null, "Gracias por usar nuestra programa");
            } else {
                JOptionPane.showMessageDialog(null, "Ha "
                        + "seleccionado una opcion no valida, ingrese otra opcion");
            }
        }
      
    }
    
}
