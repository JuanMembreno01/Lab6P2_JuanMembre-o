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
public class administranotascreativos {
      private ArrayList<notascreativos> notascreativos
            = new ArrayList();
    private File archivo = null;

    public administranotascreativos() {
    }

    public administranotascreativos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<notascreativos> getListanotascreativos() {
        return notascreativos;
    }

    public void setListanotascreativos(ArrayList<notascreativos> listanotascreativos) {
        this.notascreativos = listanotascreativos;
    }

    @Override
    public String toString() {
        return "notascreativos=" + notascreativos;
    }

    //extra mutador
    public void setPersona(notascreativos p) {
        this.notascreativos.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (notascreativos t : notascreativos) {
                bw.write(t.getCategoria() + ";");
                bw.write(t.getDescripcion()+ ";");
                bw.write(t.getPublico()+ ";");
                
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        notascreativos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    notascreativos.add(new notascreativos(sc.next(), sc.next(), sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
