//INCLUSION NECESARIA DEL PAQUETE
package PaquetePrincipal;

//IMPORT NECESARIOS
import PaquetePrincipal.Principal;
import com.xuggle.xuggler.Global;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.FileEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.json.JSONArray;
import org.json.JSONObject;


import javax.swing.JFrame;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;



/**
 *
 * @author angel
 */
//CLASE FUNCIONES
public class Funciones {
    
    //CLAVE PARA MICROSOFT 8 813359314d3f4f668817780a09f885b4
    private static String subscriptionKey = "823a11f5e8024d94ab8e101df6ec7c6b";

    //COMO LUGAR FISICO DONDE ACTUARA LA faceAPI
    private static String uriBase =
        "https://westcentralus.api.cognitive.microsoft.com/face/v1.0/detect";


    //ATRIBUTOS QUE SE DESEAN EXTRAER DE LA CARA
    private static final String faceAttributes =
        "emotion";
    
    //PARA LA COMPROBACION DE LOS ARCHIVOS EXCEL
    public static final Logger LOGGER = Logger.getLogger("mx.com.hash.newexcel.ExcelOOXML");

    //FUNCION PARA INICIALIZAR LOS VALORES NECESARIOS PARA UN NUEVO ANALISIS
    public void inicializarValoresIniciales(){
        
        //CLAVE PARA MICROSOFT INICIALIZAR
        subscriptionKey = Principal.user.getPass();

        //COMO LUGAR FISICO DONDE ACTUARA LA faceAPI INICIALIZAR
        uriBase = Principal.user.getPconex();


        //contador anger
        Principal.angerContador = 0;  

        //contador contempt
        Principal.contemptContador = 0;      

        //contador disgust
        Principal.disgustContador = 0;

        //contador fear
        Principal.fearContador= 0;

        //contador happiness
        Principal.happinessContador = 0;

        //contador neutral
        Principal.neutralContador = 0;

         //contador sadness
        Principal.sadnessContador = 0;

        //contador surprise
        Principal.surpriseContador = 0;  
        
        //contador anger
        Principal.angerContadorMayor = 0;  

        //contador contempt
        Principal.contemptContadorMayor = 0;      

        //contador disgust
        Principal.disgustContadorMayor = 0;

        //contador fear
        Principal.fearContadorMayor = 0;

        //contador happiness
        Principal.happinessContadorMayor = 0;

        //contador neutral
        Principal.neutralContadorMayor = 0;

         //contador sadness
        Principal.sadnessContadorMayor = 0;

        //contador surprise
        Principal.surpriseContadorMayor = 0;  

        //para la pausa y que las analice todas con la gratuita
        //NO porque si se inicializa puede haber problemas si se cancelan analisis
        //Principal.veces = 0;  

        //contador del total de fotos analizadas
        Principal.nFotosAnalizadas = 0;
        
        //contador de no analizadas
        Principal.noAnalizadoContador = 0;


        
        //CONTADORES EN PORCENTAJES
        
         //CONTADOR anger
    Principal.angerContadorPorcentaje = 0.0;  
        
    //CONTADOR contempt
    Principal.contemptContadorPorcentaje = 0.0;      
      
    //CONTADOR disgust
    Principal.disgustContadorPorcentaje = 0.0;
    
    //CONTADOR fear
    Principal.fearContadorPorcentaje = 0.0;
          
    //CONTADOR happiness
    Principal.happinessContadorPorcentaje = 0.0;
       
    //CONTADOR neutral
    Principal.neutralContadorPorcentaje = 0.0;

    //CONTADOR sadness
    Principal.sadnessContadorPorcentaje = 0.0;
       
    //CONTADOR surprise
    Principal.surpriseContadorPorcentaje = 0.0;  
    
    ////////////////////////
    //CONTADOR surprise ESTE ES TANTO GENERAL COMO MAYORITARIO
    Principal.noAnalizadoContadorPorcentaje = 0.0;  
        
        
        

        
        //umbral configurado por el usuario
        Principal.umbralSentimiento = Principal.valorUsuarioUmbral ;

        //segundos entre los frames del video
        Principal.segundosEntreFrames = Principal.valorUsuarioSegundosFrame ;
          
        //ruta para guardar el archivo
        Principal.rutaGuardar = Principal.valorUsuarioRuta ;
        
        //para saber si hay ruta
        Principal.hayRutaUsuario = Principal.hayRutaConfirmada;
        
        //para conservar o no fotogramas y datos
        Principal.conservar = Principal.valorUsuarioConservar;
        
        
      //Indicar de la existencia de un error durante un análisis
        Principal.errorDuranteAnalisis=false;
        
        //Indica el formato en el que se muestra las soluciones
        //1 total
        //2 porcentaje
        Principal.formatoResultado = 1;
       

        //PARA PODER ANALIZAR VARIOS VIDEOS AL ABRIR UNA VEZ LA INTERFAZ

        //Tiempo al final de escrbir cada frame
        DecodeAndCaptureFrames.mLastPtsWrite = Global.NO_PTS;

        //Indice de flujo de videos, necesario
        DecodeAndCaptureFrames.mVideoStreamIndex = -1;
        
        //nuevo
        Principal.matarHilo=false;
  

    }

    //FUNCION PARA IMPRIMIR LOS SEGUNDOS Y LA FOTO CREADA
    public void funcionImprimir(double segundos, File file){

        System.out.printf("(SEGUNDO DE LA FOTO / ARCHIVO CREADO) at elapsed time of %6.3f seconds wrote: %s\n",segundos, file);

    }

    //FUNCION PARA ANALIZAR CADA UNO DE LOS ARCHIVOS 
    //los segundos para guardar mas facilemente
    public void face (File file, double seconds){ 

      //Principal.ventana_seguimiento.actualizar();
  

    //CREACION DEL CLIENTE, necesaria para el analisis
    HttpClient httpclient = HttpClientBuilder.create().build();

    //TRY NECESARIO, para evitar errores
    try
    {
        //CREACION DEL OBJETO URI, necesario
        URIBuilder builder = null;
            try {
                builder = new URIBuilder(uriBase);
            } catch (URISyntaxException ex) {
                Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            }

        //APLICACION DE PARAMETROS, del analisis
        builder.setParameter("returnFaceId", "true");
        builder.setParameter("returnFaceLandmarks", "false");
        builder.setParameter("returnFaceAttributes", faceAttributes);

        //PREPARACION DE LA LLAMADA A LA APIFACE    
        URI uri = null;
            try {
                uri = builder.build();
            } catch (URISyntaxException ex) {
                Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        //OBEJTO NECESARIO, que contiene toda la configuracion
        HttpPost request = new HttpPost(uri);

        //APLICACION DE MAS PARAMETROS NECESARIOS, como la clave
        request.setHeader("Content-Type", "application/octet-stream");
        request.setHeader("Ocp-Apim-Subscription-Key", subscriptionKey);

        //CREACION DEL FILEENTITY Y ENTRADA COMO PARAMETRO EN EL REQUEST(objeto con los datos necesarios para analisis)
        FileEntity reqEntity = new FileEntity(file);
        request.setEntity(reqEntity);

        //EJECUCION O PETICION A LA APIFACE
        HttpResponse response = null;
            try {
                response = httpclient.execute(request);
            } catch (IOException ex) {
                Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        HttpEntity entity = response.getEntity();

        //COMPROBACION, para ver si devuelve algo la llamada
        if (entity != null)
            {
                //CABEZERA PARA MOSTRAR LA RESPUESTA DEL SERVICIO DE FACEAPI.
                System.out.println("REST Response (respuesta de la API de Microsoft):\n");

                //STRING QUE CONTENDRA LA RESPUES DE LA API
                String jsonString = null;

                //TRY NECESARIO, INSERCION DE LA RESPUESTA EN EL STRING ANTERIOR
                try {
                    jsonString = EntityUtils.toString(entity).trim();
                } catch (IOException ex) {
                    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (jsonString.charAt(0) == '[') {
                    JSONArray jsonArray = new JSONArray(jsonString);
                    System.out.println(jsonArray.toString(2));
                    System.out.println("1");  
                }else if (jsonString.charAt(0) == '{') {
                    JSONObject jsonObject = new JSONObject(jsonString);
                    System.out.println(jsonObject.toString(2));
                    System.out.println("2");  
                } else {
                    System.out.println(jsonString);
                    System.out.println("3");  
                }
                

                //LLAMA A LA FUNCION CLASE, para ver a que clase pertenece cada foto
                clase (jsonString,seconds,file);

            }
        }
        catch (Exception e)
        {
            // Display error message.
            System.out.println(e.getMessage());
        }

    }

    //FUNCION CLASE PARA VER EL PORCENTAJE MAS ALTO Y DECIR A LA CLASE QUE PERTENECE
    //segundos para guardarlso facilmente en el vector
    public void clase (String jsonString, double seconds, File file){
        
        
                //STRING QUE CONTIENE EL NOMBRE DEL ARCHIVO PARA PODER IR ALMACENANDOLO JUNTO CON SUS RESULTADOS
        String nombreFile = file.getName();

        if(jsonString.length() == 2){

        //STRING AUXILIAR PARA IR EXTRAYENDO LOS POCENTAJES DE CADA CLASE, se corta la cadena original
        String cortadoComprobacion=jsonString.substring(jsonString.lastIndexOf("["), jsonString.length());
        System.out.println(cortadoComprobacion);
        

        

        
        //COMPROBACION DE QUE ESTA ANALIZANDO EL FOTOGRMAA
        if("[]".equals(cortadoComprobacion)){
            
                //System.out.println("holiiiiiiiiiiiii");
                Principal.noAnalizadoContador++;
                                  //AUMENTAN LAS FOTOS ANALIZADAS
              Principal.nFotosAnalizadas++;
              
          
                
                //VECTOR AUXILIAR NECESARIO PARA INTRODUCIR UN VECTOR DE CLASES A INSERTAR
                ArrayList<Integer> vectorAux = new ArrayList<> ();
                
                vectorAux.add(8);
                
                //GUARDADO EN VECTOR
                //meto manualmente la clase8:No analizado
                insertarElementoVector(8,vectorAux,seconds, nombreFile);
            
        }
        
        
        }else{
           
            //STRING AUXILIAR PARA IR EXTRAYENDO LOS POCENTAJES DE CADA CLASE, se corta la cadena original
            String cortadoError=jsonString.substring(2, 7);
            System.out.println("|"+cortadoError+"|");



           if("error".equals(cortadoError)){

                 System.out.println("Error locacalizado en el proceso de análisis");
                 //cerrar ventana povisional
                 //abrir menu principal
                 //ventana error con fallo
                 
                 if(Principal.errorDuranteAnalisis == false){
                 
            //ERROR DESEADO
            Principal.error = "ERROR EN DURANTE EL ANÁLISIS";
            
            //CREACIÓN VENTANA DE ERROR
            VentanaErrorParaProceso ventana_error_para_proceso = new VentanaErrorParaProceso();
         
            //PONER VISIBLE LA VENTANA
            ventana_error_para_proceso.setVisible(true);  
            
            //PONER LA VENTANA DE TAMAÑO FIJO
            ventana_error_para_proceso.setResizable(false);
            
            Principal.errorDuranteAnalisis=true;
            
                 }

            }

            
            
        }

        //STRING AUXILIAR PARA IR EXTRAYENDO LOS POCENTAJES DE CADA CLASE, se corta la cadena original
        String cortado=jsonString.substring(jsonString.lastIndexOf("\"anger\":"), jsonString.lastIndexOf("}}}]"));

        //OTRO STRING AUXILIAR EN EL CUAL SE IRA CORTANDO EL TROZO CORTADO
        String aux;

        //PARA OBTENER EL PROCENTAJE DE ANGER
        aux=cortado.substring(8, cortado.lastIndexOf(",\"contempt\"") );

        //VARIABLE, para almacenar el porcentaje de anger
        float angerPorcentaje = Float.parseFloat(aux);  

        //PARA OBTENER EL PROCENTAJE DE CONTEMPT
        aux=cortado.substring(cortado.lastIndexOf(",\"contempt\"")+12, cortado.lastIndexOf(",\"disgust\"") );

        //VARIABLE, para almacenar el porcentaje de contempt
        float contemptPorcentaje = Float.parseFloat(aux);      

        //PARA OBTENER EL PROCENTAJE DE DISGUST
        aux=cortado.substring(cortado.lastIndexOf(",\"disgust\"")+11, cortado.lastIndexOf(",\"fear\"") );

        //VARIABLE, para almacenar el porcentaje de disgust
        float disgustPorcentaje = Float.parseFloat(aux);

        //PARA OBTENER EL PROCENTAJE DE FEAR
        aux=cortado.substring(cortado.lastIndexOf(",\"fear\"")+8, cortado.lastIndexOf(",\"happiness\"") );

        //VARIABLE, para almacenar el porcentaje de fear
        float fearPorcentaje = Float.parseFloat(aux);

        //PARA OBTENER EL PROCENTAJE DE HAPPINESS
        aux=cortado.substring(cortado.lastIndexOf(",\"happiness\"")+13, cortado.lastIndexOf(",\"neutral\"") );

        //VARIABLE, para almacenar el porcentaje de happiness
        float happinessPorcentaje = Float.parseFloat(aux);

        //PARA OBTENER EL PROCENTAJE DE NEUTRAL
        aux=cortado.substring(cortado.lastIndexOf(",\"neutral\"")+11, cortado.lastIndexOf(",\"sadness\"") );

        //VARIABLE, para almacenar el porcentaje de neutral
        float neutralPorcentaje = Float.parseFloat(aux);

        //PARA OBTENER EL PROCENTAJE DE SADNESS
        aux=cortado.substring(cortado.lastIndexOf(",\"sadness\"")+11, cortado.lastIndexOf(",\"surprise\"") );

        //VARIABLE, para almacenar el porcentaje de sadness
        float sadnessPorcentaje = Float.parseFloat(aux);

        //PARA OBTENER EL PROCENTAJE DE SURPRISE
        aux=cortado.substring(cortado.lastIndexOf(",\"surprise\"")+12, cortado.length() );

        //VARIABLE, para almacenar el porcentaje de surprise
        float surprisePorcentaje = Float.parseFloat(aux);  

        //RESUMEN DE CADA FOTO CON SUS RESPECTIVOS PORCENTAJES

        System.out.println("----------------RESUMEN DE PORCENTAJES------------");

        System.out.print("anger:");
        System.out.println(angerPorcentaje);

        System.out.print("contempt: ");
        System.out.println(contemptPorcentaje);

        System.out.print("disgust: ");
        System.out.println(disgustPorcentaje);

        System.out.print("fear: ");
        System.out.println(fearPorcentaje);

        System.out.print("happiness: ");
        System.out.println(happinessPorcentaje);       

        System.out.print("neutral: ");
        System.out.println(neutralPorcentaje);      

        System.out.print("sadness: ");
        System.out.println(sadnessPorcentaje); 

        System.out.print("surprise: ");
        System.out.println(surprisePorcentaje); 

        ////////////////////////////////////////////////////////////

        //VARIABLE PARA ALMACENAR LA CLASE A LA QUE PERTENECE CADA FOTO
        int claseMayor=0;

        //VARIABLE que guardara el porcentaje mayor
        float mayor=angerPorcentaje;

        //COMPROBACIONES PARA VER EL PORCENTAJE MAYOR (por tanto a la clase que pertenece)

        if(mayor<contemptPorcentaje){

            mayor=contemptPorcentaje;
            claseMayor=1;     

        }

        if(mayor<disgustPorcentaje){

            mayor=disgustPorcentaje;
            claseMayor=2;  

        }        

        if(mayor<fearPorcentaje){

            mayor=fearPorcentaje;
            claseMayor=3;   

        }          

        if(mayor<happinessPorcentaje){

            mayor=happinessPorcentaje;
            claseMayor=4; 

        }          

        if(mayor<neutralPorcentaje){

            mayor=neutralPorcentaje;
            claseMayor=5;

        }   

        if(mayor<sadnessPorcentaje){

            mayor=sadnessPorcentaje;
            claseMayor=6;  

        }       

        if(mayor<surprisePorcentaje){

            mayor=surprisePorcentaje;
            claseMayor=7;   

        } 

        //SUMA EN EL CONTADOR DE LA VARIABLE CORRECTA DEPENDIENDO A LA CLASE QUE PERTENEZCA LA FOTO 
        System.out.print("1.Clase mayor: ");
        System.out.println(claseMayor); 

        // declaración de switch
        switch (claseMayor) {
            // declaración case
            // los valores deben ser del mismo tipo de la expresión
            case 0:
                // Declaraciones
                Principal.angerContadorMayor++;
                break; // break es opcional

            case 1:
                // Declaraciones
                Principal.contemptContadorMayor++;
                break; // break es opcional
                
            case 2:
                // Declaraciones
                Principal.disgustContadorMayor++; 
                break; // break es opcional

            case 3:
                // Declaraciones
                Principal.fearContadorMayor++; 
                break; // break es opcional
                
            case 4:
                // Declaraciones
                Principal.happinessContadorMayor++; 
                break; // break es opcional

            case 5:
                // Declaraciones
                Principal.neutralContadorMayor++;
                break; // break es opcional
                
            case 6:
                // Declaraciones
                Principal.sadnessContadorMayor++;
                break;

            case 7:
                // Declaraciones
                Principal.surpriseContadorMayor++; 
                break; // break es opcional

            // Podemos tener cualquier número de declaraciones de casos o case
            // debajo se encuentra la declaración predeterminada, que se usa cuando ninguno de los casos es verdadero.
            // No se necesita descanso en el case default
            default:
            // Declaraciones
        }
        
        //VECTOR AUXILIAR PARA ALMACENAR LAS CLASES A LAS QUE PERTENECE
        ArrayList<Integer> clases = new ArrayList<>(); 
        
        //ANALISIS DE LAS DISTINTAS CATEGORIAS QUE PERTENECE (LAS QUE SUPERAN EL UMBRAL)
        
        if(angerPorcentaje >= Principal.umbralSentimiento){

            clases.add(0);
            Principal.angerContador++;


        }
        
        if(contemptPorcentaje >= Principal.umbralSentimiento){

            clases.add(1);
            Principal.contemptContador++;
 

        }

        if(disgustPorcentaje >= Principal.umbralSentimiento){

             clases.add(2);
             Principal.disgustContador++;
  

        }        

        if(fearPorcentaje >= Principal.umbralSentimiento){

             clases.add(3); 
             Principal.fearContador++;


        }          

        if(happinessPorcentaje >= Principal.umbralSentimiento){

            clases.add(4); 
            Principal.happinessContador++;


        }          

        if(neutralPorcentaje >= Principal.umbralSentimiento ){

            clases.add(5); 
            Principal.neutralContador++;


        }   

        if(sadnessPorcentaje >= Principal.umbralSentimiento){

            clases.add(6);  
            Principal.sadnessContador++;


        }       

        if(surprisePorcentaje >= Principal.umbralSentimiento){

            clases.add(7); 
            Principal.surpriseContador++;
  

        } 
        

        //GUARDADO EN VECTOR
        insertarElementoVector(claseMayor, clases, seconds, nombreFile);

        //IMPRESION DE LA CLASES A LA QUE PERTENECE LA FOTO
        System.out.print("2.Clases existentes: ");
        
        for(int i=0; i<clases.size(); i++){
            
            System.out.print(clases.get(i)+ "  ");
            
        }
        System.out.println("");
        
                          //AUMENTAN LAS FOTOS ANALIZADAS
              Principal.nFotosAnalizadas++;

        imprimir ("DESPUES DE ANALIZAR UNA FOTO:", "Mayoritario");
        imprimir ("DESPUES DE ANALIZAR UNA FOTO:", "Generales");
        
    //   Principal.hilo1.interrupt();
       
      //Principal.hilo2.start();
       
    //   Principal.hilo1.


    }

    //FUNCION PARA IMPRIMIR LOS RESULTADOS
    public void imprimir (String descripcion, String tipo){


        System.out.println("------------------------RESUMEN-------------------------");
        System.out.println(descripcion);
        System.out.println("--------------------------------------------------------");
        
        if("Mayoritario".equals(tipo)){
            
            System.out.println("------------------------------------------------------");
            System.out.println(tipo);
            System.out.println("--------------------------------------------------------");

            System.out.print("anger:");
            System.out.println(Principal.angerContadorMayor);

            System.out.print("contempt: ");
            System.out.println(Principal.contemptContadorMayor);

            System.out.print("disgust: ");
            System.out.println(Principal.disgustContadorMayor);

            System.out.print("fear: ");
            System.out.println(Principal.fearContadorMayor);

            System.out.print("happiness: ");
            System.out.println(Principal.happinessContadorMayor);       

            System.out.print("neutral: ");
            System.out.println(Principal.neutralContadorMayor);      

            System.out.print("sadness: ");
            System.out.println(Principal.sadnessContadorMayor); 

            System.out.print("surprise: ");
            System.out.println(Principal.surpriseContadorMayor); 

            System.out.print("Fotos NO analizadas: ");
            System.out.println(Principal.noAnalizadoContador);

            System.out.print("Fotos analizadas: ");
            System.out.println(Principal.nFotosAnalizadas); 
            
        }else if("Porcentajes".equals(tipo)){
            
                        System.out.println("------------------------------------------------------");
            System.out.println(tipo);
            System.out.println("--------------------------------------------------------");

            System.out.print("anger:");
            System.out.println(Principal.angerContadorPorcentaje);

            System.out.print("contempt: ");
            System.out.println(Principal.contemptContadorPorcentaje);

            System.out.print("disgust: ");
            System.out.println(Principal.disgustContadorPorcentaje);

            System.out.print("fear: ");
            System.out.println(Principal.fearContadorPorcentaje);

            System.out.print("happiness: ");
            System.out.println(Principal.happinessContadorPorcentaje);       

            System.out.print("neutral: ");
            System.out.println(Principal.neutralContadorPorcentaje);      

            System.out.print("sadness: ");
            System.out.println(Principal.sadnessContadorPorcentaje); 

            System.out.print("surprise: ");
            System.out.println(Principal.surpriseContadorPorcentaje); 

            System.out.print("Fotos NO analizadas: ");
            System.out.println(Principal.noAnalizadoContador);

            System.out.print("Fotos analizadas: ");
            System.out.println(Principal.nFotosAnalizadas); 
            
            
        }else{
            
            System.out.println("------------------------------------------------------");
            System.out.println(tipo);
            System.out.println("--------------------------------------------------------");
            
            System.out.print("anger:");
            System.out.println(Principal.angerContador);

            System.out.print("contempt: ");
            System.out.println(Principal.contemptContador);

            System.out.print("disgust: ");
            System.out.println(Principal.disgustContador);

            System.out.print("fear: ");
            System.out.println(Principal.fearContador);

            System.out.print("happiness: ");
            System.out.println(Principal.happinessContador);       

            System.out.print("neutral: ");
            System.out.println(Principal.neutralContador);      

            System.out.print("sadness: ");
            System.out.println(Principal.sadnessContador); 

            System.out.print("surprise: ");
            System.out.println(Principal.surpriseContador); 

            System.out.print("Fotos NO analizadas: ");
            System.out.println(Principal.noAnalizadoContador);

            System.out.print("Fotos analizadas: ");
            System.out.println(Principal.nFotosAnalizadas); 
        
        
        
        }


    }
    
    //////////////////////////////////////////////////
    //FUNCIONES DE CONTENEDOR
    
    //FUNCION PARA AÑADIR UN ELEMENTO AL VECTOR
    public void insertarElementoVector(int claseMayor, ArrayList<Integer> clases, double tiempo, String nombreFile){
        
        //CREACION DEL CONTENEDOR AUXILIAR
        Contenedor aux = new Contenedor();
        
        //RELLENAR CLASE EN AUXILIAR
        aux.setClases(clases);
        
        //RELLENAR CLASE MAYOR EN AUXILIAR
        aux.setClaseMayor(claseMayor);
        
        //RELLENAR TIEMPO EN AUXILIAR
        aux.setTiempo(tiempo);
        
        //RELLENAR EL NOMBRE DLE ARCHIVO EN EL AUXILIAR
        aux.setNombreFile(nombreFile);
        
        //AÑADIR AL VECTOR
        Principal.contenedorFrames.add(aux);
           
    }
    
    public void listarContenedor(){
        
        //PARA RECOGER TODOS LOS ELEMENTOS DEL VECTOR O CONTENEDOR
        for( int i=0 ; i<Principal.contenedorFrames.size() ; i++ ){
            
            //IMPRESION DE ELEMENTOS
            System.out.print("El frame analizado: ");
            System.out.println(i); 
            
            System.out.print("El archivo se llama: ");
            System.out.println(Principal.contenedorFrames.get(i).getNombreFile()); 
            
            System.out.print("pertenece al segundo: ");
            System.out.println(Principal.contenedorFrames.get(i).getTiempo()); 
            
            //PROCEDIMIENTO PARA IMPRIMIR CADENA EN LUGAR DEL NUMERO, mas bonito
            int clase = Principal.contenedorFrames.get(i).getClaseMayor();
            String claseCadena = claseEnteroACadena(clase);
           
            System.out.print("y es de la clase (MAYORITARIA): ");
            System.out.println(claseCadena); 
            
            
            //IMPRESION DE TODAS LAS CLASES PERTENECIENTES
            ArrayList<Integer> clases = new ArrayList<>();
            clases = Principal.contenedorFrames.get(i).getClases();
            
            System.out.print("Las clases a la que pertenece la foto son: ");
            
            for(int j=0; j<clases.size(); j++){
            
                clase = clases.get(j);
                
                claseCadena = claseEnteroACadena(clase);
                
                System.out.println(claseCadena + "   ");
                
            
            }
            
            System.out.println("");
        }
        
    }
    
    String claseEnteroACadena(int clase){
        
        String claseCadena = null;
        
            if(clase == 0){

                claseCadena="anger";

            }

            if(clase == 1){

                claseCadena="contempt";

            }

            if(clase == 2){

                claseCadena="disgust";          

            }

            if(clase == 3){

                claseCadena="fear";           

            }

            if(clase == 4){

                claseCadena="happiness";          

            }

            if(clase == 5){

               claseCadena="neutral";        

            }

            if(clase == 6){

                claseCadena="sadness";        

            }

            if(clase == 7){

                claseCadena="surprise"; 

            }
            
            if(clase == 8){

                claseCadena="no analizado"; 

            }
        
          return claseCadena;
        
    }
    
    
    /*

        void resultadosTXT() throws IOException{
            
            System.out.println(Principal.nombreFichero);
            
            String ruta = Principal.rutaGuardar + "\\" + Principal.nombreFichero + ".txt" ;
            
            
            //String ruta = "C:\\Users\\angel\\Desktop\\prueba\\resultados.txt";

            
            FileWriter fichero = null;
            PrintWriter pw = null;
        
        try
        {
        	fichero = new FileWriter(ruta);
           	pw = new PrintWriter(fichero);
                  

                pw.println("------------------------RESUMEN EN FICHERO-------------------------");   
                pw.println("--------------------------------------------------------"); 

                pw.println("anger:");
                pw.println(Principal.angerContador);

                pw.println("contempt: ");
                pw.println(Principal.contemptContador);

                pw.println("disgust: ");
                pw.println(Principal.disgustContador);

                pw.println("fear: ");
                pw.println(Principal.fearContador);

                pw.println("happiness: ");
                pw.println(Principal.happinessContador);

                pw.println("neutral: ");
                pw.println(Principal.neutralContador);

                pw.println("sadness: ");
                pw.println(Principal.sadnessContador);

                pw.println("surprise: ");
                pw.println(Principal.surpriseContador);

                pw.println("Fotos NO analizadas: ");
                pw.println(Principal.noAnalizadoContador);

                pw.println("Fotos analizadas: ");
                pw.println(Principal.nFotosAnalizadas);

                    
                
 
        } catch (Exception e) {
        	e.printStackTrace();
        } finally {
        	try {
    			// Nuevamente aprovechamos el finally para 
        		// asegurarnos que se cierra el fichero.
        		if (null != fichero)
        			fichero.close();
        	} catch (Exception e2) {
        		e2.printStackTrace();
        	}
        }
            
            
            
            
        }
        
        
    void crearDataset(){
    
       String nombreFichero = Principal.rutaGuardar + "\\" + Principal.nombreFichero + ".xlsx" ;
                   
        
        // Creamos el archivo donde almacenaremos la hoja
        // de calculo, recuerde usar la extension correcta,
        // en este caso .xlsx
        //File archivo = new File("C:\\Users\\angel\\Desktop\\nuevoDataset.xlsx");
        
        File archivo = new File(nombreFichero);
          

        // Creamos el libro de trabajo de Excel formato OOXML
        Workbook workbook = new XSSFWorkbook();

        // La hoja donde pondremos los datos
        Sheet pagina = workbook.createSheet("Resumen de las emociones del sujeto");
        
      
        
        // Creamos el estilo paga las celdas del encabezado
        CellStyle style = workbook.createCellStyle();
        // Indicamos que tendra un fondo azul aqua
        // con patron solido del color indicado
        style.setFillForegroundColor(IndexedColors.BLUE.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        
   



        String[] titulos = {"anger", "contempt",
            "disgust", "fear", "happiness", "neutral", "sadness", "surprise", "not analyzed", "total"};
        Integer[] datos = {Principal.angerContador, Principal.contemptContador, Principal.disgustContador, Principal.fearContador, Principal.happinessContador, 
            Principal.neutralContador, Principal.sadnessContador, Principal.surpriseContador, Principal.noAnalizadoContador, Principal.nFotosAnalizadas};

        // Creamos una fila en la hoja en la posicion 0
        Row fila = pagina.createRow(0);

        // Creamos el encabezado
        for (int i = 0; i < titulos.length; i++) {
            // Creamos una celda en esa fila, en la posicion 
            // indicada por el contador del ciclo
            Cell celda = fila.createCell(i);

            // Indicamos el estilo que deseamos 
            // usar en la celda, en este caso el unico 
            // que hemos creado
            //celda.setCellStyle(style);
            celda.setCellValue(titulos[i]);
        }

        // Ahora creamos una fila en la posicion 1
        fila = pagina.createRow(1);

        // Y colocamos los datos en esa fila
        for (int i = 0; i < datos.length; i++) {
            // Creamos una celda en esa fila, en la
            // posicion indicada por el contador del ciclo
            Cell celda = fila.createCell(i);

            celda.setCellValue(datos[i]);
            
              pagina.autoSizeColumn(i);
            
        }

        // Ahora guardaremos el archivo
        try {
            // Creamos el flujo de salida de datos,
            // apuntando al archivo donde queremos 
            // almacenar el libro de Excel
            FileOutputStream salida = new FileOutputStream(archivo);

            // Almacenamos el libro de 
            // Excel via ese 
            // flujo de datos
            workbook.write(salida);

            // Cerramos el libro para concluir operaciones
            workbook.close();

            LOGGER.log(Level.INFO, "Archivo creado existosamente en {0}", archivo.getAbsolutePath());

        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.SEVERE, "Error con la creacion del archivo");
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, "Error de entrada/salida");
        }

    
    }
    
    
    void crearDatasetPorFotograma(){
    
        String nombreFichero = Principal.rutaGuardar + "\\DatosPorFotograma-" + Principal.nombreFichero + ".xlsx" ;
                   
        
        
        // Creamos el archivo donde almacenaremos la hoja
        // de calculo, recuerde usar la extension correcta,
        // en este caso .xlsx
        File archivo = new File(nombreFichero);
        
        

        // Creamos el libro de trabajo de Excel formato OOXML
        Workbook workbook = new XSSFWorkbook();

        // La hoja donde pondremos los datos
        Sheet pagina = workbook.createSheet("Resumen de las emociones del sujeto");



        String[] titulos = {"name", "second",
            "emotion principal", "all emotion"};
        //Integer[] datos = {Principal.angerContador, Principal.contemptContador, Principal.disgustContador, Principal.fearContador, Principal.happinessContador, 
          //  Principal.neutralContador, Principal.sadnessContador, Principal.surpriseContador, Principal.noAnalizadoContador, Principal.nFotosAnalizadas};

        // Creamos una fila en la hoja en la posicion 0
        Row filaCabezera = pagina.createRow(0);

        // Creamos el encabezado
        for (int i = 0; i < titulos.length; i++) {
            // Creamos una celda en esa fila, en la posicion 
            // indicada por el contador del ciclo
            Cell celda = filaCabezera.createCell(i);

            // Indicamos el estilo que deseamos 
            // usar en la celda, en este caso el unico 
            // que hemos creado
            //celda.setCellStyle(style);
            celda.setCellValue(titulos[i]);
        }


                
         //PARA RECOGER TODOS LOS ELEMENTOS DEL VECTOR O CONTENEDOR
        for( int i=0 ; i<Principal.contenedorFrames.size() ; i++ ){
            
                    // Ahora creamos una fila en la posicion 1
        Row fila = pagina.createRow(i+1);
        
                    // posicion indicada por el contador del ciclo
            Cell celda = fila.createCell(0);
            
            //IMPRESION DE ELEMENTOS
            
            //System.out.print("El archivo se llama: ");
            celda.setCellValue(Principal.contenedorFrames.get(i).getNombreFile()); 
            
                  // posicion indicada por el contador del ciclo
            Cell celda2 = fila.createCell(1);
            
            //System.out.print("pertenece al segundo: ");
            celda2.setCellValue(Principal.contenedorFrames.get(i).getTiempo()); 
            
            //PROCEDIMIENTO PARA IMPRIMIR CADENA EN LUGAR DEL NUMERO, mas bonito
            int clase = Principal.contenedorFrames.get(i).getClaseMayor();
            String claseCadena = claseEnteroACadena(clase);
            
                  // posicion indicada por el contador del ciclo
            Cell celda3 = fila.createCell(2);
           
            //System.out.print("y es de la clase (MAYORITARIA): ");
            celda3.setCellValue(claseCadena); 
            
          
            //IMPRESION DE TODAS LAS CLASES PERTENECIENTES
            ArrayList<Integer> clases = new ArrayList<>();
            clases = Principal.contenedorFrames.get(i).getClases();
            
            String clasesCadena = null;
            
            claseCadena = null;
            
            //System.out.print("Las clases a la que pertenece la foto son: ");
            
            for(int j=0; j<clases.size(); j++){
            
                clase = clases.get(j);
                
                claseCadena = claseEnteroACadena(clase);
                
                if(j==0){
                    
                    clasesCadena = claseCadena;
                    
                
                }else{
                
                    clasesCadena= clasesCadena + ", " + claseCadena;
                
                }
                
            }
            
             // posicion indicada por el contador del ciclo
            Cell celda4 = fila.createCell(3);
           
            //System.out.print("y es de la clase (MAYORITARIA): ");
            celda4.setCellValue(clasesCadena); 
            
             pagina.autoSizeColumn(i);
           // System.out.println("");
        }

        // Ahora guardaremos el archivo
        try {
            // Creamos el flujo de salida de datos,
            // apuntando al archivo donde queremos 
            // almacenar el libro de Excel
            FileOutputStream salida = new FileOutputStream(archivo);

            // Almacenamos el libro de 
            // Excel via ese 
            // flujo de datos
            workbook.write(salida);

            // Cerramos el libro para concluir operaciones
            workbook.close();

            LOGGER.log(Level.INFO, "Archivo creado existosamente en {0}", archivo.getAbsolutePath());

        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.SEVERE, "Error con la creacion del archivo");
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, "Error de entrada/salida");
        }

    
    }
    
    */


}
