package Servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 *
 * @author Aplicaciones D
 */
public class MainServe {
    public static void main(String[] args) {
        try {
            //INICIALIZAR EL SERVIDOR
            //1234 clave del cliente
            Registry miregistro = LocateRegistry.createRegistry(1234);
            miregistro.rebind("ok", new ServeImplements());
            System.out.println("servidor encendido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
