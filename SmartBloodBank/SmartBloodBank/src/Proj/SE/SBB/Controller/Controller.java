/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj.SE.SBB.Controller;

import Proj.SE.SBB.BL.LoginHandler;
import Proj.SE.SBB.BL.RegistrationHandler;
import Proj.SE.SBB.BO.LoginBO;
import Proj.SE.SBB.BO.Register;
import Proj.SE.SBB.Constants.Constants;
import java.sql.SQLException;

/**
 *
 * @author DanishOmer
 */
public class Controller {
    
     public Object[] processRequest(int action, Object[] parameters) /*throws SQLException*/{ 
        Object[] returnObj = null;
        switch (action){
            case Constants.RegistrationAction: returnObj = registration(parameters); break;
            case Constants.Login: returnObj = Login(parameters); break;
    
        }
        return returnObj;
    }
    
    private Object[] registration(Object[] parameters) /*throws SQLException*/ {
        Object[] returnObj = null;
        String name = (String)parameters[0];
        String fname = (String)parameters[1];
        String email = (String)parameters[2];
        String password = new String ((char[])parameters[3]);
        String repassword = new String ((char[])parameters[4]);
        String bloodgroup = (String)parameters[5];
        String address = (String)parameters[6];
        String contact = (String)parameters[7];
        
        Register user = new Register(name, fname, email, password, repassword, bloodgroup, address, contact);
        RegistrationHandler registrationhandler = new RegistrationHandler();
        registrationhandler.registration(user);
        
        return returnObj;
    }
    
    private Object [] Login(Object[] param)
    {
         Object[] returnObject=null;
         String username=(String)param[0];
         String password= new String ((char[])param[1]);
         LoginBO loginbo = new LoginBO(username, password);
         LoginHandler LogHand=new LoginHandler();
         LogHand.Login(loginbo);
         if(loginbo.getUsername()!=null && !loginbo.getUsername().equals("")){
            returnObject = new Object[1];
            returnObject[0] = loginbo;
        }
         return returnObject;
    }
    
}
