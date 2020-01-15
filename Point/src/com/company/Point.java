package com.company;

public class Point {
    private int x,y;

    public Point(){
    }

    public Point (int p1,int p2){
        this.x = p1;
        this.y = p2;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int p1){
        this.x = p1;
    }

    public void setY(int p2){
        this.y = p2;
    }

    public double distance(){
        double distance = Math.sqrt((this.x*this.x) + (this.y*this.y));
        System.out.println(distance);
        return distance;
    }

    public double distance(int x  , int y){
        double distance = Math.sqrt(((this.x - x)*(this.x - x)) + ((this.y - y)*(this.y-y)));
        System.out.println(distance);
        return distance;
    }

    public double distance (Point p){
        double distance = Math.sqrt(((p.x - this.x)*(p.x - this.x)) - ((p.y - this.y)*(p.y - this.y)));
        System.out.println(distance);
        return distance;

    }




}
