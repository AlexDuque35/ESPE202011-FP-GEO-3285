package ec.edu.espe.atlas.controller;

import ec.edu.espe.atlas.model.Country;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utills.FileManager;

/**
 *
 * @author AlexanderDuque
 */
public class CountryController {

    public void save(Country country) {

        Country[] countries = new Country[FileManager.countLines("countries")];
        String[] rows = new String[FileManager.countLines("countries")];
        read(rows, countries);
        if (find(countries, country.getName()) != -1) {
            JOptionPane.showMessageDialog(null, "Country -> " + country.getName()
                    + " <- already exists", "USE OTHER NAME", JOptionPane.CANCEL_OPTION);
            return;
        } else {
            String data = country.getName() + ", " + country.getLocation() + ", "
                    + country.getPresident() + ", " + country.getPopulation()
                    + ", " + country.getReligion();
            FileManager.save(data, "countries");
        }
    }

    public void read(String[] data, Country[] countries) {

        FileManager.readLines("countries", data);

        for (int i = 0; i < data.length; i++) {

            String[] dataForCountry = data[i].split(", ");

            String name = dataForCountry[0];
            String location = dataForCountry[1];
            String currency = dataForCountry[2];
            String president = dataForCountry[3];
            int population;
            population = Integer.parseInt(dataForCountry[4]);
            String religion = dataForCountry[5];

            countries[i] = new Country(name, location, currency, president, population, religion);
        }
    }

    public int find(Country[] countries, String name) {
        for (int i = 0; i < countries.length; i++) {
            if (name.equals(countries[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public void populateCountriesTable(JTable jTable, Country[] countries) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        Object rowData[] = new Object[countries.length];
        for (Country country : countries) {
            rowData[0] = country.getName();
            rowData[1] = country.getLocation();
            rowData[2] = country.getCurrency();
            rowData[3] = country.getPresident();
            rowData[4] = country.getPopulation();
            rowData[5] = country.getReligion();
            model.addRow(rowData);
        }
    }
}
