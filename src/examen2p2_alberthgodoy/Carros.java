package examen2p2_alberthgodoy;

import java.io.Serializable;

/**
 *
 * @author godoy
 */
public class Carros implements Serializable{
    private String ID;
    private String Marca;
    private String Modelo;
    private String fechaFabricacion;
    private String estadoVehiculo;
    private double costoReparacion;

    public Carros(String ID, String Marca, String Modelo, String fechaFabricacion, String estadoVehiculo, double costoReparacion) {
        this.ID = ID;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.fechaFabricacion = fechaFabricacion;
        this.estadoVehiculo = estadoVehiculo;
        this.costoReparacion = costoReparacion;
    }
    

    

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public double getCostoReparacion() {
        return costoReparacion;
    }

    public void setCostoReparacion(double costoReparacion) {
        this.costoReparacion = costoReparacion;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    

    @Override
    public String toString() {
        return "Carros{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", fechaFabricacion=" + fechaFabricacion + ", estadoVehiculo=" + estadoVehiculo + ", costoReparacion=" + costoReparacion + '}';
    }
    
    
}
