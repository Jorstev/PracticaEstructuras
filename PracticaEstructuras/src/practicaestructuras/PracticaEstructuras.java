/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaestructuras;

/**
 *
 * @author JordanStevenChavarri
 */
public class PracticaEstructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. En una fábrica de dispositivos médicos se revisa cada dispositivo uno por
//        uno antes de enviarlos a los clientes. De cada dispositivo se sabe el número de
//        serie, y la puntuación de calidad que obtuvo. Para revisar estos dispositivos
//        se ponen en una cola y se va revisando uno por uno. Si al revisar el
//        dispositivo este tiene una puntuación menor a 500 se debe
//        volver a insertar en la cola. Si el dispositivo tiene una puntuación menor
//        a 250 este dispositivo se desecha completamente. Si es una puntuación mayor a 500, el
//        producto se envía al cliente.
        Queue<Integer> cola = new Queue();
        
        Dispositivo dispositivo1 = new Dispositivo(123, 450);
        Dispositivo dispositivo2 = new Dispositivo(251, 200);
        Dispositivo dispositivo3 = new Dispositivo(251, 650);
        
        cola.add(650);
        cola.add(200);
        cola.add(450);
        
        PracticaEstructuras main = new PracticaEstructuras();
        main.revisionCalidad(cola, dispositivo1);
        main.revisionCalidad(cola, dispositivo2);
        main.revisionCalidad(cola, dispositivo3);
    }

    public void revisionCalidad(Queue cola, Dispositivo dispositivo) {
        if(dispositivo.calidadPuntuacion < 250){
            System.out.println("Dispositivo desechado");
            cola.remove();
        }else if(dispositivo.calidadPuntuacion < 500){
            cola.add(cola.remove());
        }else{
            System.out.println("Producto enviado al cliente");
            cola.remove();
        }
    }
}
