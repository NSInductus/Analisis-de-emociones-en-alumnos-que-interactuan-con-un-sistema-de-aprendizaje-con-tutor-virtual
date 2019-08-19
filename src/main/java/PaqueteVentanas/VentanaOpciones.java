//PAQUETE NECESARIO
package PaqueteVentanas;

//IMPORT NECESARIOS
import PaquetePreAnalisis.Principal;
import java.io.File;
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

//VENTANA: VENTANAOPCIONES
public class VentanaOpciones extends javax.swing.JFrame {

    //CONSTRUCTOR
    public VentanaOpciones() {
        initComponents();
    }
    
    //VARIABLE PRIVADA CON LA RUTA
    public String ruta=null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaUmbral = new javax.swing.JLabel();
        etiquetaSegundos = new javax.swing.JLabel();
        etiquetaOpciones = new javax.swing.JLabel();
        botonAtras = new javax.swing.JButton();
        botonAceptar = new javax.swing.JButton();
        etiquetaConservacion = new javax.swing.JLabel();
        etiquetaRuta = new javax.swing.JLabel();
        botonSeleccionar = new javax.swing.JButton();
        valorConservacion = new javax.swing.JComboBox<>();
        valorUmbral = new javax.swing.JTextField();
        valorSegundos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OPCIONES");

        etiquetaUmbral.setText("Umbral de aceptación:");

        etiquetaSegundos.setText("Capturar cada (s):");

        etiquetaOpciones.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        etiquetaOpciones.setText("OPCIONES DE ANÁLISIS");

        botonAtras.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PaqueteImagenes/atras32.png"))); // NOI18N
        botonAtras.setText("ATRAS");
        botonAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        botonAceptar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PaqueteImagenes/play32.png"))); // NOI18N
        botonAceptar.setText("ACEPTAR");
        botonAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAceptar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        etiquetaConservacion.setText("¿Conservación y analisis de fotogramas?");

        etiquetaRuta.setText("Ruta para guardar archivos:");

        botonSeleccionar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonSeleccionar.setText("SELECCIONAR");
        botonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarActionPerformed(evt);
            }
        });

        valorConservacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Si" }));
        valorConservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorConservacionActionPerformed(evt);
            }
        });

        valorUmbral.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        valorUmbral.setText("0.1");
        valorUmbral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorUmbralActionPerformed(evt);
            }
        });

        valorSegundos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        valorSegundos.setText("2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(etiquetaSegundos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiquetaUmbral, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiquetaRuta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(valorUmbral, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(valorSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botonSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiquetaConservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(valorConservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(etiquetaOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etiquetaOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaUmbral, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorUmbral, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaConservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorConservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAtras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorConservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorConservacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorConservacionActionPerformed

    private void valorUmbralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorUmbralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorUmbralActionPerformed

    //FUNCION BOTON SELECCIONAR
    private void botonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarActionPerformed

        ruta = cargarRuta();      
        Principal.valorUsuarioRuta = ruta;  
        System.out.println("La ruta seleccionada: ");
        System.out.println("|"+ruta+"|");
        File archivo = new File(ruta);
        
        //COMPROBACION DE SI EXISTE
        if (archivo.exists() && archivo.isDirectory()) {
            
            Principal.hayRutaUsuario=true;
       
        }else{
         
            //ERROR DESEADO
            Principal.error = "NO SE HA SELECCIONADO UNA RUTA VALIDA";
            
            //CREACIÓN VENTANA DE ERROR
            VentanaError ventana_error = new VentanaError();
         
            //PONER VISIBLE LA VENTANA
            ventana_error.setVisible(true);  
            
            //PONER LA VENTANA DE TAMAÑO FIJO
            ventana_error.setResizable(false);
         }
    }//GEN-LAST:event_botonSeleccionarActionPerformed

    //FUNCION BOTON ACEPTAR
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed

        boolean sePuede1, sePuede2;
        boolean ratio ;
        
        try{
           
           Double.parseDouble(valorUmbral.getText());
           sePuede1 = true;

           
        }catch (NumberFormatException excepcion){
    
            sePuede1=false;
        }
       
        try{
           
           Double.parseDouble(valorSegundos.getText());
           sePuede2 = true;
           
           
        }catch (NumberFormatException excepcion){
    
            sePuede2=false;
        }
  
        if(sePuede1==true && sePuede2==true){
           
            if(Double.parseDouble(valorUmbral.getText())>=0 && Double.parseDouble(valorUmbral.getText())<=1){

                ratio=true;

            }else{

                ratio=false;
            }
           
            if(ratio==true){
  
                Principal.valorUsuarioUmbral = Double.parseDouble(valorUmbral.getText());

                Principal.valorUsuarioSegundosFrame = Double.parseDouble(valorSegundos.getText());

                Principal.rutaGuardar = Principal.valorUsuarioRuta;

                Principal.hayRutaConfirmada = Principal.hayRutaUsuario;

                if(Principal.hayRutaConfirmada == true){

                    Principal.ventana_opciones.setVisible(false);

                    //System.out.println("|"+valorConservacion.getSelectedIndex()+"|");

                    if( valorConservacion.getSelectedIndex() == 0){

                        Principal.valorUsuarioConservar = false;

                    }else{

                        Principal.valorUsuarioConservar = true;
                    }

                    Principal.ventana_principal.setVisible(true);
                    Principal.ventana_principal.setResizable(false);

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
                Principal.error = "EL UMBRAL DEBE DE ENCONTRARSE ENTRE 0 Y 1";

                //CREACIÓN VENTANA DE ERROR
                VentanaError ventana_error = new VentanaError();

                //PONER VISIBLE LA VENTANA
                ventana_error.setVisible(true);  

                //PONER LA VENTANA DE TAMAÑO FIJO
                ventana_error.setResizable(false);
            
            }
   
        }else{
           
            //ERROR DESEADO
            Principal.error = "LOS 2 PRIMEROS CAMPOS TIENEN QUE CONTENER VALORES NUMERICOS";
            
            //CREACIÓN VENTANA DE ERROR
            VentanaError ventana_error = new VentanaError();
         
            //PONER VISIBLE LA VENTANA
            ventana_error.setVisible(true);  
            
            //PONER LA VENTANA DE TAMAÑO FIJO
            ventana_error.setResizable(false);
           
       }
        
    }//GEN-LAST:event_botonAceptarActionPerformed

    //FUNCION BOTON ATRAS
    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        
        Principal.ventana_opciones.setVisible(false);

        if(Principal.hayRutaConfirmada == true){

            Principal.ventana_principal.setVisible(true);
            Principal.ventana_principal.setResizable(false);

        }else{

            Principal.ventana_usuarios.setVisible(true);
            Principal.ventana_usuarios.setResizable(false);

        }
                
    }//GEN-LAST:event_botonAtrasActionPerformed

    //FUNCIONES PRINCIPAL
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaOpciones().setVisible(true);
            }
        });
    }
    
    //FUNCION CARGAR RUTA
    public String cargarRuta(){
    
        //fichero seleccionado
        JFileChooser fichero = new JFileChooser();
       
        //atajos
        fichero.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        //ventana madre para mostrar la ventana de abrir
        int option = fichero.showDialog(this, "Aceptar"); 

        //devuelve directamente el fichero especificado
        return fichero.getSelectedFile().toString();
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonSeleccionar;
    private javax.swing.JLabel etiquetaConservacion;
    private javax.swing.JLabel etiquetaOpciones;
    private javax.swing.JLabel etiquetaRuta;
    private javax.swing.JLabel etiquetaSegundos;
    private javax.swing.JLabel etiquetaUmbral;
    private javax.swing.JComboBox<String> valorConservacion;
    private javax.swing.JTextField valorSegundos;
    private javax.swing.JTextField valorUmbral;
    // End of variables declaration//GEN-END:variables
}
