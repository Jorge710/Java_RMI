package Servidor;

import java.rmi.server.UnicastRemoteObject;
import rmi.RemoteInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author Aplicaciones D
 */

//clase que hereda de objetos RMI
public class ServeImplements extends UnicastRemoteObject implements RemoteInterface{

    public ServeImplements() throws RemoteException{
    }
    
    //desarrollo de la función a ser distribuida
    @Override
    public int operacion(int x, int y){
        return (x + y);
    }
    
}
