/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaquetePrincipal;

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
 * @author angel
 */
public class FuncionesGraficas {
    
    
    
        void hacerGraficaMayor(){
        
        JFreeChart grafico = null;
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
      //  int dato;
        
        
      //  datos.addValue(dato,"Grafica 1","Uno");

      
        
        for( int i=0 ; i<Principal.contenedorFrames.size() ; i++ ){
            
            int clase = Principal.contenedorFrames.get(i).getClaseMayor();
            
            double tiempo = Principal.contenedorFrames.get(i).getTiempo();
            
            String tempo = Double.toString(tiempo);
      
            datos.addValue( clase , "Sujeto" , tempo);//Principal.contenedorFrames.get(i).getTiempo() );
        
        }
        
        String tipoGrafica = "Lineal";
        if(tipoGrafica.equals("Barras")){
            grafico = ChartFactory.createBarChart("Grafica Prueba", "Eje X", "Eje Y",datos ,PlotOrientation.VERTICAL, true, true, false);
        }
        if(tipoGrafica.equals("Lineal")){
            grafico = ChartFactory.createLineChart("Grafica del análisis de emociones", "Tipo de emocion", "Segundo del fotograma",datos ,PlotOrientation.VERTICAL, true, true, false);
        }
        if(tipoGrafica.equals("Pastel")){
            DefaultPieDataset datosPie = new DefaultPieDataset();
           // datosPie.setValue("Uno", dato1);
           // datosPie.setValue("Dos", dato2);
           // datosPie.setValue("Tres", dato3);
           // datosPie.setValue("Cuatro", dato4);        
            grafico = ChartFactory.createPieChart("Grafica Prueba", datosPie, true, true, false);
        }
        
        ChartPanel cPanel = new ChartPanel(grafico);
        JFrame informacion = new JFrame("Grafica");
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        
        informacion.setVisible(true);
        
 
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\Grafica.png"), grafico, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    
        void hacerGraficaSoloAnalizadasMayor(){
        
        JFreeChart grafico = null;
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
      //  int dato;
        
        
      //  datos.addValue(dato,"Grafica 1","Uno");

      
        
        for( int i=0 ; i<Principal.contenedorFrames.size() ; i++ ){
            
            int clase = Principal.contenedorFrames.get(i).getClaseMayor();
            
            double tiempo = Principal.contenedorFrames.get(i).getTiempo();
            
            String tempo = Double.toString(tiempo);
            
            if(clase!=8){
      
            datos.addValue( clase , "Sujeto" , tempo);//Principal.contenedorFrames.get(i).getTiempo() );
            }
        
        }
        
        String tipoGrafica = "Lineal";
        if(tipoGrafica.equals("Barras")){
            grafico = ChartFactory.createBarChart("Grafica Prueba", "Eje X", "Eje Y",datos ,PlotOrientation.VERTICAL, true, true, false);
        }
        if(tipoGrafica.equals("Lineal")){
            grafico = ChartFactory.createLineChart("Grafica del análisis de emociones", "Tipo de emocion", "Segundo del fotograma",datos ,PlotOrientation.VERTICAL, true, true, false);
        }
        if(tipoGrafica.equals("Pastel")){
            DefaultPieDataset datosPie = new DefaultPieDataset();
           // datosPie.setValue("Uno", dato1);
           // datosPie.setValue("Dos", dato2);
           // datosPie.setValue("Tres", dato3);
           // datosPie.setValue("Cuatro", dato4);        
            grafico = ChartFactory.createPieChart("Grafica Prueba", datosPie, true, true, false);
        }
        
        ChartPanel cPanel = new ChartPanel(grafico);
        JFrame informacion = new JFrame("Grafica");
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        
        informacion.setVisible(true);
        
 
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\Grafica.png"), grafico, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    
    
    void hacerGrafica2Mayor(){
        
        JFreeChart grafico = null;
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
      //  int dato;
        
        
      //  datos.addValue(dato,"Grafica 1","Uno");

      
        
        for( int i=0 ; i<Principal.contenedorFrames.size() ; i++ ){
            
            int clase = Principal.contenedorFrames.get(i).getClaseMayor();
            
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
    
        void hacerGrafica3(){
        
        
        JFreeChart grafico = null;
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
      //  int dato;
        
        
      //  datos.addValue(dato,"Grafica 1","Uno");

                  //DefaultPieDataset datosPie = new DefaultPieDataset();
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
    
        
    
    
    
    /////////////////////////////////////////////////
    
    //FUNCION PARA CREAR LA GRAFICA DEL SENTIMIENTO: NEUTRAL
    void hacerGraficaNeutralTotal(){
        
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico = null;
        //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
          
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
                if(clase == 5){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1.0 , "Sujeto" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0.0 , "Sujeto" , tempo);   
                    
            }
        }
        
        //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico = ChartFactory.createLineChart("Grafica de la emocion Neutral", "Segundo del fotograma", "Neutral",datos ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel = new ChartPanel(grafico);
        //NOMBRE DE PANEL
        JFrame informacion = new JFrame("Grafica");
        //INTRODUCIR NOMBRE
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        
        //PONER VISIBLE EL PANEL
        informacion.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaNeutral.png"), grafico, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    //FUNCION PARA CREAR LA GRAFICA DEL SENTIMIENTO: NEUTRAL
    void hacerGraficaNeutralTotalDividida(){
        
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico = null;
        
                
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico2 = null;
        
        //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
        
               //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos2 = new DefaultCategoryDataset();
        
        int tamano = Principal.contenedorFrames.size();
        
        int tope = tamano /2;
          
        //RECORRER TODOS LOS FRAMES almacenados en el vector
        for( int i=0 ; i<tope ; i++ ){
        
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
                if(clase == 5){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1.0 , "Sujeto" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0.0 , "Sujeto" , tempo);   
                    
            }
        }
        
        //RECORRER TODOS LOS FRAMES almacenados en el vector
        for( int i=tope ; i<tamano ; i++ ){
        
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
                if(clase == 5){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos2.addValue( 1.0 , "Sujeto" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos2.addValue( 0.0 , "Sujeto" , tempo);   
                    
            }
        }
        
        
        
        //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico = ChartFactory.createLineChart("Grafica de la emocion Neutral", "Segundo del fotograma", "Neutral",datos ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel = new ChartPanel(grafico);
        //NOMBRE DE PANEL
        JFrame informacion = new JFrame("Grafica");
        //INTRODUCIR NOMBRE
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        
        //PONER VISIBLE EL PANEL
        informacion.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaNeutralR.png"), grafico, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico2 = ChartFactory.createLineChart("Grafica de la emocion Neutral", "Segundo del fotograma", "Neutral",datos2 ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel2 = new ChartPanel(grafico2);
        //NOMBRE DE PANEL
        JFrame informacion2 = new JFrame("Grafica2");
        //INTRODUCIR NOMBRE
        informacion2.getContentPane().add(cPanel2);
        informacion2.pack();
        
        //PONER VISIBLE EL PANEL
        informacion2.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaNeutralR2.png"), grafico2, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
        
    //FUNCION PARA CREAR LA GRAFICA DEL SENTIMIENTO: NEUTRAL
    void hacerGraficaSadnessTotal(){
        
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico = null;
        //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
          
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
                if(clase == 6){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1 , "Sujeto" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0 , "Sujeto" , tempo);   
                    
            }
        }
        
        //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico = ChartFactory.createLineChart("Grafica de la emocion Sadness", "Segundo del fotograma", "Sadness",datos ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel = new ChartPanel(grafico);
        //NOMBRE DE PANEL
        JFrame informacion = new JFrame("Grafica");
        //INTRODUCIR NOMBRE
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        
        //PONER VISIBLE EL PANEL
        informacion.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaSadness.png"), grafico, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
        //FUNCION PARA CREAR LA GRAFICA DEL SENTIMIENTO: NEUTRAL
    void hacerGraficaSadnessTotalDividida(){
        
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico = null;
        
                
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico2 = null;
        
        //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
        
               //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos2 = new DefaultCategoryDataset();
        
        int tamano = Principal.contenedorFrames.size();
        
        int tope = tamano /2;
          
        //RECORRER TODOS LOS FRAMES almacenados en el vector
        for( int i=0 ; i<tope ; i++ ){
        
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
                if(clase == 6){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1.0 , "Sujeto" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0.0 , "Sujeto" , tempo);   
                    
            }
        }
        
        //RECORRER TODOS LOS FRAMES almacenados en el vector
        for( int i=tope ; i<tamano ; i++ ){
        
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
                if(clase == 6){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos2.addValue( 1.0 , "Sujeto" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos2.addValue( 0.0 , "Sujeto" , tempo);   
                    
            }
        }
        
        
        
        //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico = ChartFactory.createLineChart("Grafica de la emocion Sadness", "Segundo del fotograma", "Neutral",datos ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel = new ChartPanel(grafico);
        //NOMBRE DE PANEL
        JFrame informacion = new JFrame("Grafica");
        //INTRODUCIR NOMBRE
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        
        //PONER VISIBLE EL PANEL
        informacion.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaSadnessR.png"), grafico, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico2 = ChartFactory.createLineChart("Grafica de la emocion Sadness", "Segundo del fotograma", "Sadness",datos2 ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel2 = new ChartPanel(grafico2);
        //NOMBRE DE PANEL
        JFrame informacion2 = new JFrame("Grafica2");
        //INTRODUCIR NOMBRE
        informacion2.getContentPane().add(cPanel2);
        informacion2.pack();
        
        //PONER VISIBLE EL PANEL
        informacion2.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaSadnessR2.png"), grafico2, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
        //FUNCION PARA CREAR LA GRAFICA DEL SENTIMIENTO: NEUTRAL
    void hacerGraficaSadnessTotalDividida4(){
        
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico = null;
        
                
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico2 = null;
        
        
                //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico3 = null;
        
        
        
                //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico4 = null;
        
        //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
        
               //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos2 = new DefaultCategoryDataset();
        
                //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos3 = new DefaultCategoryDataset();
        
        
               //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos4 = new DefaultCategoryDataset();
        
        int tamano = Principal.contenedorFrames.size();
        
        int tope = tamano /4;
          
        //RECORRER TODOS LOS FRAMES almacenados en el vector
        for( int i=0 ; i<tope ; i++ ){
        
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
                if(clase == 6){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1.0 , "Sujeto" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0.0 , "Sujeto" , tempo);   
                    
            }
        }
        
        //RECORRER TODOS LOS FRAMES almacenados en el vector
        for( int i=tope ; i<tope*2 ; i++ ){
        
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
                if(clase == 6){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos2.addValue( 1.0 , "Sujeto" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos2.addValue( 0.0 , "Sujeto" , tempo);   
                    
            }
        }
        
        
                //RECORRER TODOS LOS FRAMES almacenados en el vector
        for( int i=tope*2 ; i<tope*3 ; i++ ){
        
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
                if(clase == 6){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos3.addValue( 1.0 , "Sujeto" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos3.addValue( 0.0 , "Sujeto" , tempo);   
                    
            }
        }
        
                //RECORRER TODOS LOS FRAMES almacenados en el vector
        for( int i=tope*3 ; i<tamano ; i++ ){
        
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
                if(clase == 6){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos4.addValue( 1.0 , "Sujeto" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos4.addValue( 0.0 , "Sujeto" , tempo);   
                    
            }
        }
        
        
        
        
        
        //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico = ChartFactory.createLineChart("Grafica de la emocion Sadness", "Segundo del fotograma", "Neutral",datos ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel = new ChartPanel(grafico);
        //NOMBRE DE PANEL
        JFrame informacion = new JFrame("Grafica");
        //INTRODUCIR NOMBRE
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        
        //PONER VISIBLE EL PANEL
        informacion.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaSadnessR.png"), grafico, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico2 = ChartFactory.createLineChart("Grafica de la emocion Sadness", "Segundo del fotograma", "Sadness",datos2 ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel2 = new ChartPanel(grafico2);
        //NOMBRE DE PANEL
        JFrame informacion2 = new JFrame("Grafica2");
        //INTRODUCIR NOMBRE
        informacion2.getContentPane().add(cPanel2);
        informacion2.pack();
        
        //PONER VISIBLE EL PANEL
        informacion2.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaSadnessRuu2.png"), grafico2, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico3 = ChartFactory.createLineChart("Grafica de la emocion Sadness", "Segundo del fotograma", "Sadness",datos3 ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel3 = new ChartPanel(grafico3);
        //NOMBRE DE PANEL
        JFrame informacion3 = new JFrame("Grafica3");
        //INTRODUCIR NOMBRE
        informacion3.getContentPane().add(cPanel3);
        informacion3.pack();
        
        //PONER VISIBLE EL PANEL
        informacion3.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaSadnessRuu3.png"), grafico3, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
                //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico4 = ChartFactory.createLineChart("Grafica de la emocion Sadness", "Segundo del fotograma", "Sadness",datos4 ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel4 = new ChartPanel(grafico4);
        //NOMBRE DE PANEL
        JFrame informacion4 = new JFrame("Grafica4");
        //INTRODUCIR NOMBRE
        informacion4.getContentPane().add(cPanel4);
        informacion4.pack();
        
        //PONER VISIBLE EL PANEL
        informacion4.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaSadnessRuu4.png"), grafico4, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    //FUNCION PARA CREAR LA GRAFICA DEL SENTIMIENTO: NEUTRAL
    void hacerGraficaAngerTotal(){
        
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico = null;
        //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
          
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
                if(clase == 0){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1 , "Sujeto" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0 , "Sujeto" , tempo);   
                    
            }
        }
        
        //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico = ChartFactory.createLineChart("Grafica de la emocion Anger", "Segundo del fotograma", "Anger",datos ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel = new ChartPanel(grafico);
        //NOMBRE DE PANEL
        JFrame informacion = new JFrame("Grafica");
        //INTRODUCIR NOMBRE
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        
        //PONER VISIBLE EL PANEL
        informacion.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaAnger.png"), grafico, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    //FUNCION PARA CREAR LA GRAFICA DEL SENTIMIENTO: NEUTRAL
    void hacerGraficaContemptTotal(){
        
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico = null;
        //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
          
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
                if(clase == 1){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1 , "Sujeto" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0 , "Sujeto" , tempo);   
                    
            }
        }
        
        //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico = ChartFactory.createLineChart("Grafica de la emocion Contempt", "Segundo del fotograma", "Contempt",datos ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel = new ChartPanel(grafico);
        //NOMBRE DE PANEL
        JFrame informacion = new JFrame("Grafica");
        //INTRODUCIR NOMBRE
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        
        //PONER VISIBLE EL PANEL
        informacion.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaContempt.png"), grafico, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
    
    //FUNCION PARA CREAR LA GRAFICA DEL SENTIMIENTO: NEUTRAL
    void hacerGraficaDisgustTotal(){
        
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico = null;
        //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
          
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
                if(clase == 2){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1 , "Sujeto" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0 , "Sujeto" , tempo);   
                    
            }
        }
        
        //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico = ChartFactory.createLineChart("Grafica de la emocion Disgust", "Segundo del fotograma", "Disgust",datos ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel = new ChartPanel(grafico);
        //NOMBRE DE PANEL
        JFrame informacion = new JFrame("Grafica");
        //INTRODUCIR NOMBRE
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        
        //PONER VISIBLE EL PANEL
        informacion.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaDisgust.png"), grafico, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //FUNCION PARA CREAR LA GRAFICA DEL SENTIMIENTO: NEUTRAL
    void hacerGraficaFearTotal(){
        
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico = null;
        //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
          
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
                if(clase == 3){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1 , "Sujeto" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0 , "Sujeto" , tempo);   
                    
            }
        }
        
        //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico = ChartFactory.createLineChart("Grafica de la emocion Fear", "Segundo del fotograma", "Fear",datos ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel = new ChartPanel(grafico);
        //NOMBRE DE PANEL
        JFrame informacion = new JFrame("Grafica");
        //INTRODUCIR NOMBRE
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        
        //PONER VISIBLE EL PANEL
        informacion.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaFear.png"), grafico, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
       //FUNCION PARA CREAR LA GRAFICA DEL SENTIMIENTO: NEUTRAL
    void hacerGraficaHappinessTotal(){
        
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico = null;
        //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
          
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
                if(clase == 4){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1 , "Sujeto" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0 , "Sujeto" , tempo);   
                    
            }
        }
        
        //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico = ChartFactory.createLineChart("Grafica de la emocion Happiness", "Segundo del fotograma", "Happiness",datos ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel = new ChartPanel(grafico);
        //NOMBRE DE PANEL
        JFrame informacion = new JFrame("Grafica");
        //INTRODUCIR NOMBRE
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        
        //PONER VISIBLE EL PANEL
        informacion.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaHappiness.png"), grafico, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
       //FUNCION PARA CREAR LA GRAFICA DEL SENTIMIENTO: NEUTRAL
    void hacerGraficaSurpriseTotal(){
        
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico = null;
        //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
          
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
                if(clase == 7){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1 , "Sujeto" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0 , "Sujeto" , tempo);   
                    
            }
        }
        
        //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico = ChartFactory.createLineChart("Grafica de la emocion Surprise", "Segundo del fotograma", "Surprise",datos ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel = new ChartPanel(grafico);
        //NOMBRE DE PANEL
        JFrame informacion = new JFrame("Grafica");
        //INTRODUCIR NOMBRE
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        
        //PONER VISIBLE EL PANEL
        informacion.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaSurprise.png"), grafico, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
       //FUNCION PARA CREAR LA GRAFICA DEL SENTIMIENTO: NEUTRAL
    void hacerGraficaNoAnalizadoTotal(){
        
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico = null;
        //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
          
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
                if(clase == 8){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1 , "Sujeto" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0 , "Sujeto" , tempo);   
                    
            }
        }
        
        //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico = ChartFactory.createLineChart("Grafica de la emocion No analizado", "Segundo del fotograma", "No analizado",datos ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel = new ChartPanel(grafico);
        //NOMBRE DE PANEL
        JFrame informacion = new JFrame("Grafica");
        //INTRODUCIR NOMBRE
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        
        //PONER VISIBLE EL PANEL
        informacion.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaNoAnalizado.png"), grafico, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
    
    //FUNCION PARA CREAR LA GRAFICA DEL SENTIMIENTO: NEUTRAL
    void hacerGraficaTotal(){
        
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico = null;
        //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
          
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
                if(clase == 0){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1 , "Anger" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0 , "Anger" , tempo);   
                    
            }
        }
        
        
        
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
                if(clase == 1){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1 , "Contempt" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0 , "Contempt" , tempo);   
                    
            }
        }
        
        
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
                if(clase == 2){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1 , "Disgust" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0 , "Disgust" , tempo);   
                    
            }
        }
        
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
                if(clase == 3){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1 , "Fear" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0 , "Fear" , tempo);   
                    
            }
        }
        
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
                if(clase == 4){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1 , "Happiness" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0 , "Happiness" , tempo);   
                    
            }
        }
        
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
                if(clase == 6){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1 , "Sadness" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0 , "Sadness" , tempo);   
                    
            }
        }
        
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
                if(clase == 7){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1 , "Surprise" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0 , "Surprise" , tempo);   
                    
            }
        }
        
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
                if(clase == 8){    
                    
                    //PONER BOOLEANO COPMO VERDADERO
                    esta = true;
                                                      
                }
            
            }
            
            //SI EL BOOLEANO ESTA EN VERDADERO
            if(esta == true){    
                  
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                datos.addValue( 1 , "No Analizado" , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0 , "No Analizado" , tempo);   
                    
            }
        }
        
        
        //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico = ChartFactory.createLineChart("Grafica total", "Segundo del fotograma", "TOTAL",datos ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel = new ChartPanel(grafico);
        //NOMBRE DE PANEL
        JFrame informacion = new JFrame("Grafica");
        //INTRODUCIR NOMBRE
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        
        //PONER VISIBLE EL PANEL
        informacion.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\GraficaNoAnalizado.png"), grafico, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    ///////////////////////////////////////////
    
    
    //INTENTO DE FUNCION UNICA PARA SACAR TODAS LAS GRAFICAS
    void hacerGraficaTotalGenerica(int tipo){
        
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico = null;
        //crear un archivador de datos para nuestro GRAFICO
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
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
                datos.addValue( 1.0 , funAux.claseEnteroACadena(tipo) , tempo);
                                             
            }else{
                
                //INTRODUCION DE DATOS DE GRAFICA en el archivador de datos
                //con el valor a o, ES DECIR NO EXISTE ESA EMOCION EN ESE FRAME
                datos.addValue( 0.0 , funAux.claseEnteroACadena(tipo) , tempo);   
                    
            }
        }
        
        //CREACION DEL GRAFICO USANDO EL ARCHIVADOR DE DATOS
        grafico = ChartFactory.createLineChart("Grafica de la emocion" + funAux.claseEnteroACadena(tipo), "Segundos transcurridos", funAux.claseEnteroACadena(tipo),datos ,PlotOrientation.VERTICAL, true, true, false);
        
        //CREACION DEL PANEL PARA MOSTRRAR (VENTANA)
        ChartPanel cPanel = new ChartPanel(grafico);
        //NOMBRE DE PANEL
        JFrame informacion = new JFrame("Grafica de la emocion" + funAux.claseEnteroACadena(tipo));
        //INTRODUCIR NOMBRE
        informacion.getContentPane().add(cPanel);
        informacion.pack();
   
        
        //PONER VISIBLE EL PANEL
        informacion.setVisible(true);
        
        //GRABARLA COMO PNG PARA CONSERVARLA
        try {
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\angel\\Desktop\\prueba\\NEWGrafica" + funAux.claseEnteroACadena(tipo) +".png"), grafico, 2000, 1000);
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
     
    
    //INTENTO DE FUNCION UNICA PARA SACAR TODAS LAS GRAFICAS
    void hacerGraficaTotalGenerica2(int tipo){
        
        //CRECION DE JFreeChart objeto para las graficas
        JFreeChart grafico = null;
        //crear un archivador de datos para nuestro GRAFICO
      //  DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
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
        
      /*  ChartPanel panelito = new ChartPanel(grafico);
        
        JFrame ventanita44 = new JFrame("grafiquita");
        
       
        
        ventanita44.setSize(500,500);
        
       // ventanita44.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ventanita44.add(panelito);
        
        
         ventanita44.setVisible(true);*/
      
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
