package com.company;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
        this.radius = radius;
    }

    public String toString()
    {
        return "Radius: " + radius +
                "\ncoord_X: " + center.x +
                "\ncoord_Y: " + center.y +
                "\nxSpeed: " + center.xSpeed +
                "\nySpeed: " + center.ySpeed;
    }

    @Override
    public void moveUp()
    {
        center.moveUp();
    }

    @Override
    public void moveDown()
    {
        center.moveDown();
    }

    @Override
    public void moveLeft()
    {
        center.moveLeft();
    }

    @Override
    public void moveRight()
    {
        center.moveRight();
    }
}