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
public class estudiantes {
    private String nombre;
    private String apellido;
    private String correo;
    private String  carrera;
    private String anocursando;
private String usuraio;
    private String contrasena;
    public estudiantes() {
    }

    public estudiantes(String nombre, String apellido, String correo, String carrera, String anocursando, String usuraio, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.carrera = carrera;
        this.anocursando = anocursando;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getAnocursando() {
        return anocursando;
    }

    public void setAnocursando(String anocursando) {
        this.anocursando = anocursando;
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
        return "estudiantes{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", carrera=" + carrera + ", anocursando=" + anocursando + '}';
    }
    
}
