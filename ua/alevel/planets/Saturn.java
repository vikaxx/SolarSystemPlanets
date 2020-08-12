package ua.alevel.planets;

public class Saturn implements Planet {

    private Double gravitationalAcceleration = 10.4;

    @Override
    public Double getGravitationalAcceleration() {
        return gravitationalAcceleration;
    }
}
