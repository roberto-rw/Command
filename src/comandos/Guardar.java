
package comandos;

import interfaces.IComando;
import logica_negocios.Control;

public class Guardar implements IComando{
    Control control;

    public Guardar(){
        control = new Control();
    }
    
    @Override
    public void ejecutar() {
        control.guardar();
    } 
}
