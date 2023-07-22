package org.example;

public enum SolarSystem {
    MERCURY(0, 12560, null),
    VENUS(13451, 57910000, MERCURY),
    EARTH(66522, 108200000, VENUS),
    MARS(6253, 78340000, EARTH),
    JUPITER(4674, 627700000, MARS),
    SATURN(87475, 12850000, JUPITER),
    URANUS(346, 27250000, SATURN),
    NEPTUNE(8937, 27250000, URANUS);
    public int orderFromSun;
    public final int prevPlanetDistance;
    public final int distanceFromSun;
    public final int radius;
    public final SolarSystem previousPlanet;
    public SolarSystem nextPlanet;

    static {
        for (SolarSystem planet : SolarSystem.values()) {
            planet.orderFromSun = planet.ordinal() + 1;
        }
    }
    SolarSystem(int prevPlanetDistance, int radius, SolarSystem previous) {
        this.prevPlanetDistance = prevPlanetDistance;
        this.previousPlanet = previous;
        this.radius = radius;
        if (previous != null) {
            this.distanceFromSun = previous.getDistanceFromSun() + prevPlanetDistance;
            previous.setNext(this);
        }
        else {
            this.distanceFromSun = 21341;
        }
    }
    private int getDistanceFromSun () {
        return distanceFromSun;
    }
    private void setNext (SolarSystem nextPlanet){
        this.nextPlanet = nextPlanet;
    }
}
