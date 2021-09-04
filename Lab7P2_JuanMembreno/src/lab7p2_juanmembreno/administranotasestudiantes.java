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
public class administranotasestudiantes {
          private ArrayList<notasestudiantes> notasestudiantes
            = new ArrayList();
    private File archivo = null;

    public administranotasestudiantes() {
    }

    public administranotasestudiantes(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<notasestudiantes> getListanotasestudiantes() {
        return notasestudiantes;
    }

    public void setListanotascreativos(ArrayList<notasestudiantes> listanotasestudiantes) {
        this.notasestudiantes = listanotasestudiantes;
    }

    @Override
    public String toString() {
        return "notasestudiantes=" + notasestudiantes;
    }

    //extra mutador
    public void setPersona(notasestudiantes p) {
        this.notasestudiantes.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (notasestudiantes t : notasestudiantes) {
                bw.write(t.getTitulo()+ ";");
                bw.write(t.getFecha()+ ";");
                bw.write(t.getDescripcion()+ ";");
                
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        notasestudiantes = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    notasestudiantes.add(new notasestudiantes(sc.next(), sc.next(), sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
