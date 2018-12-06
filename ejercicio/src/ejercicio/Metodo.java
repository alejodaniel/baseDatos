
package ejercicio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.JOptionPane;



public class Metodo {
    
    Vector vector = new Vector();
    
    public void Guardar(Datos datos){
        vector.addElement(datos);
        
    }
    
    public void guardarTxT(Datos d){
        try{
            FileWriter fw = new FileWriter("ejercicio.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(d.getHostbame());
            pw.println(d.getPuerto());
            pw.println(d.getUsername());
            pw.println(d.getPassword());
            pw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR PARA GUARDAR LOS DATOS TXT");
            
        }
    }
    
}
