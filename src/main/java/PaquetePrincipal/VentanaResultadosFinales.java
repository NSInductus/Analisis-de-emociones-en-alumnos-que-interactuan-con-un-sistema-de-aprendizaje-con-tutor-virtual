/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaquetePrincipal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author angel
 */
public class VentanaResultadosFinales extends javax.swing.JFrame {

    /**
     * Creates new form VentanaSeguimiento
     */
    public VentanaResultadosFinales() {
        initComponents();
        actualizar();
    }
    
    public void mostrarMensaje(int tipo){
        
        if(tipo==1){
        
                //ERROR (AVISO) DESEADO
                Principal.error = "HA TERMINADO EL PROCESO DE ESCRITURA EN DATASETUNICO";

                //CREACIÓN VENTANA DE ERROR
                VentanaAviso ventana_aviso = new VentanaAviso();
                
                //PONER LA VENTANA DE TAMAÑO FIJO
                ventana_aviso.setResizable(false);

                //PONER VISIBLE LA VENTANA
                ventana_aviso.setVisible(true);  
                
                
        }else if (tipo==0){
            
                                   //ERROR (AVISO) DESEADO
                Principal.error = "NO SE PUEDE SOBREESCRIBIR POR ALGUNO DE LOS SIGUIENTES MOTIVOS:"
                        + " \n 1.PORQUE EL ARCHIVO ESTA ABIERTO, PORFAVOR CIERRELO E INTENTELO DE NUEVO"
                        + "\n 2.PORQUE EL ARCHIVO SE HA DAÑADO, PORFAVOR COMPRUEBELO O CREE UN NUEVO DATASETUNICO EN "
                        + "OTRA UBICACIÓN";

                //CREACIÓN VENTANA DE ERROR
                VentanaError ventana_error = new VentanaError();
                
                //PONER LA VENTANA DE TAMAÑO FIJO
                ventana_error.setResizable(false);

                //PONER VISIBLE LA VENTANA
                ventana_error.setVisible(true);  
                
            
            
        }
    }
    
    public void procesoDatasetUnico(){
        
                //clase FuncionesResultados auxiliar para poder realizar todas las operaciones
        FuncionesResultados aux = new FuncionesResultados();
        
        aux.crearResultadosPorcentajes();
        
        //Comprobacion de si existe o no el dataset unico para almacenar los resultados de todos los videos juntos
        boolean existe = aux.existeDatasetUnico();
        
        //Tipo de mensaje a mostrar
        int tipo = 0 ;
        
        //Creacion y relleno de la nueva fila de datos que entrará al dataset unico
        ArrayList<Double> nuevosDatos = new ArrayList<>();
        nuevosDatos = aux.rellenarVectorDatasetUnico();
        
        //Creacion y relleno del nombre del video que se introducira en el dataset unico
        String videoNuevo = Principal.nombreFichero;
      
        //Si ya existe el dataset unico
        if(existe == true){
            
            //se cargan los datos del dataset unico existente
            try {
                aux.cargarDatasetUnico();
            } catch (IOException ex) {
                Logger.getLogger(VentanaResultadosFinales.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("gokuu");
                
            }
	
            //Se sobreescribe el dataset unico con los datos anteriores mas los nuevos
            try {
                aux.agregarADatasetUnico(nuevosDatos, videoNuevo);
                tipo = 1;
            } catch (IOException ex) {
                Logger.getLogger(VentanaResultadosFinales.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        //Si NO existe el dataset unico
        }else{
            
            System.out.println("NO EXISTE EL DATASET, POR LO TANTO SE ESTÁ CREANDO");
            //Creamos el dataset unico con la fila de datos de este video
            try {
                aux.crearDatasetUnico(nuevosDatos, videoNuevo);
                tipo = 1 ;
            } catch (IOException ex) {
                Logger.getLogger(VentanaResultadosFinales.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        mostrarMensaje(tipo);
        
    }
    
    public void actualizar(){
        
        valorAnger.setText(Integer.toString(Principal.angerContador));
        valorContempt.setText(Integer.toString(Principal.contemptContador));
        valorDisgust.setText(Integer.toString(Principal.disgustContador));
        valorFear.setText(Integer.toString(Principal.fearContador));
        valorHappiness.setText(Integer.toString(Principal.happinessContador));
        valorNeutral.setText(Integer.toString(Principal.neutralContador));
        valorSadness.setText(Integer.toString(Principal.sadnessContador));
        valorSurprise.setText(Integer.toString(Principal.surpriseContador));
        valorNo.setText(Integer.toString(Principal.noAnalizadoContador));
        valorTotal.setText(Integer.toString(Principal.nFotosAnalizadas));
        
        etiquetaNo.setText("not analysed");

        etiquetaTotal.setText("total analysed");
        
        
    }
    
        public void actualizarPorcentajes(){
            
           // System.out.println(String.format("%.2f", number));
        valorAnger.setText(String.format("%.2f", Principal.angerContadorPorcentaje));
        //valorAnger.setText(Double.toString(Principal.angerContadorPorcentaje));
        valorContempt.setText(String.format("%.2f",Principal.contemptContadorPorcentaje));
        valorDisgust.setText(String.format("%.2f",Principal.disgustContadorPorcentaje));
        valorFear.setText(String.format("%.2f",Principal.fearContadorPorcentaje));
        valorHappiness.setText(String.format("%.2f",Principal.happinessContadorPorcentaje));
        valorNeutral.setText(String.format("%.2f",Principal.neutralContadorPorcentaje));
        valorSadness.setText(String.format("%.2f",Principal.sadnessContadorPorcentaje));
        valorSurprise.setText(String.format("%.2f",Principal.surpriseContadorPorcentaje));
        
        etiquetaNo.setText("Useful");
        valorNo.setText(Integer.toString(Principal.nFotosAnalizadas - Principal.noAnalizadoContador));
        valorTotal.setText(" ");
        etiquetaTotal.setText("");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaDisgust = new javax.swing.JLabel();
        etiquetaAnger = new javax.swing.JLabel();
        etiquetaContempt = new javax.swing.JLabel();
        etiquetaHappiness = new javax.swing.JLabel();
        etiquetaFear = new javax.swing.JLabel();
        etiquetaNeutral = new javax.swing.JLabel();
        etiquetaNo = new javax.swing.JLabel();
        etiquetaSadness = new javax.swing.JLabel();
        etiquetaSurprise = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        valorAnger = new javax.swing.JLabel();
        valorContempt = new javax.swing.JLabel();
        valorSadness = new javax.swing.JLabel();
        valorDisgust = new javax.swing.JLabel();
        valorFear = new javax.swing.JLabel();
        valorHappiness = new javax.swing.JLabel();
        valorNeutral = new javax.swing.JLabel();
        valorTotal = new javax.swing.JLabel();
        valorSurprise = new javax.swing.JLabel();
        valorNo = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();
        botonXLSX = new javax.swing.JButton();
        resultadosTXT = new javax.swing.JButton();
        resultadosAtras = new javax.swing.JButton();
        botonPorcentajes = new javax.swing.JButton();
        botonTotales = new javax.swing.JButton();
        datasetTotal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VENTANA DE RESULTADOS");

        etiquetaDisgust.setText("disgust");

        etiquetaAnger.setText("anger");

        etiquetaContempt.setText("contempt");

        etiquetaHappiness.setText("happiness");

        etiquetaFear.setText("fear");

        etiquetaNeutral.setText("neutral");

        etiquetaNo.setText("not analysed");

        etiquetaSadness.setText("sadness");

        etiquetaSurprise.setText("surprise");

        etiquetaTotal.setText("total analysed");

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaTitulo.setText("RESULTADOS FINALES");

        botonXLSX.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonXLSX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/disquete32.png"))); // NOI18N
        botonXLSX.setText("A XLSX");
        botonXLSX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonXLSX.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonXLSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonXLSXActionPerformed(evt);
            }
        });

        resultadosTXT.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        resultadosTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/disquete32.png"))); // NOI18N
        resultadosTXT.setText("A TXT");
        resultadosTXT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resultadosTXT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        resultadosTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadosTXTActionPerformed(evt);
            }
        });

        resultadosAtras.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        resultadosAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atras32.png"))); // NOI18N
        resultadosAtras.setText("ATRÁS");
        resultadosAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resultadosAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        resultadosAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadosAtrasActionPerformed(evt);
            }
        });

        botonPorcentajes.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonPorcentajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formato32.png"))); // NOI18N
        botonPorcentajes.setText("%");
        botonPorcentajes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPorcentajes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonPorcentajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPorcentajesActionPerformed(evt);
            }
        });

        botonTotales.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        botonTotales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formato32.png"))); // NOI18N
        botonTotales.setText("totales");
        botonTotales.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonTotales.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTotalesActionPerformed(evt);
            }
        });

        datasetTotal.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        datasetTotal.setText("AÑADIR A DATASET UNICO");
        datasetTotal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        datasetTotal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        datasetTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datasetTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorFear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaDisgust, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorDisgust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaContempt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorContempt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaAnger, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorAnger, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaHappiness, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorHappiness, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaSurprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaSadness, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaNeutral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(valorNo, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(valorSurprise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorSadness, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorNeutral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(datasetTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonPorcentajes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonXLSX, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resultadosTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(resultadosAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaAnger, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorAnger, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaContempt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorContempt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaDisgust, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorDisgust, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorFear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaHappiness, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorHappiness, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaNeutral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorNeutral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaSadness, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorSadness, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaSurprise, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorSurprise, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonPorcentajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resultadosTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonXLSX, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(resultadosAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datasetTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonXLSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonXLSXActionPerformed
        // TODO add your handling code here:

        new FuncionesResultados().crearDataset(Principal.formatoResultado);


    }//GEN-LAST:event_botonXLSXActionPerformed

    private void resultadosTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadosTXTActionPerformed
        try {
            // TODO add your handling code here:

            new FuncionesResultados().resultadosTXT(Principal.formatoResultado);
        } catch (IOException ex) {
            Logger.getLogger(VentanaResultadosFinales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_resultadosTXTActionPerformed

    private void resultadosAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadosAtrasActionPerformed
        // TODO add your handling code here:
        Principal.ventana_resultados.setVisible(false);
        
    }//GEN-LAST:event_resultadosAtrasActionPerformed

    private void botonPorcentajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPorcentajesActionPerformed
        // TODO add your handling code here:
        
        //para probar
        //Principal.angerContador++;
        
        new FuncionesResultados().crearResultadosPorcentajes();
        actualizarPorcentajes();
        Principal.formatoResultado=2;
        new Funciones().imprimir("Porcentajes", "Porcentajes");
        
        
    }//GEN-LAST:event_botonPorcentajesActionPerformed

    private void botonTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTotalesActionPerformed
        // TODO add your handling code here:
        actualizar();
        Principal.formatoResultado=1;
    }//GEN-LAST:event_botonTotalesActionPerformed

    private void datasetTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datasetTotalActionPerformed
        // TODO add your handling code here:
        

      //  mensajeAviso();
         
        procesoDatasetUnico();
        

        
    }//GEN-LAST:event_datasetTotalActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaResultadosFinales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaResultadosFinales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaResultadosFinales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaResultadosFinales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaResultadosFinales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonPorcentajes;
    private javax.swing.JButton botonTotales;
    private javax.swing.JButton botonXLSX;
    private javax.swing.JButton datasetTotal;
    private javax.swing.JLabel etiquetaAnger;
    private javax.swing.JLabel etiquetaContempt;
    private javax.swing.JLabel etiquetaDisgust;
    private javax.swing.JLabel etiquetaFear;
    private javax.swing.JLabel etiquetaHappiness;
    private javax.swing.JLabel etiquetaNeutral;
    private javax.swing.JLabel etiquetaNo;
    private javax.swing.JLabel etiquetaSadness;
    private javax.swing.JLabel etiquetaSurprise;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel etiquetaTotal;
    private javax.swing.JButton resultadosAtras;
    private javax.swing.JButton resultadosTXT;
    private javax.swing.JLabel valorAnger;
    private javax.swing.JLabel valorContempt;
    private javax.swing.JLabel valorDisgust;
    private javax.swing.JLabel valorFear;
    private javax.swing.JLabel valorHappiness;
    private javax.swing.JLabel valorNeutral;
    private javax.swing.JLabel valorNo;
    private javax.swing.JLabel valorSadness;
    private javax.swing.JLabel valorSurprise;
    private javax.swing.JLabel valorTotal;
    // End of variables declaration//GEN-END:variables
}
