/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad11;

/**
 *
 * @author abii_
 */
class Square extends Shape{
    protected double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double area() {
        return sideLength * sideLength;
    }

    public double perimeter() {
        return sideLength * 4;
    }
}
