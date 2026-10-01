package ex17.entities;

import ex17.enums.Color;

public class Rectangle extends Shape {

    private Double widht;
    private Double height;

    public Rectangle(){
        super();
    }

    public Rectangle(Color color, Double height, Double widht) {
        super(color);
        this.height = height;
        this.widht = widht;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidht() {
        return widht;
    }

    public void setWidht(Double widht) {
        this.widht = widht;
    }

    @Override
    public double area() {
        return widht * height;
    }

}
