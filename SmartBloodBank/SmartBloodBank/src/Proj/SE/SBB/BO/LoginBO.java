/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj.SE.SBB.BO;

/**
 *
 * @author DanishOmer
 */
public class LoginBO {
    
    private String userName;
    private String password;
    
    public LoginBO(){
       userName = null;
       password = null;
   }
    
    public LoginBO(String name, String password){
        setUsername(name);
        setPassword(password);
    
    }
    
     public void setUsername(String username){
        this.userName = username;
    }
     
     public void setPassword(String password){
        this.password = password;
    }
    
    public String getUsername(){
        return userName;
    }
    
    public String getPassword(){
        return password;
    }
    
}

