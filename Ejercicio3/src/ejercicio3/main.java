/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import javax.swing.JOptionPane;

/**
 *
 * @author fanta
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Creacion de vendedores
        vendedor vendedor1 = new vendedor("Charlie Malagan", "01", 
                new int[] {300, 700, 200, 350});
        vendedor vendedor2 = new vendedor("Marge Simspson", "02", 
                new int[] {115, 250, 1000, 275});
        vendedor vendedor3 = new vendedor("Nahuel Pauls", "03", 
                new int[] {755, 320, 330, 215});
        vendedor vendedor4 = new vendedor("Erick Mose", "04", 
                new int[] {500, 200, 350, 375});
        vendedor vendedor5 = new vendedor("Roger Willson", "05", 
                new int[] {275, 400, 445, 650});

        //Menu Principal
        int opcionMenu = 0;

        while (opcionMenu != 3) {
            opcionMenu = Integer.parseInt(JOptionPane.showInputDialog("Menu "
                    + "Principal\n"
                    + "1. Mostrar total de ventas por vendedor\n"
                    + "2. Mostrar total de todas las ventas\n"
                    + "3. Salir"));

            if (opcionMenu == 1) {

                //Menu total por vendedor
                int opcionVendedor = 0;

                while (opcionVendedor != 6) {

                    opcionVendedor = Integer.parseInt(JOptionPane.
                            showInputDialog("Seleccione el vendedor a mostrar: \n"
                        + "1. Vendedor 1\n"
                        + "2. Vendedor 2\n"
                        + "3. Vendedor 3\n"
                        + "4. Vendedor 4\n"
                        + "5. Vendedor 5\n"
                        + "6. Volver"));

                    if (opcionVendedor == 1) {
                        JOptionPane.showMessageDialog(null, "Nombre: " 
                                + vendedor1.getNombre() + "\n"
                        + "ID: " + vendedor1.getID() + "\n"
                        + "Total de ventas: " + vendedor1.totalVentas());
                    } else if (opcionVendedor == 2) {
                        JOptionPane.showMessageDialog(null, "Nombre: " 
                                + vendedor2.getNombre() + "\n"
                                    + "ID: " + vendedor2.getID() + "\n"
                                    + "Total de ventas: " + vendedor2.
                                            totalVentas());
                    } else if (opcionVendedor == 3) {
                        JOptionPane.showMessageDialog(null, "Nombre: " 
                                + vendedor3.getNombre() + "\n"
                                    + "ID: " + vendedor3.getID() + "\n"
                                    + "Total de ventas: " + vendedor3.
                                            totalVentas());
                    } else if (opcionVendedor == 4) {
                        JOptionPane.showMessageDialog(null, "Nombre: " 
                                + vendedor4.getNombre() + "\n"
                                    + "ID: " + vendedor4.getID() + "\n"
                                    + "Total de ventas: " + vendedor4.
                                            totalVentas());
                    } else if (opcionVendedor == 5) {
                        JOptionPane.showMessageDialog(null, "Nombre: " 
                                + vendedor5.getNombre() + "\n"
                                    + "ID: " + vendedor5.getID() + "\n"
                                    + "Total de ventas: " + vendedor5.
                                            totalVentas());

                    } else if (opcionVendedor == 6) {
                        JOptionPane.showMessageDialog(null, "Volviendo...");
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                    }
                }
            } else if (opcionMenu == 2) {
                JOptionPane.showMessageDialog(null, "Total de ventas de todos "
                        + "los vendedores: " + (vendedor1.totalVentas() 
                                + vendedor2.totalVentas() 
                                + vendedor3.totalVentas() 
                                + vendedor4.totalVentas() 
                                + vendedor5.totalVentas()));
            } else if (opcionMenu == 3) {
                JOptionPane.showMessageDialog(null, "Gracias por utilizar "
                        + "el programa.");
            } else {
                JOptionPane.showMessageDialog(null, "Opcion invalida");
            }

        }
    }
}
