/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Correciones;

/**
 *
 * @author Yi Daniel Chen Liu
 */
/*
Se ha creado una clase ventilador que hereda de aparato, y tiene la responsabilidad única de cambiar el estado de un ventilador
*/
public class Ventilador extends Aparato {

    public void encender() {
        this.setEncendido(true);
        System.out.println("Ventilador encendida");
    }

    public void apagar() {
        this.setEncendido(false);
        System.out.println("Ventilador apagado");
    }
}
