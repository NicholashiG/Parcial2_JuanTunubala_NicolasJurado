package model;

import java.io.Serializable;

public class Cliente implements Serializable {
    //Constructor vacío
    public Cliente() {
    }

    //Constructor con variables
    public Cliente(String nombre, String apellido, String telefono, String tipoId, String cedula, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.tipoId = tipoId;
        this.cedula = cedula;
        this.codigo = codigo;
    }

    //Variables
    private  int codigo = 0;
    private String nombre;
    private String apellido;
    private String telefono;
    private String tipoId;
    private String cedula;

    //Getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    //Método toString
    @Override
    public String toString() {
        return codigo+"@"+cedula+"@"+tipoId+"@"+nombre+"@"+apellido+"@"+telefono;
    }
}
