//InserCorrecta
package Conex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Conexion {
    public Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root"; //esto no lo toquen, todo va a ser en root supongo, si alguien le colocó otro usuario pues cambienlo
    private static final String pass="diegoalej."; //aquí tiene que ir su contra personal de la bd
    private static final String url="jdbc:mysql://localhost:3306/sistema_camas";
    
    public void conector() {
        try{
            con=null;
            Class.forName(driver);
            con= (Connection) DriverManager.getConnection(url, user, pass);
            if (con!=null){
                //JOptionPane.showMessageDialog(null, "Si enlazó");//esto pueden volverlo comentario
            }
        }
        catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "¡¡No enlazó!!");//pueden volverlo comentario
        }
    }
    
    //LOGIN
    
    public int Login(String User, String Pass){
        Integer resultado = 0;
        try{
            Statement ejecutar = con.createStatement();
            ResultSet rs = ejecutar.executeQuery("Select * from rrhh where nombre = '"+User+"' and codigo = '"+Pass+"'");
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "Bienvenido");
                resultado =1;
            }
            else {
                JOptionPane.showMessageDialog(null, "Problemas con Ususario y/o Contraseña");
                resultado =0;
            }
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error al conectar" + e.getMessage(), e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }
    
    //Consultas
    
    //Recibe consultas
    public ResultSet consulta (String sql){
        ResultSet res = null;
        try{
            PreparedStatement pstm = con.prepareStatement(sql);
            res = pstm.executeQuery();
            
        } catch(SQLException e){
            System.err.println("Error consulta:" + e.getMessage());
        }
        return res;
    }
    
    
    
}
