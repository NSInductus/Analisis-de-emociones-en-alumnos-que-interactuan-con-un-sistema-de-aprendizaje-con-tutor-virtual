//PAQUETE NECESARIO
package PaquetePreAnalisis;

//IMPORT NECESARIO
import java.util.ArrayList;

/**
 *
 * @author Angel Murcia Diaz
 */

//CLASE CONTENEDOR
public class Contenedor {
    
    /////////////
    //VARIABLES//
    ////////////
    
    //VECTOR PARA ALMACENAR LA CLASE DE CADA FOTOGRAMA
    private ArrayList<Integer> clases_ = new ArrayList<>(); 
    
    //TIEMPO DEL VIDEO DONDE SE PRODUCE EL FOTOFRAME
    private double tiempo_;
    
    //CLASE CON MAYOR PORCENTAJE EN EL FOTOFRAME
    private int claseMayor_;
    
    //NOMBRE DEL FOTOFRAME
    private String nombreFile_;
    
    /////////////////
    //MODIFICADORES//
    ////////////////
    
    //MODIFICADOR DEL VECTOR CLASES
    public void setClases(ArrayList<Integer> clases) {clases_=clases;}
    
    //MODIFICADOR DE TIEMPO
    public void setTiempo(double tiempo) {tiempo_=tiempo;}  
    
    //MODIFICADOR CLASE MAYOR
    public void setClaseMayor(int claseMayor) {claseMayor_=claseMayor;}
      
    //MODIFICADOR NOMBRE DEL ARCHIVO
    public void setNombreFile(String nombreFile){nombreFile_=nombreFile;};
    
    
    /////////////////
    //OBSERVADORES//
    ////////////////
    
    //OBSERVADOR DEL VECTOR CLASES
    public ArrayList<Integer> getClases() {return clases_;}
    
    //OBSERVADOR TIEMPO
    public double getTiempo() {return tiempo_;}
    
    //OBSERVADOR CLASE MAYOR
    public int getClaseMayor() {return claseMayor_;}
    
    //OBSERVADOR NOMBRE DEL ARCHIVO
    public String getNombreFile(){return nombreFile_;};
    
}
