
import Correciones.Lampara;
import Correciones.LogLampara;
import Correciones.Ventilador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Yi Daniel Chen Liu
 */
public class Main {

    public static void main(String[] args) {
        //Objeto Lampara 

        Lampara lampara1 = new Lampara();

        lampara1.encender();
        //Objeto LogLampara 
        LogLampara lampara2 = new LogLampara();
        lampara2.estadoLog();
        
        //Objeto Ventilador
        Ventilador ventilador1 = new Ventilador();
        ventilador1.encender();
        
    }
}
