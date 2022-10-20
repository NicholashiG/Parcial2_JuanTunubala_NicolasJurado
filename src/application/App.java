package application;


import controllers.SingletonController;
import model.Cliente;
import model.Pedido;
import model.Producto;
import model.Restaurante;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {

    /**
     * @authors Nicolás Jurado Ramírez - Juan Manuel Tunubala Larrota
     */

    public static void main(String[] args) throws IOException {
        // Se obtiene la instancia de restaurante desde el singleton
        Restaurante restaurante = SingletonController.getInstance().getRestaurante();
        // Función de buscar un producto en el archivo properties
        restaurante.buscarProductos("0001");
        restaurante.buscarProductos("0003");
        // Se crean los clientes
        Cliente cliente1 = new Cliente("Juan","Tubulaba", "30000", "Cedula", "1234", 1 );
        Cliente cliente2 = new Cliente("Nicolas","Jurado", "1234453", "Cedula", "123456", 2 );
        // Se añaden los clientes al array de clientes y al archivo clientes.txt
        restaurante.nuevoCliente(cliente1);
        restaurante.nuevoCliente(cliente2);
        Producto producto1 = new Producto("0001","Pan", 1000);
        Producto producto2 = new Producto("0002","Arepa", 1000);
        Producto producto3 = new Producto("0003","Arroz", 1000);
        ArrayList<Producto> productos1 = new ArrayList<>();
        ArrayList<Producto> productos2 = new ArrayList<>();
        productos1.add(producto1);
        productos2.add(producto2);
        productos2.add(producto3);

        // Se crean los pedidos
        Pedido pedido1 = new Pedido("20-10-22",20000,cliente1, productos1);
        Pedido pedido2 = new Pedido("19-10-22",42344,cliente2, productos1);
        Pedido pedido3 = new Pedido("22-10-22",30000,cliente1, productos1);
        // Se añade el pedido al array de clientes y al archivo binario y xml
        restaurante.nuevoPedido(pedido1);
        restaurante.nuevoPedido(pedido2);
        restaurante.nuevoPedido(pedido3);
    }



}
