package ec.edu.espe.sea.model;

/**
 *
 * @author AlexanderDuque
 */
public class Sea {

    private String name;
    private String location;
    private float area;
    private float volume;
    private float depht;

    public Sea(String name, String location, float area, float volume, float depht) {
        this.name = name;
        this.location = location;
        this.area = area;
        this.volume = volume;
        this.depht = depht;
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

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(float volume) {
        this.volume = volume;
    }

    /**
     * @return the depht
     */
    public float getDepht() {
        return depht;
    }

    /**
     * @param depht the depht to set
     */
    public void setDepht(float depht) {
        this.depht = depht;
    }
}
