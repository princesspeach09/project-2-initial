package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

public class Project2 {

    public static void main(String[] args) {


        ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(1.0, 4.0);
        ThreeDimensionalShape cone = new Cone(2.0, 3.0);


        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);


        System.out.println(sphere);
        System.out.println(cube);
        System.out.println(cylinder);
        System.out.println(cone);
    }
}