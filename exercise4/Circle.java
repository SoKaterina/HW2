package com.MyProg.exercise4;

import com.MyProg.exercise5.Point;

public class Circle extends Shape implements Cloneable {
    private Point center;
    private double radius;

    public Circle(Point center, double radius){
        super(center);
        this.radius = radius;
    }

    public Point getCenter(){
        return center;
    }

    public Circle clone() throws CloneNotSupportedException{
        return (Circle) super.clone();
    }
}
