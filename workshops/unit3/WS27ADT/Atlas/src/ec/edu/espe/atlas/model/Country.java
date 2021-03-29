package ec.edu.espe.atlas.model;

/**
 *
 * @author AlexanderDuque
 */
public class Country {

    private String name;
    private String location;
    private String currency;
    private String president;
    private int population;
    private String religion;

    public Country(String name, String location, String currency, String president, int population, String religion) {
        this.name = name;
        this.location = location;
        this.currency = currency;
        this.president = president;
        this.population = population;
        this.religion = religion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }
}
