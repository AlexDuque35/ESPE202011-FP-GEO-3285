package ec.edu.espe.carModels.controller;

/**
 *
 * @author AlexanderDuque
 */
public class Search {
    
    public static int findModel(String [] elements, String x) {
        int i;
        int n = elements.length;
        for (i = 0; i < n; i++) {
            if (elements[i] == x) {
                return i;
            }
        }
        return -1;
    }
   
        
    
}
