package model;

import controllers.SingletonController;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Restaurante implements Serializable {

    //Constructor vacío
    public Restaurante() {
    }

    //Constructor con variables
    public Restaurante(ArrayList<Pedido> pedidos, ArrayList<Cliente> clientes, ArrayList<Producto> productos) {
        this.pedidos = pedidos;
        this.clientes = clientes;
        this.productos = productos;
    }

    //Variables
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Producto> productos = new ArrayList<>();

    //Getters y setters

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

   //Métodos de la clase

    //Método que busca un producto en un properties
    public void buscarProductos(String codigo){
        SingletonController.buscarProducto(codigo);
    }

    //Método que añade el cliente al arreglo clientes y lo guarda en txt
    public void nuevoCliente(Cliente cliente) throws IOException {
        clientes.add(cliente);
        SingletonController.guardarClientes(clientes);
    }

    //Método que añade el pedido al arreglo pedidos y lo serializa
    public void nuevoPedido(Pedido pedido) throws IOException {
        pedidos.add(pedido);
        SingletonController.guardarPedidos(SingletonController.getInstance().getRestaurante());
        SingletonController.guardarPedidoEnLog(pedido);
    }
}
