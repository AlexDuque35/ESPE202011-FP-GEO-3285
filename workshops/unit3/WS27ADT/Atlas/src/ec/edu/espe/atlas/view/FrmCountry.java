package ec.edu.espe.atlas.view;

import ec.edu.espe.atlas.controller.CountryController;
import ec.edu.espe.atlas.model.Country;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author AlexanderDuque
 */
public class FrmCountry extends javax.swing.JFrame {

    public FrmCountry() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BtmSubmit = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtPresident = new javax.swing.JTextField();
        txtCurrency = new javax.swing.JTextField();
        txtPopulation = new javax.swing.JTextField();
        txtReligion = new javax.swing.JTextField();
        CmbLocation = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDisplayCountries = new javax.swing.JTextArea();
        BtmShowAtlas = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ATLAS - COUNTRY");

        jLabel2.setText("COUNTRY:");

        jLabel3.setText("LOCATION:");

        jLabel4.setText("CURRENCY:");

        jLabel5.setText("PRESIDENT:");

        jLabel6.setText("POPULATION:");

        jLabel7.setText("RELIGION:");

        BtmSubmit.setText("SUBMIT");
        BtmSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmSubmitActionPerformed(evt);
            }
        });

        CmbLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Africa", "Asia", "Central America and Caribe", "Europe", "Oceania", "North America", "South America" }));

        txtDisplayCountries.setColumns(20);
        txtDisplayCountries.setRows(5);
        jScrollPane1.setViewportView(txtDisplayCountries);

        BtmShowAtlas.setText("SHOW ATLAS");
        BtmShowAtlas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmShowAtlasActionPerformed(evt);
            }
        });

        jLabel8.setText("DISPLAY COUNTRIES:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(BtmSubmit)
                        .addGap(68, 68, 68)
                        .addComponent(BtmShowAtlas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPopulation)
                                            .addComponent(txtPresident)
                                            .addComponent(txtReligion)
                                            .addComponent(txtName)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(CmbLocation, javax.swing.GroupLayout.Alignment.LEADING, 0, 168, Short.MAX_VALUE)
                                                .addComponent(txtCurrency, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPresident, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtmSubmit)
                            .addComponent(BtmShowAtlas)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtmSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmSubmitActionPerformed

        Country country;
        String name;
        String location;
        String currency;
        String president;
        int population;
        String religion;
        CountryController countryController = new CountryController();

        name = txtName.getText();
        location = CmbLocation.getSelectedItem().toString();
        currency = txtCurrency.getText();
        president = txtPresident.getText();
        population = Integer.parseInt(txtPopulation.getText());
        religion = txtReligion.getText();

        country = new Country(name, location, currency, president, population, religion);

        countryController.submit(country);

        JOptionPane.showMessageDialog(rootPane, country.getName());

    }//GEN-LAST:event_BtmSubmitActionPerformed

    private void BtmShowAtlasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmShowAtlasActionPerformed

        File file = new File("C:\\Users\\aduqu\\Desktop\\THE X CODE\\ESPE202011-FP-GEO-3285\\workshops\\unit3\\WS27ADT\\Atlas\\Coutries.txt");
        
        try {
            BufferedReader read = new BufferedReader(new FileReader(file));
            String line = read.readLine();
            while (line != null) {
                txtDisplayCountries.append(line + "\n");
                line = read.readLine();
            }
        } catch (Exception ex) {
            Logger.getLogger(FrmCountry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtmShowAtlasActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCountry.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCountry.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCountry.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCountry.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCountry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtmShowAtlas;
    private javax.swing.JButton BtmSubmit;
    private javax.swing.JComboBox<String> CmbLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCurrency;
    private javax.swing.JTextArea txtDisplayCountries;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPopulation;
    private javax.swing.JTextField txtPresident;
    private javax.swing.JTextField txtReligion;
    // End of variables declaration//GEN-END:variables
}
