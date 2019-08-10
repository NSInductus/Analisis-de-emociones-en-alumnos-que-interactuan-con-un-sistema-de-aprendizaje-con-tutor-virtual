
//INCLUSION NECESARIA DEL PAQUETE
package PaquetePreAnalisis;

//VERSION BETA ES EL PROYECTO PruebaTFGVIDEO2 de netbeans

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
 * @author angel
 */
//CLASE PRINCIPAL M A I N
public class Principal {
    
    ////////////////////////////
    //DECLARACION DE CONTADORES
    
    //CONTADORES MAYORITARIOS, SOLO CUENTAN LA CLASE MAYOR DE LA IMAGEN
    
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
    
     ////////////////////////////
    //DECLARACION DE CONTADORES GENERALES QUE MIEDEN CADA UNA DE LAS FOTOS ANALIZADAS
    
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
    
    ////////////////////////
    //CONTADOR surprise ESTE ES TANTO GENERAL COMO MAYORITARIO
    public static int noAnalizadoContador = 0;  
   
    /////////////////////////
    //MAS CONTADORES
    
    //CONTADOR ESPECIAL (VECES), para la pausa ya que las analice todas con la gratuita
    public static int veces = 0;  
    
    //CONTADOR del total de fotos analizadas
    public static int nFotosAnalizadas = 0;
    
    
    
    
    ////////////////////////////////
    /////////////////////////////////
    /////////////////////////////////
    
        //CONTADORES EN PORCENTAJES, RESPECTO A QUE?
    
    
    
    //CONTADOR anger
    public static double angerContadorPorcentaje = 0.0;  
        
    //CONTADOR contempt
    public static double contemptContadorPorcentaje = 0.0;      
      
    //CONTADOR disgust
    public static double disgustContadorPorcentaje = 0.0;
    
    //CONTADOR fear
    public static double fearContadorPorcentaje = 0.0;
          
    //CONTADOR happiness
    public static double happinessContadorPorcentaje = 0.0;
       
    //CONTADOR neutral
    public static double neutralContadorPorcentaje = 0.0;

    //CONTADOR sadness
    public static double sadnessContadorPorcentaje = 0.0;
       
    //CONTADOR surprise
    public static double surpriseContadorPorcentaje = 0.0;  
    
    ////////////////////////
    //CONTADOR surprise ESTE ES TANTO GENERAL COMO MAYORITARIO
    public static double noAnalizadoContadorPorcentaje = 0.0;  
    
    
    //////////////////////////////////
    /////////////////////////////////
    /////////////////////////////////
    

  
    

    
    
    
    ////////////////////////////
    //MAS VARIABLES QUE CONTENDRAN LOS VALORES QUE UTILIZARA EL PROGRAMA
    
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
    
    
    
    
    
    //////////////////////////////
    //VARIABLES NECESARIAS PARA EL PROCESAMIENTO
    
    //vector que contendra los datos de cada FRAME
    public static ArrayList<Contenedor> contenedorFrames = new ArrayList<>();
    
    //MENSAJE QUE APARECERA EN LA VENTANA DE ERROR
    public static String error = null;
 
    //COMPRUEBA SI EL USUARIO SE HA IDENTIFICADO O NO
    public static boolean sesionIniciada = false;
  
    //HILO PARA CREAR EL SUDPROCESO QUE HARA TODO EL ANALISIS DE VIDEO
    public static HiloProcesoPrincipal hilo1=new HiloProcesoPrincipal("Proceso principal de analisis de video");
   
    //STRING QUE CONTIENE EL VIDEO A ANALIZAR (ESTA AQUI PARA QUE PUEDA SER LLAMADO DESDE VARIOS LUGARES)
    public static String videoFile = null;
    
    
    
    
    
    ////////////////////////////
    //MAS VARIABLES QUE CONTENDRAN LOS VALORES QUE INTRODUCIRA EL USUARIO
    
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
    
    
    
    
    
    //////////////////////////////////////////
    //MAS DATOS DE IMPORTANCVVIA (NIVEL DE USUARIO)
    
    //SI ES O NO VERSION DE PRUEBA DE LA API DE MICROSOFT
    //ESTA SE ELEGE EN LA GESTION DE USUARIOS EN LUGAR DE LA VENTANA OPCIONES
    public static boolean versionPrueba = true;
    
    //VARIABLE PARA SABER CUANDO EL PROGRAMA ESTA EN PAUSA
    public static boolean estaEnPausa = false;
    
    //TODOS LOS DATOS
    public static Usuario user = new Usuario();
   
    
    
    
    
    //VENTANAS
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
    
    //VENTANA DESPUES DE ANALISIS (CON MENUS)
    public static VentanaDespuesDeAnalisis ventana_final = new VentanaDespuesDeAnalisis();
    
    //VENTANA GRAFICAS FINALES
    public static VentanaGraficas ventana_graficas = new VentanaGraficas();
    
    //VENTANA RESULTADOS FINALES
    public static VentanaResultadosFinales ventana_resultados = new VentanaResultadosFinales();
    
    
    
    //NOMBRE DEL VIDEO PARA TENERLO CUANDO SE GUARDEN LOS RESULTADOS
    public static String nombreFichero;
    
    //cambiar nombre a matar proceso principal¿?¿
    //nuevo
    public static boolean matarHilo;
    
    public static boolean errorDuranteAnalisis;
    
    public static int formatoResultado;
    
    
    //PARA DATASET UNICO (es decir, un unico XLSX para todos los videos)
    //Nombre del dataset unico que se almacenara en la ruta elegida en las opciones
    static public String nombreDatasetUnico = "datasetUnico";
    
    //Matriz donde cada fila es una de las filas del excell antiguo
    static public ArrayList<ArrayList<Double>> arrayDatosDatasetUnico = new ArrayList<>();
    
    //Vector donde cada posicion es el nombre de cada fila
    static public ArrayList<String> nombresDatasetUnico = new ArrayList<>();
    
    //Vector donde cada posicion es la fila que ocupa en el excel una fila de la matrix y una posicion del vector anterior
    static public ArrayList<Integer> rowsDatasetUnico = new ArrayList<>();

    
    //METODO PRINCIPAL FUNCION (JAVA)
    public static void main( String args[] ) throws Exception {
        
       //CREACIÓN VENTANA PRINCIPAL, la interfaz que verá el usuario
       //VentanaPrincipal ventana_principal = new VentanaPrincipal();
       
       //PONER VISIBLE LA VENTANA
       //ventana_principal.setVisible(true);   
      // ventana_principal.setResizable(false); 
      
      ventana_usuarios.setVisible(true);   
      ventana_usuarios.setResizable(false); 
      
  }  

}

