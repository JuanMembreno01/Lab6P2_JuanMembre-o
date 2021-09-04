/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_juanmembreno;

/**
 *
 * @author usuario
 */
public class creativos {
    private String nombre;
    private String apellido;
    private String correo;
    private String ocupacion;
    private String usuraio;
    private String contrasena;

    public creativos() {
    }

    public creativos(String nombre, String apellido, String correo, String ocupacion, String usuraio, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.ocupacion = ocupacion;
        this.usuraio = usuraio;
        this.contrasena = contrasena;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getUsuraio() {
        return usuraio;
    }

    public void setUsuraio(String usuraio) {
        this.usuraio = usuraio;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "creativos{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", ocupacion=" + ocupacion + '}';
    }
    
            
}
