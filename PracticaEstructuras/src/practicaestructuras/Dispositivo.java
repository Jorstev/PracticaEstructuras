/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaestructuras;

/**
 *
 * @author JordanStevenChavarri
 */
public class Dispositivo {
    protected int NumSerie;
    protected int calidadPuntuacion;
    
    public Dispositivo(int pNumSerie, int pcalidadPuntuacion){
        this.NumSerie = pNumSerie;
        this.calidadPuntuacion = pcalidadPuntuacion;
    }

    public int getNumSerie() {
        return NumSerie;
    }

    public void setNumSerie(int NumSerie) {
        this.NumSerie = NumSerie;
    }

    public int getCalidadPuntuacion() {
        return calidadPuntuacion;
    }

    public void setCalidadPuntuacion(int calidadPuntuacion) {
        this.calidadPuntuacion = calidadPuntuacion;
    }
    
    
}
