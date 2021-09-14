package com.company;

abstract public class Shape {

    protected Point pos;
    protected Point[] points;
    protected String name;

    public Shape(Point[] points) {
        this.points = points;
        Point pos = new Point();
        for (Point point : points) {
            pos.add(point);
        }
        pos.setX(pos.getX() / points.length);
        pos.setY(pos.getY() / points.length);
        this.pos = pos;
    }

    public Point getPos() {
        return pos;
    }

    public void move(Point pos) {
        double x = this.pos.getX() - pos.getX();
        double y = this.pos.getY() - pos.getY();
        Point vector = new Point(x, y);
        this.pos = pos;
        for (int i = 0; i < points.length; i++) {
            points[i].add(vector);
        }
    }

    @Override
    public String toString() {
        return "Shape{" +
                "pos=" + pos +
                ", name='" + name + '\'' +
                '}';
    }
}
