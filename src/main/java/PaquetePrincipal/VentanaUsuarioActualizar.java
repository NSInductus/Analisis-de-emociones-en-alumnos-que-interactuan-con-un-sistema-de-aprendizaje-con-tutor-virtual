/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PaquetePrincipal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author angel
 */
public class VentanaUsuarioActualizar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaUsuarioNuevo
     */
    public VentanaUsuarioActualizar() {
        initComponents();
    }
    
    public static String userFile = null;
    
      public static String rutaFileGuardar = null;
      public static boolean hayRutaGuardar = false;
      public static String nick = null;
      public static String pass = null;
      public static String pConex = null;
      public static boolean esPrueba = false;
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAceptar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        etiqueta = new javax.swing.JLabel();
        etiquetaPass = new javax.swing.JLabel();
        etiquetaPConex = new javax.swing.JLabel();
        valorPass = new javax.swing.JPasswordField();
        valorPConex = new javax.swing.JTextField();
        etiquetaRuta = new javax.swing.JLabel();
        butonSeleccionarRuta = new javax.swing.JButton();
        etiquetaVersionPrueba = new javax.swing.JLabel();
        valorVersionPrueba = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ACTUALIZAR USUARIO");

        botonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PaquetePrincipal/play32.png"))); // NOI18N
        botonAceptar.setText("ACEPTAR");
        botonAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAceptar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PaquetePrincipal/atras32.png"))); // NOI18N
        botonAtras.setText("ATRAS");
        botonAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        etiqueta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiqueta.setText("ACTUALIZAR USUARIO:");

        etiquetaPass.setText("Contraseña de ApiFace:");

        etiquetaPConex.setText("Punto de conexion:");

        valorPConex.setText("https://westcentralus.api.cognitive.microsoft.com/face/v1.0/detect");

        etiquetaRuta.setText("Usuario a actualizar:");

        butonSeleccionarRuta.setText("Seleccionar");
        butonSeleccionarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonSeleccionarRutaActionPerformed(evt);
            }
        });

        etiquetaVersionPrueba.setText("¿Version de Prueba?:");

        valorVersionPrueba.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        valorVersionPrueba.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaPConex, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPass, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiquetaVersionPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorPConex, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(valorPass)
                                    .addComponent(butonSeleccionarRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(valorVersionPrueba, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butonSeleccionarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPass, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorPass, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaPConex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valorPConex, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaVersionPrueba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valorVersionPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
          
        
        if(hayRutaGuardar == true){
      
            String nickUsuario = nick;
            String passUsuario = new String(valorPass.getPassword());
            
            String pConexUsuario = valorPConex.getText();
            
            
            System.out.println("WWWWWWWWWWWWWWWWWWW");
                
            System.out.println("|"+ passUsuario + "|");
            System.out.println("|"+ pConexUsuario + "|");
            
             System.out.println("WWWWWWWWWWWWWWWWWWWWWWW");
            boolean esPruebaUsuario = false;
            
            if( valorVersionPrueba.getSelectedIndex() == 0){

                esPruebaUsuario = true;

            }else{

                esPruebaUsuario = false;
            }
            
            if(!"".equals(passUsuario) && !"".equals(pConexUsuario)){
            
                Principal.user.setNick(nickUsuario);
                
                Principal.user.setPass(passUsuario);

                Principal.user.setPconex(pConexUsuario);
                
                Principal.user.setVersionPrueba(esPruebaUsuario);
                
               //CHIVATOS 
                //System.out.println("El usuario que se utilizara tiene los siguientes datos: ");
                
                //System.out.println("nick: "+ nickUsuario + "|" + Principal.user.getNick());
                
                //System.out.println("contraseña: "+ passUsuario+ "|" + Principal.user.getPass());
                
                //System.out.println("punto de conexion: " + pConexUsuario+ "|" + Principal.user.getPconex());
                
                //System.out.println("Version de Prueba: "+ esPruebaUsuario+ "|" + Principal.user.getVersionPrueba());
                
                //System.out.println("RUTA: " + rutaFileGuardar);
                 
                //volcar usuario a fichero en esa ruta
                FileWriter fichero = null;
                
                PrintWriter pw = null;
                
                String nombreFichero = userFile ;
                
                System.out.println(nombreFichero);
                
                
                try{
                    
                   fichero = new FileWriter(nombreFichero);
                    
                   pw = new PrintWriter(fichero);
                   
                   
                   System.out.println("Escribiendo fichero de usuario en formato .TXT");

                   
                   pw.println(Principal.user.getNick());
                   pw.println(Principal.user.getPass());
                   pw.println(Principal.user.getPconex());
                   pw.println(Principal.user.getVersionPrueba()); 
                   
                }catch (Exception e) { 
                    
                    e.printStackTrace();
                    
                } finally{
                    
                    try{
                        
                        if(null != fichero){
                            fichero.close();
                        }
                        
                    } catch (Exception e2){
                        
                        e2.printStackTrace();
                        
                    }
                    
                    
                }           
                
 
                
                //pasar los valores a lo que usa el progrma en el inicializar
                //YASTA
                
                
                //si eso crear el boton de comprobar contraseña
                //DESPUES SI O SI
                
                //ocultar la ventana
                Principal.ventana_usuario_actualizar.setVisible(false);
                
                //variabble para que funcipone el analizar
                Principal.sesionIniciada = true;
                
            }else{
            
                //ERROR NO PUEDEN QUEDARSE NINGUNO DE LOS 3 PRIMEROS CAMPOS VACIOS
                //ERROR DESEADO
                Principal.error = "NO PUEDEN QUEDARSE NINGUNO DE LOS CAMPOS VACIOS Y SE HA DE SELECIONAR UN USUARIO EN EL FORMATO.TXT";

                //CREACIÓN VENTANA DE ERROR
                VentanaError ventana_error = new VentanaError();

                //PONER VISIBLE LA VENTANA
                ventana_error.setVisible(true);  

                //PONER LA VENTANA DE TAMAÑO FIJO
                ventana_error.setResizable(false);
            
            }
      
        }else{
            
            //ERROR NO HAY RUTA PARA ALMACENAR EL USUARIO EN FORMATO TXT
            //ERROR DESEADO
            Principal.error = "NO SE HA SELECCIONADO NINGUN USUARIO EN FORMATO TXT";

            //CREACIÓN VENTANA DE ERROR
            VentanaError ventana_error = new VentanaError();

            //PONER VISIBLE LA VENTANA
            ventana_error.setVisible(true);  

            //PONER LA VENTANA DE TAMAÑO FIJO
            ventana_error.setResizable(false);
            
        }

      

      
      
      

    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO add your handling code here:

        Principal.ventana_usuario_actualizar.setVisible(false);

        Principal.ventana_usuarios.setVisible(true);
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void butonSeleccionarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonSeleccionarRutaActionPerformed
        // TODO add your handling code here:
         //LLAMA A LA FUNCION CARGAR, para la seleccion manual del archivo de video
        userFile = cargar();
     
        //COMPROBACION, de la ruta de video elegido
        System.out.println("La ruta del archivo .TXT contenedor del usuario deseado es: "); 
        System.out.println(userFile); 
        
        //PARA PROBAR CONTENIDO
        
        //declaracion del File para la comprobación
        File archivo = new File(userFile);
        
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
        
        System.out.println("|"+tipodeArchivoComparar+"|");
    
        //comprobacion de si es o no un archivo de video
        if("text/".equals(tipodeArchivoComparar)){
       
        System.out.println("texto");
        System.out.println(userFile);
        
        File archivoLeer = null;
        
        FileReader fr = null;
        
        BufferedReader br = null;
        
        try{
            
            archivoLeer = new File (userFile);
            
            if(archivoLeer.exists()==false){
                
                return;
            }
            
            fr = new FileReader (archivoLeer);
            
            br =  new BufferedReader (fr);
            
            String linea;
            
            linea = br.readLine();
            
            nick = linea;
           
            
            hayRutaGuardar = true;
            
      
            
            
        }catch (Exception e) { 
                    
                    e.printStackTrace();
                    
        } finally{

            try{

                if(null != fr){
                    fr.close();
                }

            } catch (Exception e2){

                e2.printStackTrace();

            }


        }
        
        
            


        }else{
            
            System.out.println("Seleccione un archivo TXT que contenga los datos de su usuario");
            
            //ERROR DESEADO
            Principal.error = "SELECCIONE UN ARCHIVO .TXT QUE CONTENGA LOS DATOS DE SU USUARIO";
            
            //CREACIÓN VENTANA DE ERROR
            VentanaError ventana_error = new VentanaError();
         
            //PONER VISIBLE LA VENTANA
            ventana_error.setVisible(true);  
            
            //PONER LA VENTANA DE TAMAÑO FIJO
            ventana_error.setResizable(false);
            
        }
        
    }//GEN-LAST:event_butonSeleccionarRutaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUsuarioNuevo().setVisible(true);
            }
        });
    }
    
   public String cargarRuta(){
    
        //fichero seleccionado
        JFileChooser fichero = new JFileChooser();
       
        //atajos
        //fcPicture.setFileFilter(new FileNameExtensionFilter("Archivo de imagen", "jpg", "JPG", "jpeg", "JPEG", "png", "PNG", "gif", "GIF", "tif", "TIF", "tiff", "TIFF"));
        //fichero.setFileFilter(new FileNameExtensionFilter("Carpeta de archivos", "mkv", "mp4", "wmv"));
        //fichero.setCurrentDirectory(JFileChooser.FILES_AND_DIRECTORIES);
        fichero.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        //ventana madre para mostrar la ventana de abrir
        int option = fichero.showDialog(this, "Aceptar"); 
        
        
        
        //devuelve directamente el fichero especificado
        return fichero.getSelectedFile().toString();
    
    }
   
   public String cargar(){
    
        //fichero seleccionado
        JFileChooser fichero = new JFileChooser();
        
        //atajos
        //fcPicture.setFileFilter(new FileNameExtensionFilter("Archivo de imagen", "jpg", "JPG", "jpeg", "JPEG", "png", "PNG", "gif", "GIF", "tif", "TIF", "tiff", "TIFF"));
        fichero.setFileFilter(new FileNameExtensionFilter("Archivos TXT", "txt"));
        
       
        //atajos
        //fcPicture.setFileFilter(new FileNameExtensionFilter("Archivo de imagen", "jpg", "JPG", "jpeg", "JPEG", "png", "PNG", "gif", "GIF", "tif", "TIF", "tiff", "TIFF"));
        //fichero.setFileFilter(new FileNameExtensionFilter("Carpeta de archivos", "mkv", "mp4", "wmv"));
        //fichero.setCurrentDirectory(JFileChooser.FILES_AND_DIRECTORIES);
        fichero.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        //ventana madre para mostrar la ventana de abrir
        int option = fichero.showDialog(this, "Seleccionar"); 
        
        
        
        //devuelve directamente el fichero especificado
        return fichero.getSelectedFile().toString();
    
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton butonSeleccionarRuta;
    private javax.swing.JLabel etiqueta;
    private javax.swing.JLabel etiquetaPConex;
    private javax.swing.JLabel etiquetaPass;
    private javax.swing.JLabel etiquetaRuta;
    private javax.swing.JLabel etiquetaVersionPrueba;
    private javax.swing.JTextField valorPConex;
    private javax.swing.JPasswordField valorPass;
    private javax.swing.JComboBox<String> valorVersionPrueba;
    // End of variables declaration//GEN-END:variables
}
