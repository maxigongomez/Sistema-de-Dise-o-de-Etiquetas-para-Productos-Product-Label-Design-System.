/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    public static Connection conexion;
     
    
    public Connection conectar(){
            
            String URL = "jdbc:mysql://localhost:3306/bd_etiquetas?characterEncoding=latin1";
            String Usuario = "root";
            String Contraseña = "root123";
                
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL,Usuario,Contraseña);
            System.out.println("Conexion a la Base de Datos establecida.");
                        
        }catch(Exception e){
            
            e.printStackTrace();
        
        }
      return conexion;
    }
    
}
