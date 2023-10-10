package Model;

public abstract class Beverage {
    private String name;
    private String volume;

    public Beverage(String name, String volume) {
        this.name = name;
        this.volume = volume;
    }
    public Beverage() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return name + " " +
                volume;
    }
}
