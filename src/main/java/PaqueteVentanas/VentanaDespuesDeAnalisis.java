//PAQUETE NECESARIO
package PaqueteVentanas;

//IMPORT NECESARIO
import PaquetePreAnalisis.Principal;

/**
 *
 * @author Angel Murcia Diaz
 */

//VENTANA: VENTANADESPUESDEANALISIS
public class VentanaDespuesDeAnalisis extends javax.swing.JFrame {

    //CONSTRUCTOR
    public VentanaDespuesDeAnalisis() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonResultadosFinales = new javax.swing.JButton();
        botonGraficas = new javax.swing.JButton();
        botonVolverMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VENTANA DESPUES DE ANALIZAR");

        botonResultadosFinales.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonResultadosFinales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PaqueteImagenes/resultados32.png"))); // NOI18N
        botonResultadosFinales.setText("RESULTADOS");
        botonResultadosFinales.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonResultadosFinales.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonResultadosFinales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResultadosFinalesActionPerformed(evt);
            }
        });

        botonGraficas.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonGraficas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PaqueteImagenes/graficas32.png"))); // NOI18N
        botonGraficas.setText("GRAFICAS");
        botonGraficas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonGraficas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonGraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGraficasActionPerformed(evt);
            }
        });

        botonVolverMenuPrincipal.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonVolverMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PaqueteImagenes/atras32.png"))); // NOI18N
        botonVolverMenuPrincipal.setText("AL INICIO");
        botonVolverMenuPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonVolverMenuPrincipal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonVolverMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(botonResultadosFinales, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonGraficas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonVolverMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonVolverMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonResultadosFinales, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGraficas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //FUNCION BOTON RESULTADOS FINALES
    private void botonResultadosFinalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResultadosFinalesActionPerformed

       Principal.ventana_resultados.setVisible(false);   
       Principal.ventana_resultados.actualizar();
       Principal.ventana_resultados.setVisible(true);
       Principal.ventana_resultados.setResizable(false);
       
    }//GEN-LAST:event_botonResultadosFinalesActionPerformed

    //FUNCION BOTON GRAFICAS
    private void botonGraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGraficasActionPerformed
        // TODO add your handling code here:
        
        Principal.ventana_graficas.setVisible(true);     
        Principal.ventana_graficas.setResizable(false);
    }//GEN-LAST:event_botonGraficasActionPerformed

    //FUNCION BOTON VOLVER MENU PRINCIPAL
    private void botonVolverMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverMenuPrincipalActionPerformed

        Principal.ventana_final.setVisible(false);        
        Principal.ventana_principal.setVisible(true);      
        Principal.ventana_principal.setResizable(false);
        
    }//GEN-LAST:event_botonVolverMenuPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaDespuesDeAnalisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDespuesDeAnalisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDespuesDeAnalisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDespuesDeAnalisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDespuesDeAnalisis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGraficas;
    private javax.swing.JButton botonResultadosFinales;
    private javax.swing.JButton botonVolverMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
