package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Pedido implements Serializable {
    //Constructor vacío
    public Pedido() {
    }

    //Constructor con variables


    public Pedido(String fecha, int total, Cliente cliente, ArrayList<Producto> producto) {
        this.fecha = fecha;
        this.total = total;
        this.cliente = cliente;
        this.producto = producto;
    }

    //Variables
    private String fecha;
    private int total;
    private Cliente cliente;
    private ArrayList<Producto> producto;


    //Getters y setters

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "fecha='" + fecha + '\'' +
                ", total=" + total +
                ", cliente=" + cliente +
                ", producto=" + producto +
                '}';
    }
}
