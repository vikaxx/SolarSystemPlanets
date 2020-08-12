package ua.alevel.planets;

public class Earth implements Planet {

    private Double gravitationalAcceleration = 9.8;
    private Double populationBillions = 7.809;

    public void setPopulationBillions(Double populationBillions) {
        this.populationBillions = populationBillions;
    }

    public Double getPopulationBillions() {
        return populationBillions;
    }

    @Override
    public Double getGravitationalAcceleration() {
        return gravitationalAcceleration;
    }
}
