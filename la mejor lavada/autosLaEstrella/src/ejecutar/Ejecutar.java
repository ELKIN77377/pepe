
package ejecutar;
import autoslaestrella.Controlador;
import autoslaestrella.Vista;
import autoslaestrella.Modelo;


public class Ejecutar {
    public static void main (String [] args){
        Modelo model = new Modelo();
        Vista vist = new Vista();
        Controlador control = new Controlador(vist, model);
        control.iniciarProgram();
        
        
        
    }
    

}
