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
public class administranormales {
    
    private ArrayList<normales> normales = new ArrayList();
    private File archivo = null;

    public administranormales() {
    }

    public administranormales(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<normales> getListanormales() {
        return normales;
    }

    public void setListanormales(ArrayList<normales> listanormales) {
        this.normales = listanormales;
    }

    @Override
    public String toString() {
        return "normales=" + normales;
    }

    //extra mutador
    public void setPersona(normales p) {
        this.normales.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (normales t : normales) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getCorreo()+ ";");
                bw.write(t.getHobbie() + ";");
                bw.write(t.getInteres() + ";");
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
        normales = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    normales.add(new normales(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
