package ec.edu.espe.sea.controller;

import ec.edu.espe.sea.model.Sea;
import utills.FileManager;

/**
 *
 * @author AlexanderDuque
 */
public class SeaController {

    public void save(Sea sea) {
        String data = sea.getName() + "," + sea.getLocation() + "," + sea.getArea() + "," + sea.getDepht() + "," + sea.getVolume();
        FileManager.save(data, "sea");
    }

}
