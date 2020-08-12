package ua.alevel.planets;

public class PlanetReporter {

    public void gravitationalAccelerationInfo(Planet planet){
        System.out.println("Gravitational Acceleration for " + planet.getClass().getSimpleName() + " is " + planet.getGravitationalAcceleration());
    }

}
