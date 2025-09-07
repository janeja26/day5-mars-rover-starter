package com.afs.tdd;

public class Location {
    private int x;
    private int y;
    private Direction direction;

    public Location(int locationX, int locationY, Direction direction) {
        this.x = locationX;
        this.y=locationY;
        this.direction=direction;

    }
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Direction getDirection(){
        return direction;
    }
}
