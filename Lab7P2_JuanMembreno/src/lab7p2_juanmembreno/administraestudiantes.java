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
public class administraestudiantes {
    
    private ArrayList<estudiantes> estudiantes = new ArrayList();
    private File archivo = null;

    public administraestudiantes() {
    }

    public administraestudiantes(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<estudiantes> getListaestudiantes() {
        return estudiantes;
    }

    public void setListaestudiantes(ArrayList<estudiantes> listaestudiantes) {
        this.estudiantes = listaestudiantes;
    }

    @Override
    public String toString() {
        return "estudiantes=" + estudiantes;
    }

    //extra mutador
    public void setPersona(estudiantes p) {
        this.estudiantes.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (estudiantes t : estudiantes) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getCorreo()+ ";");
                bw.write(t.getCarrera()+ ";");
                bw.write(t.getAnocursando() + ";");
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
        estudiantes = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    estudiantes.add(new estudiantes(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
