/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Violaciones;

/**
 *
 * @author Yi Daniel Chen Liu
 */
// Clase que representa una lámpara (violación del SRP y del OCP)
/*
 La clase Lampara tiene dos responsabilidades: controlar el estado de la
lámpara (encender/apagar) y guardar los logs en un archivo. Esto viola el
SRP, ya que la clase debería tener una única responsabilidad.
*/
public class Lampara implements Dispositivo {

    private boolean encendida = false;

    @Override
    public void encender() {
        encendida = true;
        System.out.println("Lámpara encendida");
        guardarLog("Lámpara encendida");
    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println("Lámpara apagada");
        guardarLog("Lámpara apagada");
    }

    @Override
    public void guardarLog(String mensaje) {
        // Guardar el log en un archivo (violación de SRP, la clase tiene dos responsabilidades)
System.out.println("Guardando log: " + mensaje);
    }
}
