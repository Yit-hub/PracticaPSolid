/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Correciones;

/**
 *
 * @author Yi Daniel Chen Liu
 */
public class LogLampara extends Lampara implements Log{
/*
   En este caso, se ha creado una clase que herede de lámpara e implemente Log, para cumplir con el principio de responsabilidad única, esta responsabilidad sería guardar un registro del estado de la lámpara 
   */
    public void estadoLog(){
        if(this.isEncendido()){
            this.guardarLog("Lámpara encendida");
        }else{
            this.guardarLog("Lámpara apagada");
        }
    }
    
    @Override
    public void guardarLog(String mensaje) {
        System.out.println("Guardando log: " + mensaje);
    }
    
}
