package web.model;

public class Car {

    private String model;
    private int series;
    private int powerHorse;

    public Car(String model, int series, int powerHorse) {
        this.model = model;
        this.series = series;
        this.powerHorse = powerHorse;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getPowerHorse() {
        return powerHorse;
    }

    public void setPowerHorse(int powerHorse) {
        this.powerHorse = powerHorse;
    }
}
