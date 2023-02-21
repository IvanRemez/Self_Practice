package day30_Inheritance2.PlanetTask;

public class Planet {

    private String name, mass, surfaceGravity, surfaceArea;
    private double radius, volume;
    private int population;

    public Planet(String name, String mass, String surfaceGravity, String surfaceArea, double radius, double volume, int population) {
        setName(name);
        setMass(mass);
        setSurfaceGravity(surfaceGravity);
        setSurfaceArea(surfaceArea);
        setRadius(radius);
        setVolume(volume);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getSurfaceGravity() {
        return surfaceGravity;
    }

    public void setSurfaceGravity(String surfaceGravity) {
        this.surfaceGravity = surfaceGravity;
    }

    public String getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(String surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass='" + mass + '\'' +
                ", surfaceGravity='" + surfaceGravity + '\'' +
                ", surfaceArea='" + surfaceArea + '\'' +
                ", radius=" + radius +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}
/*
planetTask:
	1. create a class called Planet
			variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			Encapsulate all the fields

			Add a constructor that can set all the fields

			methods:
				toString()

	2. create the following subclasses of Planet
			1. Earth
			2. Moon
			3. Mercury
			4. Venus

			Note: you can search them on google

 */