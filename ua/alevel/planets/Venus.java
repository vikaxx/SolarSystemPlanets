package ua.alevel.planets;

public class Venus implements Planet {

    private Double gravitationalAcceleration = 8.87;

    @Override
    public Double getGravitationalAcceleration() {
        return gravitationalAcceleration;
    }
}
