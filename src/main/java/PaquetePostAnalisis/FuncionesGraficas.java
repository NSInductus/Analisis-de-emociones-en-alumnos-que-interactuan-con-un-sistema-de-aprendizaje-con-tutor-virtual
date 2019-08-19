//PAQUETE NECESARIO
package PaquetePostAnalisis;

//IMPORT NECESARIOS
import PaqueteAnalisisVideo.Funciones;
import PaquetePreAnalisis.Principal;
import java.awt.BasicStroke;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Angel Murcia Diaz
 */

//CLASE FUNCIONESGRAFICAS
public class FuncionesGraficas {

    //FUNCION HACER GRAFICA TIPO PASTEL
    public void hacerGraficaFinalPastel(){
        
        //DECLARACION DEL GRAFICO
        JFreeChart grafico = null;
        //DECLARACION DEL DEFAULT CATEGORY DATASET
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
        //PARA PASAR POR TODO EL CONTENEDOR
        for( int i=0 ; i<Principal.contenedorFrames.size() ; i++ ){
            
            //CLASE DE CADA UNO DE LOS MIEMBROS DEL CONTENEDOR
            int clase = Principal.contenedorFrames.get(i).getClaseMayor();
            
            //
            double tiempo = Principal.contenedorFrames.get(i).getTiempo();
            
            String tempo = Double.toString(tiempo);
      
            datos.addValue( clase , "Sujeto" , tempo);//Principal.contenedorFrames.get(i).getTiempo() );
        
        }
        
        String tipoGrafica = "Pastel";
        if(tipoGrafica.equals("Barras")){
            grafico = ChartFactory.createBarChart("Grafica Prueba", "Eje X", "Eje Y",datos ,PlotOrientation.VERTICAL, true, true, false);
        }
        if(tipoGrafica.equals("Lineal")){
            grafico = ChartFactory.createLineChart("Grafica del análisis de emociones", "Segundo del fotograma", "Tipo de emocion",datos ,PlotOrientation.VERTICAL, true, true, false);
        }
        if(tipoGrafica.equals("Pastel")){
            DefaultPieDataset datosPie = new DefaultPieDataset();
           datosPie.setValue("anger", Principal.angerContador);
           datosPie.setValue("contempt", Principal.contemptContador);
           datosPie.setValue("disgust", Principal.disgustContador);
           datosPie.setValue("fear", Principal.fearContador);  
           datosPie.setValue("happiness", Principal.happinessContador);
           datosPie.setValue("neutral", Principal.neutralContador);
           datosPie.setValue("sadness", Principal.sadnessContador); 
           datosPie.setValue("neutral", Principal.neutralContador);
           datosPie.setValue("surprise", Principal.surpriseContador); 
           
           datosPie.setValue("no analizadas", Principal.noAnalizadoContador); 
           
            grafico = ChartFactory.createPieChart("Grafico Pastel con la pertenencia de los fotogramas a las clases", datosPie, true, true, false);
        }
        
        ChartPanel cPanel = new ChartPanel(grafico);
        JFrame informacion = new JFrame("Grafica");
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        
        informacion.setVisible(true);
        
 
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaPastel.png"), grafico, 800, 800);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    
    public void hacerGraficaFinalBarras(){
        
        
        JFreeChart grafico = null;
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
        datos.addValue( Principal.angerContador, "anger", "Grafica");
        datos.addValue( Principal.contemptContador, "contempt", "Grafica");
        datos.addValue( Principal.disgustContador, "disgrust", "Grafica");
        datos.addValue( Principal.fearContador, "fear", "Grafica");         
        datos.addValue( Principal.happinessContador, "happiness", "Grafica");
        datos.addValue( Principal.neutralContador, "neutral", "Grafica"); 
        datos.addValue( Principal.sadnessContador, "sadness", "Grafica");
        datos.addValue( Principal.surpriseContador, "surprise", "Grafica");     
        datos.addValue( Principal.noAnalizadoContador, "NO analizados", "Grafica");

        String tipoGrafica = "Barras";
        if(tipoGrafica.equals("Barras")){
            grafico = ChartFactory.createBarChart("Grafica del análisis de emociones", "Segundo del fotograma", "Tipo de emocion",datos ,PlotOrientation.VERTICAL, true, true, false);
        }
        if(tipoGrafica.equals("Lineal")){
            grafico = ChartFactory.createLineChart("Grafica del análisis de emociones", "Segundo del fotograma", "Tipo de emocion",datos ,PlotOrientation.VERTICAL, true, true, false);
        }
    
        ChartPanel cPanel = new ChartPanel(grafico);
        JFrame informacion = new JFrame("Grafica");
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        
        informacion.setVisible(true);
        
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaBarras.png"), grafico, 800, 800);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    
    //INTENTO DE FUNCION UNICA PARA SACAR TODAS LAS GRAFICAS
    public void hacerGraficaEmocionTiempoGenerica(int tipo){
        
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico = null;
        //crear un archivador de datos para nuestro GRAFICO
        //DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
        XYSeries unDato = new XYSeries("XDDeito");
          
        XYSeriesCollection datos = new XYSeriesCollection();
  
        //DECLARACION DE LA CLASE FUNCIONES PARA UTILIZARLA COMO AUXILIAR
        Funciones funAux = new Funciones();
       
        //RECORRER TODOS LOS FRAMES almacenados en el vector
        for( int i=0 ; i<Principal.contenedorFrames.size() ; i++ ){
        
            //CREACION ARRAY AUXILIAR para introducir el de cada FRAME
            ArrayList<Integer> clases = new ArrayList<>();
            //INTRODUCIR EL DE CADA FRAME
            clases = Principal.contenedorFrames.get(i).getClases();
            
            //PARA EL TIEMPO
            //INTRODUCION DEL TIEMPO DEL FRAME NE VARIABLE AUXILIAR
            double tiempo = Principal.contenedorFrames.get(i).getTiempo();

            //PASO A ENTERO
            int tiempoEntero = (int) tiempo;
            
            //PASO A STRING
            String tempo = Integer.toString(tiempoEntero);
            
            //CLASE AUXILIAR
            int clase;
           
            //VARIABLE AUXILIAR PARA ACTIVAR O DESACTIVAR dependiendo si se encuentra la clase buscada o no
            boolean esta = false;
            
            //RECORRER TODO EL VECTOR DE CLASES
            for(int j=0; j<clases.size(); j++){
            
                //INTRODUCION DE LA CLASE EN LA variable auxiliar
                clase = clases.get(j);
    
                //COMPROBACION DE LA CLASE DESEADA
                if(clase == tipo){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                unDato.add(tiempoEntero, 1.0);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                unDato.add(tiempoEntero, 0.0);
                    
            }
        }
        
        
        datos.addSeries(unDato);
     
        
        grafico = ChartFactory.createXYLineChart("Grafica de la emocion " + funAux.claseEnteroACadena(tipo), "Segundos transcurridos", funAux.claseEnteroACadena(tipo), datos, PlotOrientation.VERTICAL, false, true, false);
        
        
        XYPlot plot = grafico.getXYPlot();
        
        XYLineAndShapeRenderer rendered = new XYLineAndShapeRenderer();
        

        switch(tipo) {
            case 0:
              rendered.setSeriesPaint(0, Color.RED);
              break;
            case 1:
              rendered.setSeriesPaint(0, Color.MAGENTA);
              break;
            case 2:
              rendered.setSeriesPaint(0, Color.GREEN);
              break;
            case 3:
              rendered.setSeriesPaint(0, Color.BLACK);
              break;
            case 4:
              rendered.setSeriesPaint(0, Color.YELLOW);
              break;
            case 5:
              rendered.setSeriesPaint(0, Color.CYAN);
              break;
            case 6:
              rendered.setSeriesPaint(0, Color.BLUE);
              break;
            case 7:
              rendered.setSeriesPaint(0, Color.ORANGE);
              break;
            case 8:
              rendered.setSeriesPaint(0, Color.DARK_GRAY);
              break;
            default:
              rendered.setSeriesPaint(0, Color.DARK_GRAY);
        }
        
        rendered.setSeriesStroke(0, new BasicStroke(0.6f));
        
         rendered.setSeriesShapesVisible(0, false);
  
        
        
        plot.setRenderer(rendered);
        
     
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel = new ChartPanel(grafico);
        //NOMBRE DE PANEL
        JFrame informacion = new JFrame("Grafica de la emocion" + funAux.claseEnteroACadena(tipo));
        //INTRODUCIR NOMBRE
        informacion.getContentPane().add(cPanel);
        informacion.pack();
      
        //PONER VISIBLE EL PANEL
        informacion.setVisible(true);

    }
    
    
}
