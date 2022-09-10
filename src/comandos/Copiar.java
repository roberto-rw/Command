
package comandos;

import interfaces.IComando;
import logica_negocios.Control;

public class Copiar implements IComando{
    
    Control control;
    
    public Copiar(){
        control = new Control();
    }

    @Override
    public void ejecutar() {
        control.copiar();
    }   
}
