package com.company;

public class Main {

    public static void main(String[] args) {

        Point points[] = {new Point(0, 0)};
        Triangle triangle1 = new Triangle(points), triangle2 = new Triangle(points);
        Triangle[] tri = {triangle1, triangle2};
        Grid grid = new Grid(tri);
        System.out.println(grid);
    }
}
