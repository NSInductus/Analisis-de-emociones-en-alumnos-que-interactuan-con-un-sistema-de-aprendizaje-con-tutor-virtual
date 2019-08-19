//PAQUETE NECESARIO
package PaquetePreAnalisis;

/**
 *
 * @author Angel Murcia Diaz
 */

//CLASE USUARIO
public class Usuario {
    
    //////////////////////
    //VARIABLES PRIVADAS//
    /////////////////////
    
    //NOMBRE DE USUARIO
    private String nick_;
    
    //CONTRASEÑA DE USUARIO
    private String pass_;
    
    //P.CONEXION DE USUARIO
    private String pconex_;
    
    //TIPO DE VERSION DE USUARIO
    private boolean versionPrueba_;
    
    /////////////////
    //MODIFICADORES//
    ////////////////
    
    //MODIFICADCOR DE NICK
    public void setNick (String nick) {nick_=nick;};
    
    //MODIFICADOR DE PASS
    public void setPass (String pass) {pass_=pass;};
    
    ///MODIFICADOR DE PCONEX
    public void setPconex (String pconex) {pconex_=pconex;};
    
    //MODIFICADOR VERSION PRUEBA
    public void setVersionPrueba (boolean versionPrueba) {versionPrueba_=versionPrueba;};
    
    ////////////////
    //OBSERVADORES//
    ///////////////
    
    //OBSERVADOR NICK
    public String getNick () {return nick_;};   
    
    //OBSERVADOR PASS
    public String getPass () {return pass_;};
    
    //OBSERVADOR PCONEX
    public String getPconex () {return pconex_;};
    
    //OBSERVADOR VERSION PRUEBA
    public boolean getVersionPrueba () {return versionPrueba_;};
    
    
}
