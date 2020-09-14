package com.company;

public class MovableRectangle implements  Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft.x = x1;
        topLeft.y = y1;
        bottomRight.x = x2;
        bottomRight.y = y2;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }

    public String toString()
    {
        return "coord_X1: " + topLeft.x +
                "\ncoord_Y1: " + topLeft.y +
                "\ncoord_X2: " + bottomRight.x +
                "\ncoord_Y2: " + bottomRight.y +
                "\nx1_speed: " + topLeft.xSpeed +
                "\ny1_speed: " + topLeft.ySpeed +
                "\nx2_speed: " + bottomRight.xSpeed +
                "\ny2_speed: " + bottomRight.ySpeed;
    }

    public boolean Speed()
    {
        if((topLeft.xSpeed == bottomRight.xSpeed) && (topLeft.ySpeed == bottomRight.ySpeed))
            return true;
        else
            return false;
    }

    @Override
    public void moveUp()
    {
        if(Speed())
        {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
        else
            return;
    }

    @Override
    public void moveDown()
    {
        if(Speed())
        {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
        else
            return;
    }

    @Override
    public void moveLeft()
    {
        if(Speed())
        {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
        else
            return;
    }

    @Override
    public void moveRight()
    {
        if(Speed())
        {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
        else
            return;
    }
}