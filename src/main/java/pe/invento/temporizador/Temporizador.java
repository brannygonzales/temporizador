/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.invento.temporizador;

/**
 *
 * @author Branny Gonzales
 */
public class Temporizador {
    
    private static Temporizador INSTANCIA = null;
    private int minuto;
    private int segundo;

    private Temporizador() {
    }
    
    public static Temporizador getInstance() {
        if (INSTANCIA == null) {
            INSTANCIA = new Temporizador();
        }
        return INSTANCIA;
    }
    
    public void establecerTemporizador(int minuto, int segundo) {
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public String obtenerTemporizador() {
        String minutoTemp = minuto < 10 ? ("0" + minuto) : String.valueOf(minuto);
        String segundoTemp = segundo < 10 ? ("0" + segundo) : String.valueOf(segundo);
        return minutoTemp + ":" + segundoTemp;
    }
    
    public int obtenerSiguienteMinuto() {
        return segundo < 59 ? minuto : ++minuto;
    }
    
    public int obtenerSiguienteSegundo() {
        return segundo < 59 ? ++segundo : 0;
    }
    
}
