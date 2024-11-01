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
La clase lámpara cumple con el principio de responsabilidad única, teniendo la ´´unica responsabilidad de encender o apagar.
*/
public class Lampara extends Aparato{

        public void encender() {
        this.setEncendido(true);
            System.out.println("Lámpara encendida");
    }

    public void apagar() {
        this.setEncendido(false);
        System.out.println("Lámpara apagado");
    }
    
}
