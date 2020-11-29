package web.model;

public class Car {
    public String model;
    public String series;
    public int cost;

    public Car(String model, String series, int cost) {
        this.model = model;
        this.series = series;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }



}
