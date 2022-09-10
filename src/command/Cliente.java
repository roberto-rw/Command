
package command;

import comandos.Borrar;
import comandos.Copiar;
import comandos.Pegar;
import interfaces.IComando;


public class Cliente {
    public static void main(String[] args) {
        Boton boton = new Boton();
        
        IComando copiar = new Copiar();
        IComando borrar = new Borrar();
        IComando pegar = new Pegar();
        
        boton.recibirOperacion(copiar);
        boton.recibirOperacion(borrar);
        boton.recibirOperacion(pegar);
        
        boton.ejecutarOperaciones();
    }
    
}
