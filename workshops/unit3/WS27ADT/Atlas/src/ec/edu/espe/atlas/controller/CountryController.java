package ec.edu.espe.atlas.controller;

import ec.edu.espe.atlas.model.Country;
import utills.FileManager;

/**
 *
 * @author AlexanderDuque
 */
public class CountryController {

    public void submit(Country country) {
        String data = country.getName() + " , " + country.getLocation() + " , "
                + country.getPresident() + " , " + country.getPopulation()
                + " , " + country.getReligion();
        FileManager.save(data, "Coutries");
    }
}
