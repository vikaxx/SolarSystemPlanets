package ua.alevel.planets;

public class Jupiter implements Planet {

    private Double gravitationalAcceleration = 24.8;

    @Override
    public Double getGravitationalAcceleration() {
        return gravitationalAcceleration;
    }
}
