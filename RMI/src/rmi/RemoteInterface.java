package rmi;

import java.rmi.Remote;

/**
 *
 * @author Aplicaciones D
 */
public interface RemoteInterface extends Remote{
    
    //funciones del cliente
    public int operacion(int x, int y) throws Exception;    
}
