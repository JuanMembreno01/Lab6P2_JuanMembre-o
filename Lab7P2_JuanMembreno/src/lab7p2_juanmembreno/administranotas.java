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
public class administranotas {
     private ArrayList<nota> nota = new ArrayList();
    private File archivo = null;

    public administranotas() {
    }

    public administranotas(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<nota> getListanota() {
        return nota;
    }

    public void setListanota(ArrayList<nota> listanota) {
        this.nota = listanota;
    }

    @Override
    public String toString() {
        return "nota=" + nota;
    }

    //extra mutador
    public void setPersona(nota p) {
        this.nota.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (nota t : nota) {
              bw.write(t.getTitulo() + ";");
                bw.write(t.getHora()+ ";");
                bw.write(t.getFecha()+ ";");
                bw.write(t.getPrioridad() + ";");
                bw.write(t.getEtiquetas() + ";");
                bw.write(t.getTexto()+ ";");
                 bw.write(t.getNombrecrea() + ";");

            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        nota = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    nota.add(new nota(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
