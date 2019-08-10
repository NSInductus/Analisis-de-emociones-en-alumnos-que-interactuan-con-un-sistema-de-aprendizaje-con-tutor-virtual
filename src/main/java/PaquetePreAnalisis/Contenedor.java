/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaquetePreAnalisis;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
//CLASE CONTENEDOR, para ir guardando cada clase y tiempo de cada FRAME
public class Contenedor {
    
    private ArrayList<Integer> clases_ = new ArrayList<>(); 
    
    
    private double tiempo_;
    
       private int claseMayor_;
    
       
       private String nombreFile_;
    
   
    public ArrayList<Integer> getClases() {return clases_;}
    
   

    public void setClases(ArrayList<Integer> clases) {clases_=clases;}
    
    public double getTiempo() {return tiempo_;}
    
    public void setTiempo(double tiempo) {tiempo_=tiempo;}
    
    public int getClaseMayor() {return claseMayor_;}
    
      public void setClaseMayor(int claseMayor) {claseMayor_=claseMayor;}
      
      public String getNombreFile(){return nombreFile_;};
      
      public void setNombreFile(String nombreFile){nombreFile_=nombreFile;};
    
}
