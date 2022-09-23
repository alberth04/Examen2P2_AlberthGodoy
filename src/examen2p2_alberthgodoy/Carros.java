package examen2p2_alberthgodoy;

/**
 *
 * @author godoy
 */
public class Carros {

    private String Marca;
    private String Modelo;
    private String fechaFabricacion;
    private String estadoVehiculo;
    private double costoReparacion;

    public Carros(String Marca, String Modelo, String fechaFabricacion, String estadoVehiculo, double costoReparacion) {
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

    @Override
    public String toString() {
        return "Carros{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", fechaFabricacion=" + fechaFabricacion + ", estadoVehiculo=" + estadoVehiculo + ", costoReparacion=" + costoReparacion + '}';
    }
    
    
}
