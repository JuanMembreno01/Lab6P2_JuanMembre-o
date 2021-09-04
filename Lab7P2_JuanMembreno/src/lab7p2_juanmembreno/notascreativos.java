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
public class notascreativos {
     private String categoria;
      private String descripcion;
       private String publico;

    public notascreativos() {
    }

    public notascreativos(String categoria, String descripcion, String publico) {
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.publico = publico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }

    @Override
    public String toString() {
        return "notascreativos{" + "categoria=" + categoria + ", descripcion=" + descripcion + ", publico=" + publico + '}';
    }
       
}
