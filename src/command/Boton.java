
package command;

import interfaces.IComando;
import java.util.ArrayList;
import java.util.List;

public class Boton {
    
    List<IComando> operaciones = new ArrayList();
       
    public void ejecutarOperacion(IComando comando){
        comando.ejecutar();
    }
    
    public void recibirOperacion(IComando comando){
        operaciones.add(comando);
    }
    
    public void ejecutarOperaciones(){
        this.operaciones.forEach(x -> x.ejecutar());
    }  
}
