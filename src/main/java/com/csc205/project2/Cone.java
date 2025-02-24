package com.csc205.project2;

public class Cone extends ThreeDimensionalShape{
    public Cone (double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

//Generate a surface area method for a Cone class using radius and height variables
    public double surfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

//Generate a volume method for a Cone class using radius and height variables
    public double volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    //How would I change the abstract class so when it prints out in the main method
    // it does not say threedimensionalshape for each one and says which specific s
    // shape it is?
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append(" radius=").append(radius);
        sb.append(" height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
