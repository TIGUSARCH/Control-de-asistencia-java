
package registrodeasistenciav1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexion {
    Connection con=null;
    public Connection  conexion(){ 
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/asistencias","root","");
        System.out.println("conexion establecida");
    }  catch (ClassNotFoundException | SQLException e) { 
           System.out.println("error de conexion"+e);
           JOptionPane.showMessageDialog(null, "Error de conexion con la base de datos."+e);
           }
       return con;
    }
}
