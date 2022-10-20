package persistencia;



import model.Cliente;
import model.Restaurante;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;


public class Persistencia {

	public static final String RUTA_ARCHIVO_CLIENTES = "src/resources/clientes.txt";
	public static final String RUTA_ARCHIVO_PROPERTIES = "src/resources/productos.properties";
	public static final String RUTA_ARCHIVO_BIN = "src/resources/model.dat";
	public static final String RUTA_ARCHIVO_XML = "src/resources/model.xml";
	public static final String RUTA_ARCHIVO_LOG = "src/resources/log.log";
	static Properties propiedades = new Properties();

	/**
	 * Guarda en un archivo de texto todos la informaci�n de las personas almacenadas en el ArrayList
	 *
	 * @throws IOException
	 */
	public static void guardarClientes(ArrayList<Cliente> listaClientes) throws IOException {
		// TODO Auto-generated method stub
		String contenido = "";
		
		for(Cliente cliente:listaClientes)
		{
			contenido+= cliente.toString()+"\n";
		}
		ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_CLIENTES, contenido, false);
		
	}
	
//	----------------------LOADS------------------------
	


	
	
	//------------------------------------SERIALIZACION  y XML y BIN


	
	//Guarda el restaurante en un archivo serializado xml
	public static void guardarRecursoProgramaXML(Restaurante restaurante) {
		
		try {
			ArchivoUtil.salvarRecursoSerializadoXML(RUTA_ARCHIVO_XML, restaurante);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Guarda el restaurante en un archivo serializado binario

	public static void guardarRecursoProgramaBin(Restaurante restaurante) {try {
		ArchivoUtil.salvarRecursoSerializado(RUTA_ARCHIVO_BIN, restaurante);
	} catch (Exception e) {
		e.printStackTrace();
	}

	}


	//Busca en el archivo properties el código que le llega por parámetro
	public static void buscarPropertiesProductos(String codigo){
		ArrayList<String> modalidades = new ArrayList<>();
		try {
			/* Leemos el archivo con InputStream */
			InputStream entrada = new FileInputStream(
					RUTA_ARCHIVO_PROPERTIES);

			/*
			 * Cargamos nuestro archivo en el objeto propiedades instanciado anteriormente
			 */
			propiedades.load(entrada);



			String producto = (String) propiedades.get(codigo);
			if (producto==null){
				System.out.println("El archivo no existe");
			}
			else{
				System.out.println(producto);
			}

			/* Cerramos nuestro InputStream */
			entrada.close();

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	//Guarda lo que se le mande en el log
	public static void guardaRegistroLog(String mensajeLog, int nivel, String accion)
	{
		ArchivoUtil.guardarRegistroLog(mensajeLog, nivel, accion, RUTA_ARCHIVO_LOG);
	}
}
