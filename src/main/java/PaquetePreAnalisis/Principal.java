//INCLUSION NECESARIA DEL PAQUETE
package PaquetePreAnalisis;


//IMPORT NECESARIOS
import PaqueteVentanas.VentanaDespuesDeAnalisis;
import PaqueteVentanas.VentanaUsuario;
import PaqueteVentanas.VentanaSeguimiento;
import PaqueteVentanas.VentanaPrincipal;
import PaqueteVentanas.VentanaGraficas;
import PaqueteVentanas.VentanaOpciones;
import PaqueteVentanas.VentanaResultadosFinales;
import PaqueteVentanas.VentanaUsuarioActualizar;
import PaqueteVentanas.VentanaUsuarioNuevo;
import PaqueteAnalisisVideo.HiloProcesoPrincipal;
import java.util.ArrayList;

/**
 *
 * @author Angel Murcia Diaz
 */

//CLASE PRINCIPAL (MAIN)
public class Principal {
    
    //////////////////////////////
    //DECLARACION DE CONTADORES//
    /////////////////////////////
    
    //DECLARACION DE CONTADORES GENERALES//
    
    //CONTADOR anger
    public static int angerContador = 0;  
        
    //CONTADOR contempt
    public static int contemptContador = 0;      
      
    //CONTADOR disgust
    public static int disgustContador = 0;
    
    //CONTADOR fear
    public static int fearContador= 0;
          
    //CONTADOR happiness
    public static int happinessContador = 0;
       
    //CONTADOR neutral
    public static int neutralContador = 0;

    //CONTADOR sadness
    public static int sadnessContador = 0;
       
    //CONTADOR surprise
    public static int surpriseContador = 0;  
    
    //CONTADOR NO ANALIZADO
    public static int noAnalizadoContador = 0;  
   
    //CONTADOR TOTAL DE FOTOGRAMAS
    public static int nFotosAnalizadas = 0;
    
    //CONTADOR (VECES), para la version de prueba
    public static int veces = 0;  
    
    //CONTADORES MAYORITARIOS//
    
    //CONTADOR anger MAYORITARIO
    public static int angerContadorMayor = 0;  
        
    //CONTADOR contempt MAYORITARIO
    public static int contemptContadorMayor = 0;      
      
    //CONTADOR disgust MAYORITARIO
    public static int disgustContadorMayor = 0;
    
    //CONTADOR fear MAYORITARIO
    public static int fearContadorMayor = 0;
          
    //CONTADOR happiness MAYORITARIO
    public static int happinessContadorMayor = 0;
       
    //CONTADOR neutral MAYORITARIO
    public static int neutralContadorMayor = 0;

    //CONTADOR sadness MAYORITARIO
    public static int sadnessContadorMayor = 0;
       
    //CONTADOR surprise MAYORITARIO
    public static int surpriseContadorMayor = 0;  
    
    //CONTADORES EN PORCENTAJES//

    //CONTADOR anger PORCENTAJE
    public static double angerContadorPorcentaje = 0.0;  
        
    //CONTADOR contempt PORCENTAJE
    public static double contemptContadorPorcentaje = 0.0;      
      
    //CONTADOR disgust PORCENTAJE
    public static double disgustContadorPorcentaje = 0.0;
    
    //CONTADOR fear PORCENTAJE
    public static double fearContadorPorcentaje = 0.0;
          
    //CONTADOR happiness PORCENTAJE
    public static double happinessContadorPorcentaje = 0.0;
       
    //CONTADOR neutral PORCENTAJE
    public static double neutralContadorPorcentaje = 0.0;

    //CONTADOR sadness PORCENTAJE
    public static double sadnessContadorPorcentaje = 0.0;
       
    //CONTADOR surprise PORCENTAJE
    public static double surpriseContadorPorcentaje = 0.0;  
    
     /////////////////////////////////////
    //VARIABLES (OPCIONES CONFIGURABLES)//
    /////////////////////////////////////
    
    //CON VALORES QUE UTILIZARA EL PROGRAMA//

    //UMBRAL PARA ACEPTAR EL SENTIMIENTO
    public static double umbralSentimiento = 0.1 ;
    
    //SEGUNDOS ENTRE FRAMES
    public static double segundosEntreFrames = 2;
    
    //RUTA DONDE GUARDAR TODO
    public static String rutaGuardar ;
    
    //HAY RUTA?
    public static boolean hayRutaConfirmada ;
    
    //GUARDAR FOTOGRAMAS
    public static boolean conservar;
        
    //VALORES QUE INTRODUCIRA EL USUARIO//
    
    //UMBRAL PARA ACEPTAR EL SENTIMIENTO
    public static double valorUsuarioUmbral = 0.1;
    
    //SEGUNDOS ENTRE FRAMES
    public static double valorUsuarioSegundosFrame = 2;
    
    //RUTA DONDE GUARDAR TODO
    public static String valorUsuarioRuta = "";
    
    //HAY RUTA?
    public static boolean hayRutaUsuario = false;
    
    //GUARDAR FOTOGRAMAS
    public static boolean valorUsuarioConservar = false;

    //////////////////////////////////////////////
    //VARIABLES NECESARIAS PARA EL PROCESAMIENTO//
    /////////////////////////////////////////////
    
    //vector que contendra los datos de cada FRAME
    public static ArrayList<Contenedor> contenedorFrames = new ArrayList<>();
    
    //MENSAJE QUE APARECERA EN LA VENTANA DE ERROR
    public static String error = null;
 
    //COMPRUEBA SI EL USUARIO SE HA IDENTIFICADO O NO
    public static boolean sesionIniciada = false;
  
    //HILO PARA CREAR EL SUDPROCESO QUE HARA TODO EL ANALISIS DE VIDEO
    public static HiloProcesoPrincipal hilo1=new HiloProcesoPrincipal("Proceso principal de analisis de video");
   
    //STRING QUE CONTIENE EL VIDEO A ANALIZAR 
    public static String videoFile = null;

    ///////////////////
    //DATOS (USUARIO)//
    //////////////////
    
    //TIPO DE VERSION DE LA API DE MICROSOFT
    public static boolean versionPrueba = true;
    
    //VARIABLE PARA SABER CUANDO EL PROGRAMA ESTA EN PAUSA
    public static boolean estaEnPausa = false;
    
    //TODOS LOS DATOS (USUARIO COMPLETO)
    public static Usuario user = new Usuario();

    ////////////
    //VENTANAS//
    ///////////
    
    //CREACIÓN VENTANA DE SEGUIMIENTO
    public static VentanaPrincipal ventana_principal = new VentanaPrincipal() ;
    
    //CREACIÓN VENTANA DE SEGUIMIENTO
    public static VentanaSeguimiento ventana_seguimiento = new VentanaSeguimiento() ;
    
    //CREACIÓN VENTANA DE ERROR
    public static VentanaOpciones ventana_opciones = new VentanaOpciones();
    
    //VENTANA DE ADMINISTRACION USUARIOS
    public static VentanaUsuario ventana_usuarios = new VentanaUsuario();
    
    //VENTANA NUEVO USUARIO
    public static VentanaUsuarioNuevo ventana_usuario_nuevo = new VentanaUsuarioNuevo();
    
    //VENTANA ACTUALIZAR USUARIO
    public static VentanaUsuarioActualizar ventana_usuario_actualizar = new VentanaUsuarioActualizar();
    
    //VENTANA DESPUES DE ANALISIS 
    public static VentanaDespuesDeAnalisis ventana_final = new VentanaDespuesDeAnalisis();
    
    //VENTANA GRAFICAS FINALES
    public static VentanaGraficas ventana_graficas = new VentanaGraficas();
    
    //VENTANA RESULTADOS FINALES
    public static VentanaResultadosFinales ventana_resultados = new VentanaResultadosFinales();
    
    ////////////////////////////////
    //VARIABLES PARA DATASET UNICO// 
    ///////////////////////////////

    //NOMBRE DEL DATASET UNICO
    static public String nombreDatasetUnico = "datasetUnico";
    
    //MATRIZ PARA ALMACENAR LAS FILAS DEL ANTERIOR DOCUEMNTO
    static public ArrayList<ArrayList<Double>> arrayDatosDatasetUnico = new ArrayList<>();
    
    //Vector donde cada posicion es el nombre de cada fila
    //VECTOR PARA ALMACENAR EN NOMBRE DE LOS VIDEOS DE CADA FILA
    static public ArrayList<String> nombresDatasetUnico = new ArrayList<>();
    
    //VECTOR PARA ALMACENAR LA POSICION QUE OCUPA CADA UNA DE LAS FILAS
    static public ArrayList<Integer> rowsDatasetUnico = new ArrayList<>();
    
    /////////////////
    //MAS VARIABLES//
    ////////////////
    
   //NOMBRE DEL VIDEO PARA TENERLO CUANDO SE GUARDEN LOS RESULTADOS
    public static String nombreFichero;
    
    //VARIABLE PARA MATAR UN HILO
    public static boolean matarHilo;
    
    //VARIABLE QUE INDICA SI EXISTE UN ERROR DURANTE EL ANALISIS
    public static boolean errorDuranteAnalisis;
    
    //VARIABLE PARA INDICAR EL FORMATO DE LOS RESULTADOS
    public static int formatoResultado;

    
    //METODO PRINCIPAL(JAVA)
    public static void main( String args[] ) throws Exception {
      
      //MOSTRAR EL PRIMER MENU (MENU DE USUARIOS)
      ventana_usuarios.setVisible(true);   
      //NO PERMITIR REDIMENSION DE LA VENTANA
      ventana_usuarios.setResizable(false); 
      
  }  

}

