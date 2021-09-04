/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_juanmembreno;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class administraejecutivos {
    
    private ArrayList<ejecutivos> ejecutivos = new ArrayList();
    private File archivo = null;

    public administraejecutivos() {
    }

    public administraejecutivos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<ejecutivos> getListaejecutivos() {
        return ejecutivos;
    }

    public void setListaejecutivos(ArrayList<ejecutivos> listaejecutivos) {
        this.ejecutivos = listaejecutivos;
    }

    @Override
    public String toString() {
        return "ejecutivos=" + ejecutivos;
    }

    //extra mutador
    public void setPersona(ejecutivos p) {
        this.ejecutivos.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (ejecutivos t : ejecutivos) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getCorreo() + ";");
                bw.write(t.getCargo()+ ";");
                bw.write(t.getEmpresa() + ";");
                bw.write(t.getTitulo() + ";");
                bw.write(t.getMaestria() + ";");
                 bw.write(t.getUsuraio() + ";");
                bw.write(t.getContrasena() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        ejecutivos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    ejecutivos.add(new ejecutivos(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
