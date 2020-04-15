
package guardaequipajes;

import java.sql.*;

public class ConexionBDII 
{
    Connection conex;
    
    public Connection Conexion()
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conex = DriverManager.getConnection("jdbc:mysql://localhost/guardasalida","root","");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }return conex;
    }
    public void getClose() 
    {
        try
        {
            conex.close();
        }catch(SQLException ex)
        {
        }
    }
        Statement createStatement()
        {
            throw new UnsupportedOperationException("no soportado");
        }

   
    
}
