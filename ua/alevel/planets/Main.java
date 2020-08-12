package ua.alevel.planets;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(new Mercury());
        planets.add(new Venus());
        planets.add(new Earth());
        planets.add(new Mars());
        planets.add(new Jupiter());
        planets.add(new Saturn());
        planets.add(new Uranus());
        planets.add(new Neptune());

        PlanetReporter planetInfo = new PlanetReporter();
        for (Planet planet : planets) {
            planetInfo.gravitationalAccelerationInfo(planet);
        }

    }
}
