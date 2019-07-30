/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaquetePrincipal;

/**
 *
 * @author angel
 */
public class Usuario {
    
    private String nick_;
    
    private String pass_;
    
    private String pconex_;
    
    private boolean versionPrueba_;
    
    public void setNick (String nick) {nick_=nick;};
    
    public void setPass (String pass) {pass_=pass;};
    
    public void setPconex (String pconex) {pconex_=pconex;};
    
    public void setVersionPrueba (boolean versionPrueba) {versionPrueba_=versionPrueba;};
    
    public String getNick () {return nick_;};   
    
    public String getPass () {return pass_;};
    
    public String getPconex () {return pconex_;};
    
    public boolean getVersionPrueba () {return versionPrueba_;};
    
    
}
