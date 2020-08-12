package ua.alevel.planets;

public class Mars implements Planet {

    private Double gravitationalAcceleration = 3.7;

    @Override
    public Double getGravitationalAcceleration() {
        return gravitationalAcceleration;
    }
}
