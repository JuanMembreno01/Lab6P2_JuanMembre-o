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
public class nota {
    private String titulo;
     private String hora;
      private String fecha;
       private String prioridad;
        private String etiquetas;
         private String texto;
         private String nombrecrea;

    public nota() {
    }

   

    public nota(String titulo, String hora, String fecha, String prioridad, String etiquetas, String texto, String nombrecrea) {
        this.titulo = titulo;
        this.hora = hora;
        this.fecha = fecha;
        this.prioridad = prioridad;
        this.etiquetas = etiquetas;
        this.texto = texto;
        this.nombrecrea = nombrecrea;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getNombrecrea() {
        return nombrecrea;
    }

    public void setNombrecrea(String nombrecrea) {
        this.nombrecrea = nombrecrea;
    }

    @Override
    public String toString() {
        return "nota{" + "titulo=" + titulo + ", hora=" + hora + ", fecha=" + fecha + ", prioridad=" + prioridad + ", etiquetas=" + etiquetas + ", texto=" + texto + '}';
    }
         
}
