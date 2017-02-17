/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj.SE.SBB.DAL;

import Proj.SE.SBB.BO.LoginBO;
import Proj.SE.SBB.BO.Register;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jahanzeb
 */
public class LoginDAL {
    BufferedWriter bw = null;
    
    public LoginBO Login(LoginBO loginbo){
        Connection connection = null;
        LoginBO Loginbo = new LoginBO();
        Loginbo = null;
        try{
            String driverName = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName = "localhost";
            String serverPort = "1521";
            String sid = "XE";
            String dbname = "users";
            String url = "jdbc:oracle:thin:@" + serverName + ":" + serverPort +  "/" + sid;
            String userName = "jahanzeb";
            String password = "123";
            
            connection = DriverManager.getConnection(url, userName, password);
            
            System.out.println("Sucessfully connected to the DataBase");
        } catch(ClassNotFoundException e){
            System.out.println("Class Not Found Exeption::Couldn't find the database driver" + e.getMessage());
        } catch(SQLException e) {
            System.out.println("Couldn't connect to the database" + e.getMessage());
        }
        try{
            Statement statement = connection.createStatement();
            String query = "select name,password from users where name=";
            String query1  = loginbo.getUsername();
            
           //try (ResultSet resultset = statement.executeQuery(query+"'"+query1+"'")) {
           ResultSet resultset = statement.executeQuery(query+"'"+query1+"'");
                while(resultset.next()){
                    LoginBO user2 = new LoginBO();
                    String username = resultset.getString(1).toString();
               //localAdmin.setUsername(username);
                    ///String username = resultset.getString(1);
                    user2.setUsername(username);
                    
                    String password = resultset.getString(2).toString();
                    user2.setPassword(password);
                    
                    Loginbo = user2;
                }
                if(Loginbo == null)
                {
                    loginbo.setUsername(null);
                    loginbo.setPassword(null);
                }
                    
                    
                resultset.close();
            //}
            
        }catch(Exception e){
            e.printStackTrace();
       }
        return Loginbo;
    }
}
