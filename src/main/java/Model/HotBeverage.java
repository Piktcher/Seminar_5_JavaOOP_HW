package Model;

public class HotBeverage extends Beverage{

    private int temperature;

    public HotBeverage(String name, String volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + " " + temperature + "гр.";
    }

    public HotBeverage() {}

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


}
