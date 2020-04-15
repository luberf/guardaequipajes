
package guardaequipajes;

import java.sql.*;

public class ConexionBD 
{
    Connection cn;
    
    public Connection Conexion()
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/guarda","root","");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }return cn;
    }
    
public void getClose() 
    {
        try
        {
            cn.close();
        }catch(SQLException ex)
        {
        }
    }
        Statement createStatement()
        {
            throw new UnsupportedOperationException("no soportado");
        }

   
    
}
