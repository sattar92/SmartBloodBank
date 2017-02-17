/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj.SE.SBB.BO;

/**
 *
 * @author jahanzeb
 */
public class Register {
    private String userName;
    private String fName;
    private String eMail;
    private String password;
    private String rePaswd;
    private String bGroup;
    private String address;
    private String contact;
    
    public Register(String name, String fname, String email, String password, String repassword, String bloodgroup, String address, String contact ){
        setUsername(name);
        setFname(fname);
        setEmailID(email);
        setPassword(password);
        setRetypepass(repassword);
        setBgroup(bloodgroup);
        setAddress(address);
        setcontact(contact);
    }
    public Register(){
        userName = null;
        password = null;
    };
    public String getUsername(){
        return userName;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getFName(){
        return fName;
    }
    public String getcontact(){
        return contact;
    }
    public String getAddress(){
        return address;
    }
    public String getRepasswd(){
        return rePaswd;
    }
    public String getBgroup(){
        return bGroup;
    }
    public String getEmailID(){
        return eMail;
    }
    public void setFname(String fname){
        this.fName = fname;
    }
    
    public void setRetypepass(String repasswd){
        this.rePaswd = repasswd;
    }
     public void setUsername(String username){
        this.userName = username;
    }
    public void setBgroup(String bgroup){
        this.bGroup = bgroup;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setcontact(String contact){
        this.contact = contact;
    }
    public void setEmailID(String email){
        this.eMail = email;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
