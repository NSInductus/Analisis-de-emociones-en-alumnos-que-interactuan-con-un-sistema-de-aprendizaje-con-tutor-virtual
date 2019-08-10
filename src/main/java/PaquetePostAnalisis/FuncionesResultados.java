/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaquetePostAnalisis;

import PaqueteAnalisisVideo.Funciones;
import PaquetePreAnalisis.Principal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author angel
 */
public class FuncionesResultados {
    
    
    Funciones aux = new Funciones();
    
    
    public void crearResultadosPorcentajes(){


    //total util
    double totalUtil = Principal.nFotosAnalizadas - Principal.noAnalizadoContador;
    
    //evitar indeterminaciones
    if(totalUtil!=0){

    //evitar una indeterminacion
    if(Principal.angerContador != 0){
       
        //CONTADOR anger
        Principal.angerContadorPorcentaje = (Principal.angerContador * 100.0) / totalUtil;  
    
    }else{
        
        Principal.angerContadorPorcentaje = 0;
        
    }
    
    //evitar una indeterminacion
    if(Principal.contemptContador != 0){
       
        //CONTADOR anger
        Principal.contemptContadorPorcentaje = (Principal.contemptContador * 100.0) / totalUtil;  
    
    }else{
        
        Principal.contemptContadorPorcentaje = 0;
        
    }
        
    
    //evitar una indeterminacion
    if(Principal.disgustContador != 0){
       
        //CONTADOR anger
        Principal.disgustContadorPorcentaje = (Principal.disgustContador * 100.0) / totalUtil;  
    
    }else{
        
        Principal.disgustContadorPorcentaje = 0;
        
    }
       
      
    //evitar una indeterminacion
    if(Principal.fearContador != 0){
       
        //CONTADOR anger
        Principal.fearContadorPorcentaje = (Principal.fearContador * 100.0) / totalUtil;  
    
    }else{
        
        Principal.fearContadorPorcentaje = 0;
        
    }
    
    //evitar una indeterminacion
    if(Principal.happinessContador != 0){
       
        //CONTADOR anger
        Principal.happinessContadorPorcentaje = (Principal.happinessContador *100.0) / totalUtil;  
    
    }else{
        
        Principal.happinessContadorPorcentaje = 0;
        
    }
          
    //evitar una indeterminacion
    if(Principal.neutralContador != 0){
       
        //CONTADOR anger
        Principal.neutralContadorPorcentaje = (Principal.neutralContador * 100.0) / totalUtil;  
        System.out.println("llego");
    
    }else{
        
        Principal.neutralContadorPorcentaje = 0;
        
    }

    //evitar una indeterminacion
    if(Principal.sadnessContador != 0){
       
        //CONTADOR anger
        Principal.sadnessContadorPorcentaje = (Principal.sadnessContador * 100.0) / totalUtil;  
    
    }else{
        
        Principal.sadnessContadorPorcentaje = 0;
       
    }
    
    //evitar una indeterminacion
    if(Principal.surpriseContador != 0){
       
        //CONTADOR anger
        Principal.surpriseContadorPorcentaje = (Principal.surpriseContador * 100.0) / totalUtil;  
    
    }else{
        
        Principal.surpriseContadorPorcentaje = 0;
        
    }
    
    }else{
        
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
        
        
        
    }
       

    }
    
   
    
    
    public void resultadosTXT(int formato) throws IOException{
            
            System.out.println(Principal.nombreFichero);
            
            String ruta = null;
            
           
            if(formato==1){
            
             ruta = Principal.rutaGuardar + "\\" + Principal.nombreFichero + ".txt" ;
            
            }else if (formato==2){
                
             ruta = Principal.rutaGuardar + "\\" + Principal.nombreFichero + "Porcentajes.txt" ;
                
            }
            
            
            //String ruta = "C:\\Users\\angel\\Desktop\\prueba\\resultados.txt";

            
            FileWriter fichero = null;
            PrintWriter pw = null;
        
        try
        {
        	fichero = new FileWriter(ruta);
           	pw = new PrintWriter(fichero);
                
                if(formato==1){
                  

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
                
                
                }else if(formato==2){
            
                    
                pw.println("------------------------RESUMEN EN FICHERO EN PORCENTAJE-------------------------");   
                pw.println("--------------------------------------------------------"); 

                pw.println("Porcentaje anger:");
                pw.println(Principal.angerContadorPorcentaje);

                pw.println("Porcentaje contempt: ");
                pw.println(Principal.contemptContadorPorcentaje);

                pw.println("Porcentaje disgust: ");
                pw.println(Principal.disgustContadorPorcentaje);

                pw.println("Porcentaje fear: ");
                pw.println(Principal.fearContadorPorcentaje);

                pw.println("Porcentaje happiness: ");
                pw.println(Principal.happinessContadorPorcentaje);

                pw.println("Porcentaje neutral: ");
                pw.println(Principal.neutralContadorPorcentaje);

                pw.println("Porcentaje sadness: ");
                pw.println(Principal.sadnessContadorPorcentaje);

                pw.println("Porcentaje surprise: ");
                pw.println(Principal.surpriseContadorPorcentaje);

                pw.println("Fotos útiles: ");
                pw.println(Principal.nFotosAnalizadas-Principal.noAnalizadoContador);

            
            
                }

                    
                
 
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
        
       //nuevo 
    public void crearDataset(int formato){
        
        String nombreFichero = null;
        
        if(formato==1){
    
            nombreFichero = Principal.rutaGuardar + "\\" + Principal.nombreFichero + ".xlsx" ;
       
        }else if(formato==2){
            
            nombreFichero = Principal.rutaGuardar + "\\" + Principal.nombreFichero + "Porcentajes.xlsx" ;
            
        }
                   
        
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
        
   
        
        if(formato==1){

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
        
        
        }else if(formato==2){
            
            String[] titulos = {"anger", "contempt",
                "disgust", "fear", "happiness", "neutral", "sadness", "surprise", "useful"};
            Double[] datos = {Principal.angerContadorPorcentaje, Principal.contemptContadorPorcentaje, 
                Principal.disgustContadorPorcentaje, Principal.fearContadorPorcentaje, 
                Principal.happinessContadorPorcentaje, Principal.neutralContadorPorcentaje, 
                Principal.sadnessContadorPorcentaje, Principal.surpriseContadorPorcentaje, 
                Double.valueOf(Principal.nFotosAnalizadas - Principal.noAnalizadoContador)};

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

            aux.LOGGER.log(Level.INFO, "Archivo creado existosamente en {0}", archivo.getAbsolutePath());

        } catch (FileNotFoundException ex) {
            aux.LOGGER.log(Level.SEVERE, "Error con la creacion del archivo");
        } catch (IOException ex) {
            aux.LOGGER.log(Level.SEVERE, "Error de entrada/salida");
        }

    
    }
    
    
    public void crearDatasetPorFotograma(){
    
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
            String claseCadena = aux.claseEnteroACadena(clase);
            
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
                
                claseCadena = aux.claseEnteroACadena(clase);
                
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

            aux.LOGGER.log(Level.INFO, "Archivo creado existosamente en {0}", archivo.getAbsolutePath());

        } catch (FileNotFoundException ex) {
            aux.LOGGER.log(Level.SEVERE, "Error con la creacion del archivo");
        } catch (IOException ex) {
            aux.LOGGER.log(Level.SEVERE, "Error de entrada/salida");
        }

    
    }
    
    //crear datasetUNICO
    
    public static void crearDatasetUnico(ArrayList<Double> nuevosDatos, String nombre) throws FileNotFoundException, IOException{
        
            String nombreFichero = Principal.rutaGuardar + "\\" + Principal.nombreDatasetUnico + ".xlsx" ;
   
            File archivo = new File(nombreFichero);

            Workbook workbook = new XSSFWorkbook();

            Sheet pagina = workbook.createSheet("Resumen de las emociones de los sujetos");

            CellStyle style = workbook.createCellStyle();


            String[] titulos = { "archivo", "anger", "contempt", "disgust", "fear", "happiness",
                                 "neutral", "sadness", "surprise", "% anger", "% contempt", "%disgust",
                                 "% fear", "% happiness", "% neutral", "% sadness", "% surprise", "analizadas",
                                 "no analizadas", "utiles"};
            //Integer[] datos = {};
            

            Row fila = pagina.createRow(0);
            
            
            for (int i = 0; i < titulos.length; i++) {

                Cell celda = fila.createCell(i);
                celda.setCellValue(titulos[i]);
                pagina.autoSizeColumn(i);
            }

            

            fila = pagina.createRow(1);
            
            Cell celda = fila.createCell(0);
            celda.setCellValue(nombre);
            pagina.autoSizeColumn(0);
            
            
            for (int i = 0; i < nuevosDatos.size(); i++) {

                celda = fila.createCell(i+1);
                celda.setCellValue(nuevosDatos.get(i));
                pagina.autoSizeColumn(i+1);
            }
            
            
   
            ////////////



            FileOutputStream salida = new FileOutputStream(archivo);

            workbook.write(salida);

            workbook.close();

            
    }
    
    //ver si existe dataset unico
    public static boolean existeDatasetUnico(){
        
        boolean resultado = false;
 
        String rutaFile = Principal.rutaGuardar + "\\" + Principal.nombreDatasetUnico + ".xlsx" ;
     
        //COMPROBACION, de la ruta de video elegido
        System.out.println("La ruta del video elegido es: "); 
        System.out.println(rutaFile); 
        
        //PARA PROBAR CONTENIDO
        
        //declaracion del File para la comprobación
        File archivo = new File(rutaFile);
        
        //COMPROBAR SI EXISTE
        resultado = Files.exists(archivo.toPath()) ;
        
  
        return resultado;
        
        
    }
    
    //cargar dataset ecxistente
            
    public static void cargarDatasetUnico() throws IOException{
        
        String nombreFichero = Principal.rutaGuardar + "\\" + Principal.nombreDatasetUnico + ".xlsx" ;
   
        
        FileInputStream file = new FileInputStream(new File(nombreFichero));

	XSSFWorkbook workbook = new XSSFWorkbook(file);
	
	XSSFSheet sheet = workbook.getSheetAt(0);
	Iterator<Row> rowIterator = sheet.iterator();
	
	Row row;
        //para saltar 1
        row = rowIterator.next();

	while (rowIterator.hasNext()){
	
	    row = rowIterator.next();

	    Iterator<Cell> cellIterator = row.cellIterator();
	
	    Cell celda;
            
            ArrayList<Double> aux = new ArrayList<>();

	    while (cellIterator.hasNext()){
	
		celda = cellIterator.next();
	
		switch(celda.getCellType()) {
	
		case Cell.CELL_TYPE_NUMERIC:
	
		    if( DateUtil.isCellDateFormatted(celda) ){
	
		      // System.out.print(celda.getDateCellValue()+" | ");
                       
	
		    }else{
	
		       //System.out.print(celda.getNumericCellValue()+" | ");
                       aux.add((Double)celda.getNumericCellValue());
	
		    }
	
		    break;
	
		case Cell.CELL_TYPE_STRING:
	
		   // System.out.print(celda.getStringCellValue()+" | ");
                    Principal.nombresDatasetUnico.add(celda.getStringCellValue());
	
		    break;
	
		case Cell.CELL_TYPE_BOOLEAN:
	
		    //System.out.print(celda.getBooleanCellValue()+" | ");
	
		    break;
	
		}
               
	    }
            Principal.arrayDatosDatasetUnico.add(aux);
           // System.out.println(row.getRowNum());
            Principal.rowsDatasetUnico.add(row.getRowNum());
            
	}
	
	workbook.close();
	
    }
        
            
    //agregarA datasetUNICO
    public static void agregarADatasetUnico(ArrayList<Double> nuevosDatos, String nombre) throws FileNotFoundException, IOException{
        
        int ultimo = 0;
        
        String nombreFichero = Principal.rutaGuardar + "\\" + Principal.nombreDatasetUnico + ".xlsx" ;
   
        
        File archivo = new File(nombreFichero);
          
        Workbook workbook = new XSSFWorkbook();

        Sheet pagina = workbook.createSheet("Resumen de las emociones del sujeto");

        CellStyle style = workbook.createCellStyle();

        String[] titulos = { "archivo", "anger", "contempt", "disgust", "fear", "happiness",
                             "neutral", "sadness", "surprise", "% anger", "% contempt", "%disgust",
                             "% fear", "% happiness", "% neutral", "% sadness", "% surprise", "analizadas",
                             "no analizadas", "utiles"};
        //Integer[] datos = {};


        Row fila = pagina.createRow(0);


        for (int i = 0; i < titulos.length; i++) {

            Cell celda = fila.createCell(i);
            celda.setCellValue(titulos[i]);
            pagina.autoSizeColumn(i);
        }
            
        
     
        for(int i=0; i< Principal.rowsDatasetUnico.size(); i++){

        fila = pagina.createRow(Principal.rowsDatasetUnico.get(i));
        ultimo = Principal.rowsDatasetUnico.get(i);
        Cell celda = fila.createCell(0);
        celda.setCellValue(Principal.nombresDatasetUnico.get(i));
        pagina.autoSizeColumn(0);

        for (int j = 0; j < Principal.arrayDatosDatasetUnico.get(i).size() ; j++) {

            celda = fila.createCell(j+1);
            celda.setCellValue(Principal.arrayDatosDatasetUnico.get(i).get(j));
            pagina.autoSizeColumn(j+1);

        }

        }

        ////////////////
            
            

            fila = pagina.createRow(ultimo+1);
            
            Cell celda = fila.createCell(0);
            celda.setCellValue(nombre);
            pagina.autoSizeColumn(0);
            
            
            for (int i = 0; i < nuevosDatos.size(); i++) {

                celda = fila.createCell(i+1);
                celda.setCellValue(nuevosDatos.get(i));
                pagina.autoSizeColumn(i+1);
            }


        ////////////



            FileOutputStream salida = new FileOutputStream(archivo);

            workbook.write(salida);

            workbook.close();

            
    }
    
    
    
    //para rellenar el vector de los nuevos datos que posteriormente se introducira en el dataset unico
    public static  ArrayList<Double>  rellenarVectorDatasetUnico() {
            
       ArrayList<Double> nuevosDatos = new ArrayList<>();
            
        nuevosDatos.add(Double.valueOf(Principal.angerContador));
        nuevosDatos.add(Double.valueOf(Principal.contemptContador));
        nuevosDatos.add(Double.valueOf(Principal.disgustContador));
        nuevosDatos.add(Double.valueOf(Principal.fearContador));
        nuevosDatos.add(Double.valueOf(Principal.happinessContador));
        nuevosDatos.add(Double.valueOf(Principal.neutralContador));
        nuevosDatos.add(Double.valueOf(Principal.sadnessContador));
        nuevosDatos.add(Double.valueOf(Principal.surpriseContador)); 
        
        //PORCENTAJES
        nuevosDatos.add(Principal.angerContadorPorcentaje);
        nuevosDatos.add(Principal.contemptContadorPorcentaje);
        nuevosDatos.add(Principal.disgustContadorPorcentaje);
        nuevosDatos.add(Principal.fearContadorPorcentaje);
        nuevosDatos.add(Principal.happinessContadorPorcentaje);
        nuevosDatos.add(Principal.neutralContadorPorcentaje);
        nuevosDatos.add(Principal.sadnessContadorPorcentaje);
        nuevosDatos.add(Principal.surpriseContadorPorcentaje);
        
        nuevosDatos.add(Double.valueOf(Principal.nFotosAnalizadas));
        nuevosDatos.add(Double.valueOf(Principal.noAnalizadoContador));
        nuevosDatos.add(Double.valueOf(Principal.nFotosAnalizadas)-Double.valueOf(Principal.noAnalizadoContador));
        

        
       return nuevosDatos;
            
    }
    
        
    
    
    
    
    
}
