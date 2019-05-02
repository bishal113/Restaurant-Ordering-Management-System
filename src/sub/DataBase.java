/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Sonu
 */
public class DataBase {
 
    public Connection conn() throws Exception{
      Class.forName("org.apache.derby.jdbc.ClientDriver");
  
Connection con=DriverManager.getConnection(  
"jdbc:derby://localhost:1527/orders","Sonu","sonu");  
//here sonoo is database name, root is username and password  
Statement st=con.createStatement();
//st.execute("create table o_rder1(drink varchar(50),type varchar(50),unit_price float,qty number,price float,dat_e date )");

      return con;
  }  

}
