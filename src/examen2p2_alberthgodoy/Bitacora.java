
package examen2p2_alberthgodoy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author godoy
 */
public class Bitacora extends Thread{
    private boolean vive;
    private Carros carroSelected;
    private SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat dTime = new SimpleDateFormat("HH:mm:ss");
    private boolean Reparado;
    public Bitacora(Carros carroSelected) {
        this.vive = true;
        this.carroSelected = carroSelected;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public Carros getCarroSelected() {
        return carroSelected;
    }

    public void setCarroSelected(Carros carroSelected) {
        this.carroSelected = carroSelected;
    }
    
     @Override
    public void run() {         
        while(true){            
            try {
                Date fecha = new Date();
                File f=new File("./Bitacora/bitacora.txt");
                FileWriter fw=new FileWriter(f,true);
                BufferedWriter bw=new BufferedWriter(fw);
                if (Reparado) {
                  bw.write(String.format("El carro con ID %s fue reparado con exito en %s a las %s|", carroSelected.getID(),
                        dFormat.format(fecha),dTime.format(fecha)));  
                } else {
                    bw.write(String.format("El carro con ID %s no fue reparado con exito en %s a las %s|", carroSelected.getID(),
                        dFormat.format(fecha),dTime.format(fecha)));  
                }
                
                bw.newLine();
                bw.flush();
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
            
            vive = false;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
