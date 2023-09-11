/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author josue
 */
public class Cliente {
    private int IDCLIENTE;
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private int edad;
    
    public Cliente(){}

    public Cliente(int _idCliente, String _nombre, String _apellidos, String _nacionalidad, int _edad){
        this.IDCLIENTE = _idCliente;
        this.nombre = _nombre;
        this.apellidos = _apellidos;
        this.nacionalidad = _nacionalidad;
        this.edad = _edad;
    }

    /**
     * @return the IDCLIENTE
     */
    public int getIDCLIENTE() {
        return IDCLIENTE;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @param IDCLIENTE the IDCLIENTE to set
     */
    public void setIDCLIENTE(int IDCLIENTE) {
        this.IDCLIENTE = IDCLIENTE;
    }
    
    
    
    
}
