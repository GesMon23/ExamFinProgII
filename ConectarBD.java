package ExamFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConectarBD {
    Connection conect = null;
    String user="root";
    String contra="";
    String NombreBD="ExamFinal";
    String ip="localhost";
    String puerto="3306";
    String URL="jdbc:mysql://"+ip+":"+puerto+"/"+NombreBD;
    
    public Connection ConectarBaseDatos(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conect=DriverManager.getConnection(URL, user, contra);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a Base de Datos: "+e.toString());
        }
        return conect;
    }
}
