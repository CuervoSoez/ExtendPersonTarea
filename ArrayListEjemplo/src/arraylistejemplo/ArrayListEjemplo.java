/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistejemplo;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ArrayListEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> pedidos = new ArrayList<>();

        pedidos.add("Hamburguesa ranchera");
        pedidos.add("Pizza hawaiana");
        pedidos.add("Changua");
        pedidos.add("Tacos al pastor");

        System.out.println("Pedidos actuales:");
        System.out.println(pedidos);

        String primerPedido = pedidos.get(0);
        System.out.println("Primer pedido: " + primerPedido);

        pedidos.set(2, "Jugo de mango");
        System.out.println("Pedido actualizado en posición 2:");
        System.out.println(pedidos);

        pedidos.remove(1); 
        System.out.println("Pedido eliminado en posición 1:");
        System.out.println(pedidos);

        boolean existe = pedidos.contains("Tacos al pastor");
        System.out.println("¿Hay tacos al pastor? " + (existe ? "Sí" : "No"));

        System.out.println(" Total de pedidos: " + pedidos.size());

        pedidos.clear();
        System.out.println(" Lista de pedidos vaciada:");
        System.out.println(pedidos);
    }
}
