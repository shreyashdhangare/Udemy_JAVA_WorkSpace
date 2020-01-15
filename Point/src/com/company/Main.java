package com.company;

import java.awt.Point;

public class Main {

    public static void main(String[] args) {

    Point p1 = new Point(0,0);
    Point p3 = new Point(1, -1);
    Point p2 = new Point(4, 3);

        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p1.distance(4,3));
        System.out.println(p1.distance(p2));
        //System.out.println(p3.distance());
    }
}
