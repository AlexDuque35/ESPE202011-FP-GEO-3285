package ec.edu.espe.atlas.view;

import ec.edu.espe.atlas.controller.CountryController;
import ec.edu.espe.atlas.model.Country;
import javax.swing.JOptionPane;
import utills.FileManager;

/**
 *
 * @author AlexanderDuque
 */
public class FrmCountry extends javax.swing.JFrame {

    public FrmCountry() {
        initComponents();
        CountryController countryController = new CountryController();
        String[] lines = new String[FileManager.countLines("countries")];
        Country[] countries = new Country[FileManager.countLines("countries")];

        countryController.read(lines, countries);

        countryController.populateCountriesTable(tblCountries, countries);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCountries = new javax.swing.JTable();
        BtmFindACountry = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

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

        tblCountries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblCountries);

        BtmFindACountry.setText("FIND A COUNTRY");
        BtmFindACountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmFindACountryActionPerformed(evt);
            }
        });

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
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                            .addComponent(CmbLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtCurrency)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(BtmShowAtlas)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtmFindACountry)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BtmSubmit)
                                .addComponent(jLabel8)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtmSubmit)
                            .addComponent(BtmShowAtlas)
                            .addComponent(BtmFindACountry)))
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

        countryController.save(country);

        JOptionPane.showMessageDialog(rootPane, country.getName());

        emptyFields();
        BtmShowAtlasActionPerformed(evt);
//        countryController.populateCountriesTable(tblCountries, countries);

    }//GEN-LAST:event_BtmSubmitActionPerformed

    private void BtmShowAtlasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmShowAtlasActionPerformed

        String[] lines = new String[FileManager.countLines("country")];
        CountryController countryController = new CountryController();
        Country[] countries = new Country[FileManager.countLines("country")];

        countryController.read(lines, countries);

        for (Country country : countries) {
            txtDisplayCountries.setText(txtDisplayCountries.getText() + "\n" + country.getName());
        }

        countryController.populateCountriesTable(tblCountries, countries);
    }//GEN-LAST:event_BtmShowAtlasActionPerformed

    private void BtmFindACountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmFindACountryActionPerformed

        String[] lines = new String[FileManager.countLines("countries")];
        CountryController countryController = new CountryController();
        Country[] countries = new Country[FileManager.countLines("countries")];
        countryController.read(lines, countries);
        int index = countryController.find(countries, txtName.getText());
        if (index == -1) {
            JOptionPane.showMessageDialog(rootPane, "NOT FOUND", "NOT FOUND", JOptionPane.ERROR_MESSAGE);
        } else {
            tblCountries.setRowSelectionInterval(index, index);
        }
    }//GEN-LAST:event_BtmFindACountryActionPerformed

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

    private void emptyFields() {
        txtName.setText("Nill");
        CmbLocation.setSelectedItem("Choose");
        txtCurrency.setText("");
        txtPresident.setText("");
        txtPopulation.setText("");
        txtReligion.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtmFindACountry;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblCountries;
    private javax.swing.JTextField txtCurrency;
    private javax.swing.JTextArea txtDisplayCountries;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPopulation;
    private javax.swing.JTextField txtPresident;
    private javax.swing.JTextField txtReligion;
    // End of variables declaration//GEN-END:variables
}
