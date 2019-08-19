//PAQUETE NECESARIO
package PaqueteVentanas;

//IMPORT NECESARIOS
import PaquetePostAnalisis.FuncionesGraficas;
import PaquetePreAnalisis.Principal;

/**
 *
 * @author Angel Murcia Diaz
 */

//VENTANA: VENTANAGRAFICAS
public class VentanaGraficas extends javax.swing.JFrame {

    //CONSTRUCTOR
    public VentanaGraficas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonContempt = new javax.swing.JButton();
        botonDisgust = new javax.swing.JButton();
        botonFear = new javax.swing.JButton();
        botonHappiness = new javax.swing.JButton();
        botonNeutral = new javax.swing.JButton();
        botonSadness = new javax.swing.JButton();
        botonSurprise = new javax.swing.JButton();
        botonNoAnalizado = new javax.swing.JButton();
        botonAnger = new javax.swing.JButton();
        botonPastel = new javax.swing.JButton();
        botonBarras = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VENTANA GRAFICAS");

        botonContempt.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonContempt.setText("CONTEMPT");
        botonContempt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContemptActionPerformed(evt);
            }
        });

        botonDisgust.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonDisgust.setText("DISGUST");
        botonDisgust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDisgustActionPerformed(evt);
            }
        });

        botonFear.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonFear.setText("FEAR");
        botonFear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFearActionPerformed(evt);
            }
        });

        botonHappiness.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonHappiness.setText("HAPPINESS");
        botonHappiness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHappinessActionPerformed(evt);
            }
        });

        botonNeutral.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonNeutral.setText("NEUTRAL");
        botonNeutral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNeutralActionPerformed(evt);
            }
        });

        botonSadness.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonSadness.setText("SADNESS");
        botonSadness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSadnessActionPerformed(evt);
            }
        });

        botonSurprise.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonSurprise.setText("SURPRISE");
        botonSurprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSurpriseActionPerformed(evt);
            }
        });

        botonNoAnalizado.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonNoAnalizado.setText("NO ANALIZADO");
        botonNoAnalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNoAnalizadoActionPerformed(evt);
            }
        });

        botonAnger.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonAnger.setText("ANGER");
        botonAnger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAngerActionPerformed(evt);
            }
        });

        botonPastel.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonPastel.setText("G. PASTEL");
        botonPastel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPastelActionPerformed(evt);
            }
        });

        botonBarras.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonBarras.setText("G. BARRAS");
        botonBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBarrasActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonFear, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonHappiness, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonNeutral, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonAnger, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonContempt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonSadness, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonSurprise, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(botonDisgust, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(botonNoAnalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(botonPastel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(botonBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonDisgust, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAnger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonContempt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonFear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonHappiness, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonNeutral, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonSadness, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(botonNoAnalizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonSurprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPastel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAngerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAngerActionPerformed
        // TODO add your handling code here:
             // new FuncionesGraficas().hacerGraficaAngerTotal();
               new FuncionesGraficas().hacerGraficaEmocionTiempoGenerica(0);
    }//GEN-LAST:event_botonAngerActionPerformed

    private void botonContemptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContemptActionPerformed
        // TODO add your handling code here:
              // new FuncionesGraficas().hacerGraficaContemptTotal();
               new FuncionesGraficas().hacerGraficaEmocionTiempoGenerica(1);
    }//GEN-LAST:event_botonContemptActionPerformed

    private void botonDisgustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDisgustActionPerformed
        // TODO add your handling code here:
             //  new FuncionesGraficas().hacerGraficaDisgustTotal();
               new FuncionesGraficas().hacerGraficaEmocionTiempoGenerica(2);
    }//GEN-LAST:event_botonDisgustActionPerformed

    private void botonFearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFearActionPerformed
        // TODO add your handling code here:
             //  new FuncionesGraficas().hacerGraficaFearTotal();
               new FuncionesGraficas().hacerGraficaEmocionTiempoGenerica(3);
    }//GEN-LAST:event_botonFearActionPerformed

    private void botonHappinessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHappinessActionPerformed
        // TODO add your handling code here:
             //  new FuncionesGraficas().hacerGraficaHappinessTotal();
               new FuncionesGraficas().hacerGraficaEmocionTiempoGenerica(4);
    }//GEN-LAST:event_botonHappinessActionPerformed

    private void botonNeutralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNeutralActionPerformed
        // TODO add your handling code here:
              // new FuncionesGraficas().hacerGraficaNeutralTotal();
               new FuncionesGraficas().hacerGraficaEmocionTiempoGenerica(5);
    }//GEN-LAST:event_botonNeutralActionPerformed

    private void botonSadnessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSadnessActionPerformed
        // TODO add your handling code here:
              // new FuncionesGraficas().hacerGraficaSadnessTotal();
               new FuncionesGraficas().hacerGraficaEmocionTiempoGenerica(6);
    }//GEN-LAST:event_botonSadnessActionPerformed

    private void botonSurpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSurpriseActionPerformed
        // TODO add your handling code here:
              // new FuncionesGraficas().hacerGraficaSurpriseTotal();
               new FuncionesGraficas().hacerGraficaEmocionTiempoGenerica(7);
    }//GEN-LAST:event_botonSurpriseActionPerformed

    private void botonNoAnalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNoAnalizadoActionPerformed
        // TODO add your handling code here:
            //  new FuncionesGraficas().hacerGraficaNoAnalizadoTotal();
               new FuncionesGraficas().hacerGraficaEmocionTiempoGenerica(8);
    }//GEN-LAST:event_botonNoAnalizadoActionPerformed

    private void botonPastelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPastelActionPerformed
        // TODO add your handling code here:
          new FuncionesGraficas().hacerGraficaFinalPastel();
    }//GEN-LAST:event_botonPastelActionPerformed

    private void botonBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBarrasActionPerformed
        // TODO add your handling code here:
          new FuncionesGraficas().hacerGraficaFinalBarras();
    }//GEN-LAST:event_botonBarrasActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO add your handling code here:

        Principal.ventana_graficas.setVisible(false);

      
    }//GEN-LAST:event_botonAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaGraficas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnger;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonBarras;
    private javax.swing.JButton botonContempt;
    private javax.swing.JButton botonDisgust;
    private javax.swing.JButton botonFear;
    private javax.swing.JButton botonHappiness;
    private javax.swing.JButton botonNeutral;
    private javax.swing.JButton botonNoAnalizado;
    private javax.swing.JButton botonPastel;
    private javax.swing.JButton botonSadness;
    private javax.swing.JButton botonSurprise;
    // End of variables declaration//GEN-END:variables
}
