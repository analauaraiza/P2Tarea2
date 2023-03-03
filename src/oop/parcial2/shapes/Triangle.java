package oop.parcial2.shapes;


public class Triangle extends Shape {

    private double base;
    private double height;
    private int sides;

    public Triangle(){
        super("Triangulo");
    }
    public Triangle(double base, double height, int sides){
        this();
        this.base = base;
        this.height = height;
        this.sides = sides;
    }
    public double getArea(){
        return base * height / 2;
    }
    public double getPerimeter(){
        return 0;
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
        return "▲";
    }
}

