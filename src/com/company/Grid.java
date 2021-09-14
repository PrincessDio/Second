package com.company;

import java.util.Arrays;
import java.util.Vector;

public class Grid {

    Vector <Shape> grid;

    public Grid(Shape[] grid) {
        this.grid = new Vector<Shape>();
        for (int i = 0; i < grid.length; i++)
            this.grid.add(grid[i]);
    }
    public Grid(Vector <Shape> grid) {
        this.grid = grid;
    }

    public Grid() {
        this.grid = new Vector<Shape>();
    }

    public void add_shape(Shape shape) {
        grid.add(shape);
    }

    public void add_shapes(Shape[] shapes) {
        for (Shape shape : shapes)
            grid.add(shape);
    }

    @Override
    public String toString() {
        return "Grid{" +
                "grid=" + Arrays.toString(grid.toArray()) +
                '}';
    }
}
