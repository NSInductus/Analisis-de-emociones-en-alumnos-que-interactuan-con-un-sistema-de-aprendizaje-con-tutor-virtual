//PAQUETE NECESARIO
package PaqueteVentanas;

//IMPORT NECESARIOS
import PaqueteAnalisisVideo.Funciones;
import PaquetePreAnalisis.Principal;

/**
 *
 * @author Angel Murcia Diaz
 */

//VENTANA: VENTANAERRORPARAPROCESO
public class VentanaErrorParaProceso extends javax.swing.JFrame {

    //CONSTRUCTOR
    public VentanaErrorParaProceso() {
        initComponents(); 
        etiquetaDescripcionError.setText(Principal.error);       
        etiquetaDescripcionError.setEditable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Imagen = new javax.swing.JLabel();
        etiquetaError = new javax.swing.JLabel();
        panelDeslizador = new javax.swing.JScrollPane();
        etiquetaDescripcionError = new javax.swing.JTextPane();
        botonParaProceso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VENTANA DE ERROR");

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PaqueteImagenes/error128.png"))); // NOI18N

        etiquetaError.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaError.setText("AVISO DE ERROR");

        etiquetaDescripcionError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelDeslizador.setViewportView(etiquetaDescripcionError);

        botonParaProceso.setText("TERMINAR");
        botonParaProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonParaProcesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(Imagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaError, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDeslizador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonParaProceso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaError, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDeslizador, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonParaProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //FUNCION BOTON PARAR PROCESO
    private void botonParaProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonParaProcesoActionPerformed
     
        Principal.matarHilo=true;    
        Principal.ventana_seguimiento.setVisible(false);     
        Principal.ventana_principal.setVisible(true);   
        Principal.ventana_principal.setResizable(false);    
        System.out.printf("Proceso terminado.");  
        new Funciones().imprimir("Porcentajes","Porcentajes");
          
    }//GEN-LAST:event_botonParaProcesoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaErrorParaProceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaErrorParaProceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaErrorParaProceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaErrorParaProceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaErrorParaProceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    private javax.swing.JButton botonParaProceso;
    private javax.swing.JTextPane etiquetaDescripcionError;
    private javax.swing.JLabel etiquetaError;
    private javax.swing.JScrollPane panelDeslizador;
    // End of variables declaration//GEN-END:variables
}
