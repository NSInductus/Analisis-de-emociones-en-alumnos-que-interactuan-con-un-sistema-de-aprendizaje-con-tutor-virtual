//INCLUSION NECESARIA DEL PAQUETE
package PaqueteVentanas;

//IMPORT NECESARIOS
import PaqueteAnalisisVideo.HiloProcesoPrincipal;
import PaqueteAnalisisVideo.Funciones;
import PaquetePreAnalisis.Principal;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;



/**
 *
 * @author Angel Murcia Diaz
 */

//CLASE VENTANA PRINCIPAL   
public class VentanaPrincipal extends javax.swing.JFrame {

    //CONSTRUCTOR
    public VentanaPrincipal() {
        initComponents();
        //icono de la aplicacion
        //setIconImage(new ImageIcon(getClass().getResource("/PaqueteImagenes/instrumentos32.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonAnalizar = new javax.swing.JButton();
        BotonOpciones = new javax.swing.JButton();
        BotonUsuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");

        BotonAnalizar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        BotonAnalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PaqueteImagenes/play32.png"))); // NOI18N
        BotonAnalizar.setText("ANALIZAR VIDEO");
        BotonAnalizar.setToolTipText("Clica aquí para empezar a analizar el video.");
        BotonAnalizar.setDefaultCapable(false);
        BotonAnalizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonAnalizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnalizarActionPerformed(evt);
            }
        });

        BotonOpciones.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        BotonOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PaqueteImagenes/usuario32.png"))); // NOI18N
        BotonOpciones.setText("MENU USUARIO");
        BotonOpciones.setToolTipText("Clic aquí para cambiar a un nuevo usuario o en su defecto para crear un nuevo usuario, donde se introduzca una clave de Microsoft API.");
        BotonOpciones.setDefaultCapable(false);
        BotonOpciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonOpciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOpcionesActionPerformed(evt);
            }
        });

        BotonUsuarios.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        BotonUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PaqueteImagenes/instrumentos32.png"))); // NOI18N
        BotonUsuarios.setText("OPCIONES");
        BotonUsuarios.setToolTipText("Clic aquí para cambiar las opciones deseadas que se aplicarán al posterior analisis de emociones en un archivo de video.");
        BotonUsuarios.setDefaultCapable(false);
        BotonUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonAnalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonAnalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTON ANALIZAR
    private void BotonAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnalizarActionPerformed

        //COMPROBAR SI ESTA LA SESION INICIADA
        if(Principal.sesionIniciada == true){
            
            if(Principal.hayRutaConfirmada == true){

                //LLAMA A LA FUNCION CARGAR, para la seleccion manual del archivo de video
                Principal.videoFile = cargar();

                //COMPROBACION, de la ruta de video elegido
                System.out.println("La ruta del video elegido es: "); 
                System.out.println(Principal.videoFile); 

                //PARA PROBAR CONTENIDO

                //declaracion del File para la comprobación
                File archivo = new File(Principal.videoFile);

                //String para la comprobacion
                String tipodeArchivo = null;
                //probar el archivo
                try {
                    tipodeArchivo = Files.probeContentType(archivo.toPath());
                } catch (IOException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }


                //System.out.println(tipodeArchivo);

                //manipulacion de la cadena para comprobar facilmente si es de tipo video o no
                String tipodeArchivoComparar = tipodeArchivo.substring(0, 5 );

                System.out.println("El archivo elegido es: ");
                System.out.println("|"+tipodeArchivoComparar+"|");

                //comprobacion de si es o no un archivo de video
                if("video".equals(tipodeArchivoComparar)){

                    //PONER LA VENTANA NO VISIBLE
                    this.setVisible(false);

                    //resetear valores iniciales de los contadores 
                    new Funciones().inicializarValoresIniciales();

                    //SE REINICIA EL VECTOR(incluir en ionicializar)
                    Principal.contenedorFrames.clear();

                    //VENTANAAAAAA DE SEGUIMIENTO     
                    //PONER VISIBLE LA VENTANA
                    Principal.ventana_seguimiento.setVisible(true);    

                    //PONER LA VENTANA DE TAMAÑO FIJO
                    Principal.ventana_seguimiento.setResizable(false);

                    //HILO PARA CREAR EL SUDPROCESO QUE HARA TODO EL ANALISIS DE VIDEO
                    HiloProcesoPrincipal hilo1=new HiloProcesoPrincipal("Proceso principal de analisis de video");

                    //Principal.hilo1.start();
                    hilo1.start();

                //ELSE: ERROR no es archivo de video
                }else{

                    System.out.println("Seleccione un archivo de video");

                }

            }else{

                //ERROR DESEADO
                Principal.error = "ES NECESARIO SELECCIONAR UNA RUTA PARA LOS ARCHIVOS TEMPORALES, HAGA CLIC EN EL BOTON DE OPCIONES Y POSTERIORMENTE SELECCIONE UNA RUTA";

                //CREACIÓN VENTANA DE ERROR
                VentanaError ventana_error = new VentanaError();

                //PONER VISIBLE LA VENTANA
                ventana_error.setVisible(true);  

                //PONER LA VENTANA DE TAMAÑO FIJO
                ventana_error.setResizable(false);

            }
        
        }else{
            
            //ERROR DESEADO
            Principal.error = "SE DEBE DE IDENTIFICAR EL USUARIO ANTES DE PODER ANALIZAR CUALQUIER VIDEO";
            
            //CREACIÓN VENTANA DE ERROR
            VentanaError ventana_error = new VentanaError();
         
            //PONER VISIBLE LA VENTANA
            ventana_error.setVisible(true);  
            
            //PONER LA VENTANA DE TAMAÑO FIJO
            ventana_error.setResizable(false);  
        }
   
    }//GEN-LAST:event_BotonAnalizarActionPerformed

    //FUNCION BOTON OPCIONES
    private void BotonOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOpcionesActionPerformed

        //PONER VISIBLE LA VENTANA
        Principal.ventana_usuarios.setVisible(true);  

        //PONER LA VENTANA DE TAMAÑO FIJO
        Principal.ventana_usuarios.setResizable(false);
        
    }//GEN-LAST:event_BotonOpcionesActionPerformed

    //FUNCION BOTON USUARIOS
    private void BotonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUsuariosActionPerformed

        System.out.println("El usuario que se utilizara tiene los siguientes datos: ");
        System.out.println("nick: "+ Principal.user.getNick());
        System.out.println("contraseña: "+  Principal.user.getPass());
        System.out.println("punto de conexion: " + Principal.user.getPconex());
        System.out.println("Version de Prueba: " + Principal.user.getVersionPrueba());

        //PONER VISIBLE LA VENTANA
        Principal.ventana_opciones.setVisible(true);  

        //PONER LA VENTANA DE TAMAÑO FIJO
        Principal.ventana_opciones.setResizable(false);
        
    }//GEN-LAST:event_BotonUsuariosActionPerformed

    //FUNCION PRINCIPAL
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    
    //FUNCION CARGAR
    public String cargar(){
    
        //fichero seleccionado
        JFileChooser fichero = new JFileChooser();
       
        //atajos
        fichero.setFileFilter(new FileNameExtensionFilter("Archivos de video", "mkv", "mp4", "wmv"));
        
        //ventana madre para mostrar la ventana de abrir
        int option = fichero.showDialog(this, "Abrir"); 
        
        //pasar el nombre del video 
        String aux;
        aux = fichero.getSelectedFile().toString();
        Principal.nombreFichero = aux.substring( aux.lastIndexOf("\\")+1 , aux.lastIndexOf(".") );

        System.out.print("Nombre del archivo a analizar: ");             
        System.out.println(Principal.nombreFichero);
     
        //devuelve directamente el fichero especificado
        return fichero.getSelectedFile().toString();
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnalizar;
    private javax.swing.JButton BotonOpciones;
    private javax.swing.JButton BotonUsuarios;
    // End of variables declaration//GEN-END:variables
}

//YA NO ES UTIL
class EjemploHilo extends Thread  
{      
    public void run() 
    {
        // Código del hilo      
    }  
}
    

