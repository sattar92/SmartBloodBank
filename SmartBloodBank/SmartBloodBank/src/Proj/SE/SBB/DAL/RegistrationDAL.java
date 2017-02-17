/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj.SE.SBB.DAL;

import Proj.SE.SBB.BO.Register;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author DanishOmer
 */
public class RegistrationDAL {
      //  BufferedWriter bw = null;
    public void registration(Register register)
    {
           Connection connection = null;
           //Register mainuser = new Register();
           try{
               String driverName = "oracle.jdbc.driver.OracleDriver";
               Class.forName(driverName);
               String serverName = "localhost";
               String serverPort = "1521";
               String sid = "XE";
               String dbname = "Users";
               String url = "jdbc:oracle:thin:@" + serverName + ":" + serverPort +  "/" + sid;
               String userName = "jahanzeb";
               String password = "123";
               
               connection = DriverManager.getConnection(url, userName, password);
               
            System.out.println("Sucessfully connected to the DataBase");
            String UserName = register.getUsername();
            System.out.print(UserName);
            String fName = register.getFName();
            String eMail = register.getEmailID();
            String Password = register.getPassword();
            String bGroup = register.getBgroup();
            String address = register.getAddress();
            String contact = register.getcontact();
            Statement statement = connection.createStatement();
            String query = "Insert into Users values('"+UserName+"','"+fName+"','"+eMail+"','"+Password+"','"+bGroup+"','"+address+"','"+contact+"')";
           // String query1  =
           
            statement.executeUpdate(query);
           
           } 
          catch(ClassNotFoundException e){
               System.out.println("Class Not Found Exeption::Couldn't find the database driver" + e.getMessage());
           } catch(SQLException e) {
               System.out.println("Couldn't connect to the database" + e.getMessage());
           }
       //return mainuser;
    }
}