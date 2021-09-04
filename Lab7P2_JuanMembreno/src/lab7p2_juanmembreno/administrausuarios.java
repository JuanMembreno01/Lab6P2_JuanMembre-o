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
public class administrausuarios {
       private ArrayList<usuarios> usuarios = new ArrayList();
    private File archivo = null;

    public administrausuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<usuarios> usuarios) {
        this.usuarios = usuarios;
        
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "usuarios "+usuarios;
    }
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (usuarios t : usuarios) {
                bw.write(t.getUsuario() + ";");
                bw.write(t.getContraseña() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        usuarios = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    usuarios.add(new usuarios(sc.next(),sc.next()));
                    
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
