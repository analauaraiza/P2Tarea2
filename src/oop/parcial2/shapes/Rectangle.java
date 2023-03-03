package oop.parcial2.shapes;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape {

    private double base;
    private double height;
    private int sides;

    public Rectangle(){
        super("Rectangulo");
    }

    public Rectangle(double base, double height, int sides){
        this();
        this.base = base;
        this.height = height;
        this.sides = sides;
    }

    public double getArea(){// sobre escritura de metodos -> overriding
        return base * height;
    }
    public double getPerimeter(){
        return base * 2 + height * 2;
    }
    public int getSidesCount(){
        return sides;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String draw(){
        return "█";
    }
}
