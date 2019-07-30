package PaquetePrincipal;

//FUNCIONES PARA LA DESCOMPOSICION DE LOS VIDEOS

//Import necesarios

import PaquetePrincipal.Funciones;
import PaquetePrincipal.Principal;
import javax.imageio.ImageIO;

import java.io.File;

import java.awt.image.BufferedImage;

import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.MediaListenerAdapter;
import com.xuggle.mediatool.ToolFactory;
import com.xuggle.mediatool.event.IVideoPictureEvent;
import com.xuggle.xuggler.Global;
import java.awt.Desktop;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


//CLASE PRINCIPAL DE ESTE FICHERO
public class DecodeAndCaptureFrames extends MediaListenerAdapter{
     
    //NUMERO DE SEGUNDOS entre cada frame a capturar esta a 2
    public static final double SECONDS_BETWEEN_FRAMES = Principal.segundosEntreFrames;

    //NUMERO DE MICROSEGUNDOS entre cada frame, puesto que la libreria trabaja con este dato
    public static final long MICRO_SECONDS_BETWEEN_FRAMES = 
      (long)(Global.DEFAULT_PTS_PER_SECOND * SECONDS_BETWEEN_FRAMES);

    //TIEMPO AL FINAL DE ESCRIBIR CADA FRAME
    public static long mLastPtsWrite = Global.NO_PTS;

    //INDICE DE FLUJO, NECESARIOS PARA ANALIZAR UN VIDEO
    public static int mVideoStreamIndex = -1;
    
    //nuevo
    private boolean matarHilo = false;
  

    //FUNCION PARA FRAGMENTAR EL VIDEO EN FRAMES, es decir fotos
    //filename nombre de los ficheros de imagen a crear
    public DecodeAndCaptureFrames(String filename){

        //CREACION DEL OBJETO MEDIA, para que posteriormente se pueda trabajar con el video
        IMediaReader reader = ToolFactory.makeReader(filename);

        //CONVERSION de la imagen a un espacio de BGR
        reader.setBufferedImageTypeToGenerate(BufferedImage.TYPE_3BYTE_BGR);

        //SE DECLARA COMO OLLENTE
        reader.addListener(this);
        
       
        //AQUI LEE EL CONTENIDO DE LOS ARCHIVOS
        //AQUI ESTA A LA ESPERA DE LOS EVENTOS SUCESIDOS EN LA OTRA FUNCION (espera de eventos)
        while (reader.readPacket() == null){
            
            if(matarHilo==false){
                
                do {} while(false);
                     
            }else{
                
                return;
                
            }
            
            
        }
          
        
        

        //SE CIERRA EL OLLENTE
        //reader.close();
    }

    //FUNCION QUE A TRAVES DEL VIDEO GRABA TANTAS IMAGENES COMO SE DESEE
    public void onVideoPicture(IVideoPictureEvent event)
    {

        //TRY NECESARIO
        try
        {
           
            
            if(Principal.matarHilo==true){
                
                //matarHilo=true;
                
                setMatarHilo(true);
                
                return;
            }
            
            //para que no se siga ejecutando si el usuario quiere terminar
            if(getMatarHilo()==false){
                
                              //PARA EVITAR LLEGAR A 20 EN EL MINUTO
              if(Principal.veces >= 19 && Principal.versionPrueba == true){

                  System.out.println("PAUSA");
                  System.out.print("Fotos analizadas: ");
                  System.out.println(Principal.nFotosAnalizadas); 
                  
                  Principal.estaEnPausa = true;

                  if(Principal.versionPrueba == true){
                  funcionPausa(60000);
                  //try{
                  // Thread.sleep(60000);
                  //}catch(InterruptedException e ) { 
                  // }
                  }

                  Principal.estaEnPausa = false;
                  Principal.veces=0;
              }
                

            //SE COMPRUEBAN LOS EVENTOS CAPTURADOS
            if (event.getStreamIndex() != mVideoStreamIndex)
            {
                if (-1 == mVideoStreamIndex)
                  mVideoStreamIndex = event.getStreamIndex();

                else
                  return;
            }

            //SE COMPRUEBA EL TIEMPO PARA EL SIGUIENTE
            if (mLastPtsWrite == Global.NO_PTS)

              mLastPtsWrite = event.getTimeStamp() - MICRO_SECONDS_BETWEEN_FRAMES;

            //SE COMPRUEBA SI HAY TIEMPO PARA EL SIGUIENTE
            if (event.getTimeStamp() - mLastPtsWrite >= MICRO_SECONDS_BETWEEN_FRAMES)
            {  
              //Nombre del archivo Temporal a crear posteriormente  
              String savedFile = "fotograma";

              //Ruta para la creacion del fichero (Temporal)
              //nombreFichero, extension, directorioParaGuardar
             // File file = File.createTempFile(savedFile, ".png", new File("C:\\Users\\angel\\Desktop\\prueba"));
File file = File.createTempFile(savedFile, ".png", new File(Principal.rutaGuardar));

              //Creacion del fichero (Temporal)
              ImageIO.write(event.getImage(), "png", file);

              //Impresion por consola de los archivos creados a traves del video
              double seconds = ((double)event.getTimeStamp())
                / Global.DEFAULT_PTS_PER_SECOND;

              //System.out.printf("at elapsed time of %6.3f seconds wrote: %s\n", seconds, file);

              //IMPRESION FOTO TIEMPO, de lo que se ha guardando
              new Funciones().funcionImprimir(seconds,file);
              
           

    

              //SE CARGA EL ARCHIVO EN LA FUNCION FACE, para realizar el analisis
               System.out.println("-------------------go________________");
               
               
               
               System.out.println(file.getName());
               

               
     
              new Funciones().face(file,seconds);
              
              //Eliminar al acabar el programa, LOS ARCHIVOS TEMPORALES
              if(Principal.conservar == false){
                //file.deleteOnExit();
                file.delete();
                file.deleteOnExit();
                System.out.println("archivo eliminado del sistema");
              }

              //AUMENTA LA VARIABLE NUMERO DE VECES, para las versiuones de prueba de faceAPI
              Principal.veces++;
              
   
              
              //
              new Funciones().imprimir("principal--_>", "Mayoritario");
              
                new Funciones().imprimir("principal--_>", "General");
                



              //COMENTADO

              //ACTUALIZA LA ULTIMA ESCRITURA, para la lectura del video        
              mLastPtsWrite += MICRO_SECONDS_BETWEEN_FRAMES;

            }

          }

        }
        catch (Exception e)
        {
          e.printStackTrace();
        }
    }

  
    //Funcion para retrasar el tiempo del sistema
    //Parametro en microsegundos
    public void funcionPausa(int numero){

        try {
            Thread.sleep(numero);
        } catch (InterruptedException ex) {
            Logger.getLogger(DecodeAndCaptureFrames.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public boolean getMatarHilo(){
        
        
        return matarHilo;
        
    }
    
    public void setMatarHilo(boolean activar){
        
        matarHilo = activar;     
        
    }
    
    
    
}