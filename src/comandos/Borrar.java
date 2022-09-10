
package comandos;

import interfaces.IComando;
import logica_negocios.Control;

public class Borrar implements IComando{

    Control control;
    
    public Borrar(){
        control = new Control();
    }
    
    @Override
    public void ejecutar() {
        control.borrar();
    } 
}
