/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.invento.temporizador;

import javax.swing.JLabel;
import javax.swing.SwingWorker;

/**
 *
 * @author Branny Gonzales
 */
public class TemporizadorSwingWorker extends SwingWorker<Object, Object> {

    private final int minutoInicial;
    private final JLabel jlblTiempo;

    public TemporizadorSwingWorker(int minutoInicial, JLabel jlblTiempo) {
        this.minutoInicial = minutoInicial;
        this.jlblTiempo = jlblTiempo;
    }
    
    @Override
    protected Object doInBackground() throws Exception {
        System.out.println("doInBackground");
        String tiempoMinutos, tiempoSegundos;
        for (int minuto = minutoInicial; true; minuto++) {
            tiempoMinutos = minuto < 10 ? ("0" + minuto) : (String.valueOf(minuto));
            for (int segundo = 0; segundo < 60; segundo++) {
                tiempoSegundos = segundo < 10 ? ("0" + segundo) : (String.valueOf(segundo));
                jlblTiempo.setText(segundo < 10 ? (tiempoMinutos + ":" + tiempoSegundos) : (tiempoMinutos + ":" + tiempoSegundos));
                try {
                    Thread.sleep(999);
                } catch (InterruptedException ex) {
                }
            }
        }
    }
    
}
