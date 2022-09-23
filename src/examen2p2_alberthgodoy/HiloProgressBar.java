package examen2p2_alberthgodoy;

import java.util.Date;
import javax.swing.JProgressBar;

/**
 *
 * @author godoy
 */
public class HiloProgressBar extends Thread {

    private boolean vive;
    private JProgressBar progressbar;
    private Carros carroSelected;

    public HiloProgressBar(JProgressBar progressbar, Carros Carro) {
        this.vive = true;
        this.progressbar = progressbar;
        this.carroSelected = Carro;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JProgressBar getProgressbar() {
        return progressbar;
    }

    public void setProgressbar(JProgressBar progressbar) {
        this.progressbar = progressbar;
    }

    @Override
    public void run() {
        double cont = carroSelected.getCostoReparacion();
        while (vive) {
            for (int i = 120; i < cont+1; i += 1000) {
                progressbar.setValue(progressbar.getValue() + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
            vive = false;

        }
    }
}
