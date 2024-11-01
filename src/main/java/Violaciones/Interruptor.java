/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Violaciones;

/**
 *
 * @author Yi Daniel Chen Liu
 */
// Clase Interruptor que depende directamente de la implementación concreta de Lampara (violación del OCP)
/*
La clase Interruptor depende directamente de la implementación
concreta de Lampara. Si se quisiera cambiar el tipo de dispositivo (por
ejemplo, para manejar una Ventilador), se tendría que modificar la clase
*/
public class Interruptor {

    private Lampara lampara;

    public Interruptor(Lampara lampara) {
        this.lampara = lampara;
    }

    public void presionar() {
        if (lampara.encendida) {
            lampara.apagar();
        } else {
            lampara.encender();
        }
    }
}
