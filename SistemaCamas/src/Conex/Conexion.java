//InserCorrecta
package Conex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Conexion {
    public Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root"; //esto no lo toquen, todo va a ser en root supongo, si alguien le colocó otro usuario pues cambienlo
    private static final String pass="Tr4c30n"; //aquí tiene que ir su contra personal de la bd
    private static final String url="jdbc:mysql://localhost:3306/sistema_camas";
    public ArrayList<String> listaProductos= new ArrayList();
    public ArrayList<String> listaColor= new ArrayList();
    public ArrayList<String> listaTamaño= new ArrayList();
    public ArrayList<String> listaEstilo= new ArrayList();
    public ArrayList<String> listaMat= new ArrayList();
    public ArrayList<Integer> listaExistencia= new ArrayList();
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
    // obtener productos
    public DefaultComboBoxModel Obt_Pro(){
        DefaultComboBoxModel ListarDoc = new DefaultComboBoxModel();
        ListarDoc.addElement("Seleccione un Producto");
        ResultSet res = this.consulta("SELECT nombre,idProducto FROM producto order By idProducto;");
        try{
            while(res.next()){
                ListarDoc.addElement(res.getString("nombre"));
                listaProductos.add(res.getString("idProducto"));
            }
            res.close();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        return ListarDoc;
    }
    public DefaultComboBoxModel Obt_Color(){
        DefaultComboBoxModel ListarDoc = new DefaultComboBoxModel();
        ListarDoc.addElement("Seleccione el Color");
        ResultSet res = this.consulta("SELECT color,idProducto FROM producto order By idProducto;");
        try{
            while(res.next()){
                ListarDoc.addElement(res.getString("color"));
                listaColor.add(res.getString("idProducto"));
            }
            res.close();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        return ListarDoc;
    }
    public DefaultComboBoxModel Obt_Tamaño(){
        DefaultComboBoxModel ListarDoc = new DefaultComboBoxModel();
        ListarDoc.addElement("Seleccione el Tamaño");
        ResultSet res = this.consulta("SELECT tamaño,idProducto FROM producto order By idProducto;");
        try{
            while(res.next()){
                ListarDoc.addElement(res.getString("tamaño"));
                listaTamaño.add(res.getString("idProducto"));
            }
            res.close();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        return ListarDoc;
    }
    public DefaultComboBoxModel Obt_Estilo(){
        DefaultComboBoxModel ListarDoc = new DefaultComboBoxModel();
        ListarDoc.addElement("Seleccione el Estilo");
        ResultSet res = this.consulta("SELECT estilo,idProducto FROM producto order By idProducto;");
        try{
            while(res.next()){
                ListarDoc.addElement(res.getString("estilo"));
                listaEstilo.add(res.getString("idProducto"));
            }
            res.close();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        return ListarDoc;
    }
    public DefaultComboBoxModel Obt_Mat(){
        DefaultComboBoxModel ListarMat = new DefaultComboBoxModel();
        ListarMat.addElement("Seleccione el Material");
        ResultSet res = this.consulta("SELECT nombre,idMaterial,existencia FROM material order By idMaterial;");
        try{
            while(res.next()){
                ListarMat.addElement(res.getString("nombre"));
                listaMat.add(res.getString("nombre"));
                listaExistencia.add(res.getInt("existencia"));
            }
            res.close();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        return ListarMat;
    }
    //Consultar por ruta de imagen
    public String consultaImg (String sql){
        String direccion="";
        ResultSet res = this.consulta(sql);
        try{
            while(res.next()){
                direccion= res.getString("fotografia");
            }
            res.close();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        return direccion;
    }
    
}
