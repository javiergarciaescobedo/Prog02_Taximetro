package es.javiergarciaescobedo.prog02.taximetro;

import coordinateslib.CoordinatesConverter;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.apache.commons.validator.routines.CreditCardValidator;

/**
 * Imagen GPS:
 * https://openclipart.org/detail/191658/gps-for-your-car-by-tmjbeary-191658
 * Imagen bandera verde:
 * https://openclipart.org/detail/62683/green-flag-by-j_alves 
 * 
 * Librería Apache Commons Lang: 
 * https://commons.apache.org/proper/commons-lang 
 * Librería Apache Commons Validator:
 * http://commons.apache.org/proper/commons-validator
 */
public class Main extends javax.swing.JFrame {

    final double TARIFA_MINUTO = 0.50;
    final double BAJADA_BANDERA = 2;
    final double TIPO_IVA = 21;
    Calendar horaBajadaBandera;
    DateFormat formatoHora = DateFormat.getTimeInstance(DateFormat.MEDIUM);
    int contadorTickets = 0;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setResizable(false);
        this.setLocationByPlatform(true);
        ImageIcon img = new javax.swing.ImageIcon(getClass().getResource("res/aiga_taxi.png"));
        this.setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldLatitud = new javax.swing.JTextField();
        jLabelLatitud = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldLongitud = new javax.swing.JTextField();
        jLabelLongitud = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDestino = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTicket = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabelMapaRuta = new javax.swing.JLabel();
        jButtonFinTrayecto = new javax.swing.JButton();
        jButtonBajadaBandera = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldVisa = new javax.swing.JTextField();
        jButtonComprobarTarjeta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Taxímetro");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Posición GPS Inicio"));

        jLabel1.setText("Latitud:");

        jTextFieldLatitud.setColumns(10);
        jTextFieldLatitud.setText("36.679619");
        jTextFieldLatitud.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldLatitudFocusLost(evt);
            }
        });

        jLabelLatitud.setText(" ");

        jLabel2.setText("Longitud:");

        jTextFieldLongitud.setColumns(10);
        jTextFieldLongitud.setText("-5.444740");
        jTextFieldLongitud.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldLongitudFocusLost(evt);
            }
        });

        jLabelLongitud.setText(" ");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/javiergarciaescobedo/prog02/taximetro/res/GPS_inYourCar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLatitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLatitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLongitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLatitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabelLatitud))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelLongitud)))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del trayecto"));

        jLabel4.setText("Destino:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDestino)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextAreaTicket.setColumns(20);
        jTextAreaTicket.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTicket);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Mapa"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelMapaRuta, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelMapaRuta, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jButtonFinTrayecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/javiergarciaescobedo/prog02/taximetro/res/process-stop.png"))); // NOI18N
        jButtonFinTrayecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinTrayectoActionPerformed(evt);
            }
        });

        jButtonBajadaBandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/javiergarciaescobedo/prog02/taximetro/res/green_flag.png"))); // NOI18N
        jButtonBajadaBandera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajadaBanderaActionPerformed(evt);
            }
        });

        jLabel5.setText("Tarjeta de crédito:");

        jTextFieldVisa.setColumns(15);

        jButtonComprobarTarjeta.setText("Comprobar");
        jButtonComprobarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprobarTarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonBajadaBandera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonFinTrayecto))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldVisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonComprobarTarjeta)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonFinTrayecto)
                            .addComponent(jButtonBajadaBandera))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldVisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonComprobarTarjeta))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLatitudFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLatitudFocusLost
        double latitud = Double.valueOf(jTextFieldLatitud.getText());
        jLabelLatitud.setText(CoordinatesConverter.decimalToDMS(latitud));
    }//GEN-LAST:event_jTextFieldLatitudFocusLost

    private void jTextFieldLongitudFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLongitudFocusLost
        double longitud = Double.valueOf(jTextFieldLongitud.getText());
        jLabelLongitud.setText(CoordinatesConverter.decimalToDMS(longitud));
    }//GEN-LAST:event_jTextFieldLongitudFocusLost

    private void jButtonFinTrayectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinTrayectoActionPerformed

        //Configurar botones para dejar taxi libre de nuevo
        jButtonFinTrayecto.setEnabled(false);
        jButtonBajadaBandera.setEnabled(true);

        jTextAreaTicket.append("Hora fin trayecto: ");
        Calendar horaLlegada = Calendar.getInstance();
        jTextAreaTicket.append(formatoHora.format(horaLlegada.getTime()) + "\n");

        jTextAreaTicket.append("Duración trayecto: ");
        long duracionTrayectoMilis = horaLlegada.getTimeInMillis() - horaBajadaBandera.getTimeInMillis();

        jTextAreaTicket.append(DurationFormatUtils.formatDuration(duracionTrayectoMilis, "HH:mm:ss"));

        NumberFormat formatoEuro = NumberFormat.getCurrencyInstance();
        jTextAreaTicket.append("\nTarifa por minuto: " + formatoEuro.format(TARIFA_MINUTO));
        double importe = BAJADA_BANDERA + TARIFA_MINUTO * duracionTrayectoMilis / (1000 * 60.0);
        jTextAreaTicket.append("\n\nImporte: " + formatoEuro.format(importe));
        double iva = importe * TIPO_IVA / 100;
        jTextAreaTicket.append("\nIVA: " + formatoEuro.format(iva));
        double importeTotal = importe + iva;
        jTextAreaTicket.append("\nImporte total: " + formatoEuro.format(importeTotal));

    }//GEN-LAST:event_jButtonFinTrayectoActionPerformed

    private void jButtonBajadaBanderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajadaBanderaActionPerformed
        jButtonBajadaBandera.setEnabled(false);
        jButtonFinTrayecto.setEnabled(true);

        horaBajadaBandera = Calendar.getInstance();

        //Cambia los siguientes valores por las direciones de origen y destino deseadas
        String origen = jTextFieldLatitud.getText() + "," + jTextFieldLongitud.getText();
        String destino = jTextFieldDestino.getText();
        //Hay que sustituir los espacios por el carácter %20 para que se
        //  interprete bien la URL que se generará
        destino = destino.replaceAll(" ", "%20");
        //Cambia el nombre [etiqueta] por el nombre de un objeto JLabel (etiqueta) que
        //  has debido colocar antes en el formulario y que será donde se muestre el mapa.
        //  Deja la etiqueta del formulario sin ningún texto en el diseño.
        javax.swing.JLabel jLabelMapa = jLabelMapaRuta;
        //Indica aquí el tamaño que desees para el mapa
        int tamHorizontal = 200;
        int tamVertical = 200;
        //Puedes encontrar más información sobre el uso de mapas estáticos de Google Maps aquí:
        //  http://code.google.com/intl/es-ES/apis/maps/documentation/staticmaps/

        //A partir de aquí no hace falta cambiar nada
        try {
            String txtDireccionImagenMapa = "http://maps.google.com/maps/api/staticmap?path="
                    + origen + "|" + destino + "&size=" + tamHorizontal + "x" + tamVertical
                    + "&language=ES&sensor=false";
            System.out.println(txtDireccionImagenMapa);
            java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
            java.awt.Image imagenMapa = toolkit.getImage(new java.net.URL(txtDireccionImagenMapa));
            jLabelMapa.setIcon(new javax.swing.ImageIcon(imagenMapa));
        } catch (java.net.MalformedURLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "La dirección de imagen indicada no es correcta");
        }

        //Cabecera del ticket
        jTextAreaTicket.setText("");
        jTextAreaTicket.append("TICKET\n");
        jTextAreaTicket.append("======\n");

        contadorTickets++;

        DecimalFormat formatoTicket = new DecimalFormat("00000");
        jTextAreaTicket.append("Nº ticket: " + formatoTicket.format(contadorTickets) + "\n");

        jTextAreaTicket.append("Fecha: ");
        DateFormat formatoFecha = DateFormat.getDateInstance(DateFormat.MEDIUM);
        jTextAreaTicket.append(formatoFecha.format(horaBajadaBandera.getTime()) + "\n\n");

        jTextAreaTicket.append("Hora bajada bandera: ");
        jTextAreaTicket.append(formatoHora.format(horaBajadaBandera.getTime()) + "\n");
    }//GEN-LAST:event_jButtonBajadaBanderaActionPerformed

    private void jButtonComprobarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprobarTarjetaActionPerformed
        CreditCardValidator ccValidator = new CreditCardValidator();
        boolean visaValida = ccValidator.isValid(jTextFieldVisa.getText());
        String mensaje = visaValida ? "Tarjeta válida" : "Tarjeta no válida";
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_jButtonComprobarTarjetaActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBajadaBandera;
    private javax.swing.JButton jButtonComprobarTarjeta;
    private javax.swing.JButton jButtonFinTrayecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelLatitud;
    private javax.swing.JLabel jLabelLongitud;
    private javax.swing.JLabel jLabelMapaRuta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaTicket;
    private javax.swing.JTextField jTextFieldDestino;
    private javax.swing.JTextField jTextFieldLatitud;
    private javax.swing.JTextField jTextFieldLongitud;
    private javax.swing.JTextField jTextFieldVisa;
    // End of variables declaration//GEN-END:variables
}
