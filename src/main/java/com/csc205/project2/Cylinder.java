package com.csc205.project2;

public class Cylinder extends ThreeDimensionalShape {

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    //Generate a surface area method for a Cylinder class using radius and height variables
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    //Generate a volume method for a Cylinder class using radius and height variables
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

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


