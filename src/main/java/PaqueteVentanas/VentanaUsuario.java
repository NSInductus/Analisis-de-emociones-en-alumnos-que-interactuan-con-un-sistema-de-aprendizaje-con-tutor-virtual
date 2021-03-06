//PAQUETE NECESARIO
package PaqueteVentanas;

//IMPORT NECESARIOS
import PaquetePreAnalisis.Principal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Angel Murcia Diaz
 */

//VENTANA: VENTANAUSUARIO
public class VentanaUsuario extends javax.swing.JFrame {

    //CONSTRUCTOR
    public VentanaUsuario() {
        initComponents();
    }
    
    //VARIABLE ARCHIVO USUARIO
    public static String userFile = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCargarUsuario = new javax.swing.JButton();
        botonNuevoUsuario = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        botonActualizarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU DE USUARIO");

        botonCargarUsuario.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonCargarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PaqueteImagenes/cargar-usuario32x32.png"))); // NOI18N
        botonCargarUsuario.setText("CARGAR USUARIO");
        botonCargarUsuario.setToolTipText("Carga un usuario guardado anteriormente.");
        botonCargarUsuario.setDefaultCapable(false);
        botonCargarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCargarUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCargarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarUsuarioActionPerformed(evt);
            }
        });

        botonNuevoUsuario.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PaqueteImagenes/agregar-usuario32x32.png"))); // NOI18N
        botonNuevoUsuario.setText("NUEVO USUARIO");
        botonNuevoUsuario.setToolTipText("Crea un nuevo usuario, con una clave de Microsoft válida.");
        botonNuevoUsuario.setDefaultCapable(false);
        botonNuevoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNuevoUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoUsuarioActionPerformed(evt);
            }
        });

        botonAtras.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PaqueteImagenes/play32.png"))); // NOI18N
        botonAtras.setText("CONTINUAR");
        botonAtras.setToolTipText("Una vez activado el usuario deseado haga clic en este boton para continuar con el proceso.");
        botonAtras.setDefaultCapable(false);
        botonAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        botonActualizarUsuario.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonActualizarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PaqueteImagenes/actualizar-usuario32x32.png"))); // NOI18N
        botonActualizarUsuario.setText("ACTUALIZAR USUARIO");
        botonActualizarUsuario.setToolTipText("Actualiza la información de un usuario creado con anterioridad.");
        botonActualizarUsuario.setDefaultCapable(false);
        botonActualizarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonActualizarUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCargarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonActualizarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonNuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCargarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(botonNuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonActualizarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(botonAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //FUNCION CARGAR USUARIO
    private void botonCargarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarUsuarioActionPerformed

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
        
       // System.out.println("|"+tipodeArchivoComparar+"|");
    
        //comprobacion de si es o no un archivo de video
        if("text/".equals(tipodeArchivoComparar)){
       
            System.out.println("El archivo:");
            System.out.println(userFile);
            System.out.println("es valido.");

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

                Principal.user.setNick(linea);

                linea = br.readLine();

                Principal.user.setPass(linea);

                linea = br.readLine();

                Principal.user.setPconex(linea);

                linea = br.readLine();

               // System.out.println("|" + linea + "|");

                if("true".equals(linea)){

                    Principal.user.setVersionPrueba(true);

                }else{

                    Principal.user.setVersionPrueba(false);
                }


                //variabble para que funcipone el analizar
                    Principal.sesionIniciada = true;


            }catch (Exception e) { 

                        e.printStackTrace();

            }finally{

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
        
    }//GEN-LAST:event_botonCargarUsuarioActionPerformed

    //FUNCION NUEVO USUARIO
    private void botonNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoUsuarioActionPerformed

        Principal.ventana_usuario_nuevo.setVisible(true);       
        Principal.ventana_usuario_nuevo.setResizable(false);
    }//GEN-LAST:event_botonNuevoUsuarioActionPerformed

    //FUNCION BOTON ATRAS
    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed

        if(Principal.sesionIniciada == true){

            Principal.ventana_usuarios.setVisible(false);

            if(Principal.hayRutaConfirmada == true){

                Principal.ventana_principal.setVisible(true);
                Principal.ventana_principal.setResizable(false); 

            }else{

                Principal.ventana_opciones.setVisible(true);
                Principal.ventana_opciones.setResizable(false); 

            }

        }else{

             //ERROR DESEADO
            Principal.error = "SE DEBE SELECCIONAR UN USUARIO ANTES DE INGRESAR EN LA APLICACION";

            //CREACIÓN VENTANA DE ERROR
            VentanaError ventana_error = new VentanaError();

            //PONER VISIBLE LA VENTANA
            ventana_error.setVisible(true);  

            //PONER LA VENTANA DE TAMAÑO FIJO
            ventana_error.setResizable(false);

        }

    }//GEN-LAST:event_botonAtrasActionPerformed

    //FUNCION ACTUALIZAR USUARIO
    private void botonActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarUsuarioActionPerformed

        Principal.ventana_usuario_actualizar.setVisible(true);   
        Principal.ventana_usuario_actualizar.setResizable(false);
    }//GEN-LAST:event_botonActualizarUsuarioActionPerformed


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
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUsuario().setVisible(true);
            }
        });
    }
    
    //FUNCION CARGAR
    public String cargar(){
    
        //fichero seleccionado
        JFileChooser fichero = new JFileChooser();
  
        //atajos
        fichero.setFileFilter(new FileNameExtensionFilter("Archivos TXT", "txt"));
             
        //atajos
        fichero.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        //ventana madre para mostrar la ventana de abrir
        int option = fichero.showDialog(this, "Seleccionar"); 
       
        //devuelve directamente el fichero especificado
        return fichero.getSelectedFile().toString();
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizarUsuario;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonCargarUsuario;
    private javax.swing.JButton botonNuevoUsuario;
    // End of variables declaration//GEN-END:variables
}
