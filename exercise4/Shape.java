package com.MyProg.exercise4;

import com.MyProg.exercise5.Point;

public abstract class Shape {
    private Point point;

    public Shape(Point point){
        this.point = point;
    }

    public void moveBy(double dx, double dy){
        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
    }

    public abstract Point getCenter();


}
