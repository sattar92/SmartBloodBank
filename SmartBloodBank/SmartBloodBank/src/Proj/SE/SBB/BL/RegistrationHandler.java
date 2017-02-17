/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj.SE.SBB.BL;

import Proj.SE.SBB.BO.Register;
import Proj.SE.SBB.DAL.RegistrationDAL;

/**
 *
 * @author DanishOmer
 */
public class RegistrationHandler {
     public void registration(Register register){
        RegistrationDAL registrationdal = new RegistrationDAL();
        registrationdal.registration(register);
        
    }
    
}
