/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientermi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;
import rmi.RemoteInterface;

/**
 *
 * @author Aplicaciones D
 */
public class ClienteRMI {

    public static void main(String[] args) {
        try {
            String valora = JOptionPane.showInputDialog("Ingrese primer número");
            String valorb = JOptionPane.showInputDialog("Ingrese segundo número");
            int a = Integer.parseInt(valora);
            int b = Integer.parseInt(valorb);
            
            //registrando al servidor para obtener los obj distribuidos (STUB)
            Registry miregistro = LocateRegistry.getRegistry("127.0.0.1",1234);
            //acceder al obj distribuido palabra clave "ok" deben de ser el mismo que el minserve y mainclient
            RemoteInterface s = (RemoteInterface) miregistro.lookup("ok");
            JOptionPane.showMessageDialog(null, "Resultado suma: "+s.operacion(a, b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
