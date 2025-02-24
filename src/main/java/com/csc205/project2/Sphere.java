package com.csc205.project2;

public class Sphere extends ThreeDimensionalShape {

    public Sphere(double radius) {
        this.radius = radius;
    }

    //Generate a surface area method for a Sphere class using a radius variable
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    //Generate a volume method for a Cone class using a radius variable
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

}
