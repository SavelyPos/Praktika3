package com.company;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){};

    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth()
    {
        return width;
    }

    public double getLength()
    {
        return length;
    }

    public void setWidth()
    {
        this.width = width;
    }

    public void setLength()
    {
        this.length = length;
    }

    @Override
    public double getArea()
    {
        return width*length;
    }

    @Override
    public double getPerimeter()
    {
        return (width+length)*2;
    }

    @Override
    public String toString()
    {
        return "Area of rectangle: " + getArea()
                + "\nPerimeter of rectangle: " + getPerimeter()
                + "\nWight of rectangle: " + getWidth()
                + "\nLength of rectangle: " + getLength()
                + "\nColor of rectangle: " + this.getColor();
    }
}