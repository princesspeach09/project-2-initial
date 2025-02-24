package com.csc205.project2;

public abstract class ThreeDimensionalShape {

    public double radius;
    public double width;
    public double height;


    public ThreeDimensionalShape() {
        this.radius = 0.0;
        this.width = 0.0;
        this.height = 0.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double x) {
        this.radius = x;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double y) {
        this.width = y;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double z) {
        this.height = z;
    }

    public abstract double surfaceArea();

    public abstract double volume();

    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append(" radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

}
