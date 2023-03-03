package oop.parcial2.shapes;

public class Square extends  Shape{

    private double side;
    private int sides;
    public Square(){
        super("Cuadrado");
    }

    public Square(double side, int sides){
        this();
        this.side = side;
        this.sides = sides;
    }
    public double getArea(){
        return side * side;
    }
    public double getPerimeter(){
        return side * 4;
    }
    public int getSidesCount(){
        return sides;
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public String draw(){
        return "■";
    }
}