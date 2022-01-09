package helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class koneksiDB {
    public static Connection getconection(){
        Connection conn = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3307/db_pendataanvaksin";
        String user = "root";
        String pass = "";
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pass);
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    
    public static void main(String[] args) {
        Connection conn = koneksiDB.getconection();
    }
}