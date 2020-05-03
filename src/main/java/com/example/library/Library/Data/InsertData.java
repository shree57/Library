package com.example.library.Library.Data;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement;  

public class InsertData {

	 static final String JDBC_DRIVER = "org.h2.Driver";   
	   static final String DB_URL = "jdbc:h2:~/library";  
	 
	   static final String USER = "sa"; 
	   static final String PASS = ""; 
	  
	   public static void insert() { 
	      Connection conn = null; 
	      Statement stmt = null; 
	      try{
	      
	         Class.forName(JDBC_DRIVER);  
	      
	         conn = DriverManager.getConnection(DB_URL,USER,PASS); 
	         stmt = conn.createStatement();  
	         String sql = "INSERT INTO library " + "VALUES ('Blr', )"; 
	         
	         stmt.executeUpdate(sql); 
	         sql = "INSERT INTO library " + "VALUES ('ch', )";  
	         
	         
	         System.out.println("Inserted records into the table..."); 
	         
	        
	         stmt.close(); 
	         conn.close(); 
	      } catch(SQLException se) { 
	
	         se.printStackTrace(); 
	      } catch(Exception e) { 
	   
	         e.printStackTrace(); 
	      } 
	   }
}
