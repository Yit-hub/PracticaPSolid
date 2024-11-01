/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Violaciones;

/**
 *
 * @author Yi Daniel Chen Liu
 */
// Interfaz con múltiples responsabilidades (violación del ISP)

/*
La interfaz Dispositivo tiene demasiadas responsabilidades. No todos los
dispositivos deberían estar obligados a implementar el método
guardarLog(). Esto viola el ISP porque los clientes (como Lampara)
deben implementar métodos que no son necesarios para ellos.
*/
public interface Dispositivo {

    void encender();

    void apagar();

    void guardarLog(String mensaje);
}
