package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	public static Connection getConnection() throws ClassNotFoundException {

		Connection conn = null;
        try {
            
            String username = "sql10179094";
            String password = "E8sG5uEv3N";
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10179094", username, password);
            
            System.out.println(">>>>>>>>CONECTOU");
            
        } catch (SQLException ex) {
            System.out.println(">>>>>>>>>>>>>ERRO NA CONEXAO!!!!");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        
        return conn;
    }

}
