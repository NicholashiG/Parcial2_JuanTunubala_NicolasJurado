package controllers;

import model.Cliente;
import model.Pedido;
import model.Restaurante;
import persistencia.Persistencia;

import java.io.IOException;
import java.util.ArrayList;

public class SingletonController {

	Restaurante restaurante;



	// Static variable single_instance of type Singleton
	private static SingletonController instancia = null;

	// Declaring a variable of type String

	// Constructor of this class
	// Here private constructor is used to
	// restricted to this class itself
	private SingletonController() {
		restaurante = new Restaurante();
	}

	// Method
	// Static method to create instance of Singleton class
	public static SingletonController getInstance() {
		// To ensure only one instance is created
		if (instancia == null) {
			instancia = new SingletonController();
		}
		return instancia;
	}


	public static void guardarClientes(ArrayList<Cliente> clientes) throws IOException {
		Persistencia.guardarClientes(clientes);
	}


	public static void buscarProducto(String codigo){
		Persistencia.buscarPropertiesProductos(codigo);
	}

	public static void guardarPedidos(Restaurante restaurante) {
		Persistencia.guardarRecursoProgramaXML(restaurante);
		Persistencia.guardarRecursoProgramaBin(restaurante);
	}

	public static void guardarPedidoEnLog(Pedido pedido) {
		Persistencia.guardaRegistroLog("Se ha hecho un nuevo pedido por "+pedido.getCliente().getNombre()+" "+pedido.getCliente().getApellido(), 1, "Nuevo Pedido: "+pedido);
	}


	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}
}