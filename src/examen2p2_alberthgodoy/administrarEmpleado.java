package examen2p2_alberthgodoy;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author godoy
 */
public class administrarEmpleado {

    private ArrayList<Empleado> listaEmpleado = new ArrayList();
    private ArrayList<Carros> listaCarros = new ArrayList();
    private File archivo = null;

    public administrarEmpleado(String archivo) {
        this.archivo = new File(archivo);
    }

    public ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    public ArrayList<Carros> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(ArrayList<Carros> listaCarros) {
        this.listaCarros = listaCarros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void cargarArchivoEmpleado() {
        try {
            listaEmpleado = new ArrayList();
            Empleado temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Empleado) objeto.readObject()) != null) {
                        listaEmpleado.add(temp);
                    }
                } catch (EOFException e) {

                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivoEmpleado() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Empleado t : listaEmpleado) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

    public void cargarArchivoCarros() {
        try {
            listaCarros = new ArrayList();
            Carros temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Carros) objeto.readObject()) != null) {
                        listaCarros.add(temp);
                    }
                } catch (EOFException e) {

                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivoCarros() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Carros t : listaCarros) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
