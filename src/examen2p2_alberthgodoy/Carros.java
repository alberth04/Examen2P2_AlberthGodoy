package examen2p2_alberthgodoy;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author godoy
 */
public class Carros implements Serializable{
    private String ID;
    private String Marca;
    private String Modelo;
    private Date fechaFabricacion;
    private String estadoVehiculo;
    private double costoReparacion;

    public Carros(String ID, String Marca, String Modelo, Date fechaFabricacion, String estadoVehiculo, double costoReparacion) throws Exception {
         if (!Marca.matches("[A-Za-z0-9]+")) {
            throw new Exception("Marca solo puede ser letras");
        }
        if (!Modelo.matches("[A-Za-z0-9]+")) {
            throw new Exception("Modelo solo puede ser letras");
        }
        if (costoReparacion < 0) {
            throw new Exception("El costo no puede ser negativo");
        }
        if (!ID.matches("[0-9]+")) {
            throw new Exception("El id solo pueden ser digitos");
        }
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

    public void setMarca(String Marca) throws Exception {
        if (!Marca.matches("[A-Za-z0-9]+")) {
            throw new Exception("Marca solo puede ser letras");
        }
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) throws Exception {
        if (!Modelo.matches("[A-Za-z0-9]+")) {
            throw new Exception("Modelo solo puede ser letras");
        }
        this.Modelo = Modelo;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
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

    public void setCostoReparacion(double costoReparacion) throws Exception {
        if (costoReparacion < 0) {
            throw new Exception("El costo no puede ser negativo");
        }
        this.costoReparacion = costoReparacion;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) throws Exception {
        if (!ID.matches("[0-9]+")) {
            throw new Exception("El id solo pueden ser digitos");
        }
        this.ID = ID;
    }
    

    @Override
    public String toString() {
        return "Carros{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", fechaFabricacion=" + fechaFabricacion + ", estadoVehiculo=" + estadoVehiculo + ", costoReparacion=" + costoReparacion + '}';
    }
    
    
}
