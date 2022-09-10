
package comandos;

import interfaces.IComando;
import logica_negocios.Control;

public class Pegar implements IComando{
    
    Control control;
    
    public Pegar(){
        control = new Control();
    }
    
    @Override
    public void ejecutar() {
        control.pegar();
    }
}
