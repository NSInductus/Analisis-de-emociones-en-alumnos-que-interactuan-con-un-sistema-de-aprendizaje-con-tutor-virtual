//PAQUETE NECESARIO
package PaqueteAnalisisVideo;

//IMPORT NECESARIOS
import PaqueteAnalisisVideo.Funciones;
import PaquetePostAnalisis.FuncionesResultados;
import PaquetePreAnalisis.Principal;

//CLASE HILOPROCESO PRINCIPAL (HILO)
public class HiloProcesoPrincipal extends Thread {
     
    //CONSTRUCTOR
    public HiloProcesoPrincipal(String nombre) {
        super(nombre);
    }

    @Override
    public void run(){

        Funciones aux = new Funciones(); 
        //VARIABLE PARA MEDIR EL TIEMPO
        long inicio = System.currentTimeMillis();

        System.out.print("umbralSentimiento: ");
        System.out.println(Principal.umbralSentimiento);

        System.out.print("segundosEntreFrames: ");
        System.out.println(Principal.segundosEntreFrames);

        System.out.print("rutaGuardar: ");
        System.out.println(Principal.rutaGuardar);

        System.out.print("conservar: ");
        System.out.println(Principal.conservar);
        
        System.out.print("-------------------------------");
        System.out.print("------COMIENZO DEL ANALISIS-----");
        System.out.print("-------------------------------");
        
        DecodeAndCaptureFrames decode = new DecodeAndCaptureFrames(Principal.videoFile);

        boolean comprobar = decode.getMatarHilo();

        //System.out.println("AQUIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        //System.out.println(comprobar);

        if(comprobar==false){

            //VARIABLE PARA MEDIR EL TIEMPO
            long fin = System.currentTimeMillis();

            //CALCULO DEL TIEMPO UTILIZANDO LAS VARIABLES ANTERIORES
            double tiempo = (double) ((fin - inicio)/1000);

            //IMPRESION FINAL DE LOS RESULTADOS DE LA CLASE MAYOR
            aux.imprimir ("FINALES", "Mayoritario");

            //IMPRESION FINAL DE LOS RESULTADOS GENERALES
            aux.imprimir ("FINALES", "Generales");

            //IMPRESION DE VARIABLES, de tiempo completo
            System.out.println("Esta proceso ha tardado:" + tiempo + " segundos");

            //PONER LA VENTANA VISIBLE
            // Principal.ventana_principal.setVisible(true);
            Principal.ventana_seguimiento.setVisible(false);

            Principal.ventana_final.setVisible(true);
            Principal.ventana_final.setResizable(false);

            //CHIVATOO
            //IMPRESION DE VARIABLES, de tiempo completo
            // System.out.println("JAJAJAJJAJAJAJAJAJAJJAJAJAJ");
            // System.out.println(Principal.nombreFichero);

            if(Principal.conservar == true){

                new FuncionesResultados().crearDatasetPorFotograma();

            }
        }
    }
}