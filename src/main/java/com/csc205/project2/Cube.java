package com.csc205.project2;

public class Cube extends ThreeDimensionalShape {

    public Cube(double width) {
        this.width = width;
    }

    //Generate a surface area method for a Cube class using a width variable
    public double surfaceArea() {
        return 6 * Math.pow(width, 2);
    }
    //Generate a volume method for a Cube class using a width variable
    public double volume() {
        return Math.pow(width, 3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append(" width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}



