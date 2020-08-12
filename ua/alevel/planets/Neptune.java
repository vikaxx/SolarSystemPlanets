package ua.alevel.planets;

public class Neptune implements Planet {

    private Double gravitationalAcceleration = 10.15;

    @Override
    public Double getGravitationalAcceleration() {
        return gravitationalAcceleration;
    }
}
