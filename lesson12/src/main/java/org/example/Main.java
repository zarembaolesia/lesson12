package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the name of the planet in caps");
        Scanner scanner = new Scanner(System.in);
        SolarSystem solar = SolarSystem.valueOf(scanner.nextLine());System.out.println("name is " + solar + ", order from Sun is " + solar.orderFromSun + ", radius is " + solar.radius + ", distance to previous planet is: " + solar.prevPlanetDistance + ", distance from Sun is: " + solar.distanceFromSun + ", radius is: " + solar.radius + ", previous planet is: " + solar.previousPlanet + ", next planet is: " + solar.nextPlanet);
    }
}