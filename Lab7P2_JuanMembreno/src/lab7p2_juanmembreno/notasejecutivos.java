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
public class notasejecutivos {
     private String titulo;
      private String persoasinvitadas;
       private String asunto;
        private String descripcion;

    public notasejecutivos(String titulo, String persoasinvitadas, String asunto, String descripcion) {
        this.titulo = titulo;
        this.persoasinvitadas = persoasinvitadas;
        this.asunto = asunto;
        this.descripcion = descripcion;
    }

    public notasejecutivos() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPersoasinvitadas() {
        return persoasinvitadas;
    }

    public void setPersoasinvitadas(String persoasinvitadas) {
        this.persoasinvitadas = persoasinvitadas;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "notasejecutivos{" + "titulo=" + titulo + ", persoasinvitadas=" + persoasinvitadas + ", asunto=" + asunto + ", descripcion=" + descripcion + '}';
    }
        
}
