/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1y2;
import javax.swing.JOptionPane;

/**
 *
 * @author LeonardoCZ
 */
public class ejercicio1y2 {
    private int tamano;
    private int arreglo[];
    
    public ejercicio1y2(int tamano){
        this.tamano = tamano;
        this.arreglo = new int[this.tamano];
    }
   
    public void rellenarArreglo(){
        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Digite la edad"));
        }
    }
    public void imprimirArreglo(){
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Posicion: "+i +" valor: "+arreglo[i]);
        }
    }
    public void encontrarNumero(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Digite el numero a buscar en el arreglo"));
        
        int i=0;
        while(i<tamano && arreglo[i]<numero){
            i++;
        }
        if(i==tamano){
            System.out.println("\nNumero no encontrado");
        }
        else{
            if(arreglo[i]== numero){
                System.out.println("\nNumero encontrado, en la posicion: "+i);
            }
            else{
                System.out.println("\nNumero no encontrado");
            }
        }
    }
}
