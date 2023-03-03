package oop.parcial2.shapes;

public class Circle extends Shape{

    private double radio;
    private int sides;
    public Circle(){
        super("Circulo");
    }

    public Circle(double radio, int sides){
        this();
        this.radio = radio;
        this.sides = sides;
    }
    public double getArea(){
        return Math.PI * radio * radio;
    }
    public double getPerimeter(){
        return Math.PI * radio * 2;
    }

    public int getSidesCount(){
        return sides;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String draw(){
        return "○";
    }
}
