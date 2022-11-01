package ejercicio3;
import javax.swing.JOptionPane;

public class vendedor {
    
    //Atributos
    private String nombre;
    private String ID;
    private int ventas[];

    //Constructor vacio
    public vendedor() {

    }

    //Constructor con atributos
    public vendedor(String nombre, String ID, int ventas[]) {
        this.nombre = nombre;
        this.ID = ID;
        this.ventas = ventas;
    }

    //Metodos SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setVentas(int ventas[]) {
        this.ventas = ventas;
    }

    //Metodos GET
    public String getNombre() {
        return nombre;
    }

    public String getID() {
        return ID;
    }

    public int[] getVentas() {
        return ventas;
    }

    //Metodo total de ventas
    public int totalVentas() {
        int total = 0;
        for (int i = 0; i < ventas.length; i++) {
            total += ventas[i];
        }
        
        return total;
    }

}
