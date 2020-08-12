package ua.alevel.planets;

public class Mercury implements Planet {

    private Double gravitationalAcceleration = 3.7;

    @Override
    public Double getGravitationalAcceleration() {
        return gravitationalAcceleration;
    }
}
