package examen2p2_alberthgodoy;

import java.io.Serializable;

/**
 *
 * @author godoy
 */
public class Empleado implements Serializable{

    private String nombre;
    private int edad;
    private String numID;
    private int cantCarrosreparadoExito;

    public Empleado(String nombre, int edad, String numID, int cantCarrosreparadoExito) throws Exception {
        if (!nombre.matches("[A-Za-z]+")) {
            throw new Exception("Solo se aceptan letras");
        }
        if (!numID.matches("[0-9]+")) {
            throw new Exception("Solo se aceptan digitos");
        }
        this.nombre = nombre;
        this.edad = edad;
        this.numID = numID;
        this.cantCarrosreparadoExito = cantCarrosreparadoExito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (!nombre.matches("[A-Za-z]+")) {
            throw new Exception("Solo se aceptan letras");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumID() {
        return numID;
    }

    public void setNumID(String numID) throws Exception {
        if (!numID.matches("[0-9]+")) {
            throw new Exception("Solo se aceptan digitos");
        }
        this.numID = numID;
    }

    public int getCantCarrosreparadoExito() {
        return cantCarrosreparadoExito;
    }

    public void setCantCarrosreparadoExito(int cantCarrosreparadoExito) {
        this.cantCarrosreparadoExito = cantCarrosreparadoExito;
    }

}
