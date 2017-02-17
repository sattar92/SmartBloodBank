/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj.SE.SBB.BL;

import Proj.SE.SBB.BO.LoginBO;
import Proj.SE.SBB.DAL.LoginDAL;

/**
 *
 * @author CS010
 */
public class LoginHandler {
    public LoginBO Login(LoginBO loginbo){
        LoginDAL LogDAL = new LoginDAL();
        return LogDAL.Login(loginbo);
    }
}
