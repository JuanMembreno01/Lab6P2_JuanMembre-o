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
public class administranotasejecutivos {
             private ArrayList<notasejecutivos> notasejecutivos
            = new ArrayList();
    private File archivo = null;

    public administranotasejecutivos() {
    }

    public administranotasejecutivos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<notasejecutivos> getListanotasejecutivos() {
        return notasejecutivos;
    }

    public void setListanotasejecutivos(ArrayList<notasejecutivos> listanotasnotasejecutivos) {
        this.notasejecutivos = listanotasnotasejecutivos;
    }

    @Override
    public String toString() {
        return "notasejecutivos=" + notasejecutivos;
    }

    //extra mutador
    public void setPersona(notasejecutivos p) {
        this.notasejecutivos.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (notasejecutivos t : notasejecutivos) {
                bw.write(t.getTitulo()+ ";");
                bw.write(t.getPersoasinvitadas()+ ";");
                bw.write(t.getAsunto()+ ";");
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
        notasejecutivos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    notasejecutivos.add(new notasejecutivos(sc.next(), sc.next(), sc.next(), sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}

