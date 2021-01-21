package com.andy.principle.demo5.improve;

public class OpenClose {

    public static void main(String[] args) {

        Draw draw = new Draw();
        draw.drawShape(new Circular());
        draw.drawShape(new Rectangular());
        draw.drawShape(new Triangle());
        draw.drawShape(new Other());

    }
}

abstract class Shape {

    int type;

    public abstract void draw();
}

class Draw {

    public void drawShape(Shape shape) {
        shape.draw();
    }

}

class Circular extends Shape {

    public Circular() {

        super.type = 1;

    }

    @Override
    public void draw() {
        System.out.println(super.type+"圆形");
    }
}

class Rectangular extends Shape {

    public Rectangular() {

        super.type = 2;

    }

    @Override
    public void draw() {
        System.out.println(super.type+"矩形");
    }
}

class Triangle extends Shape {

    public Triangle() {

        super.type = 3;

    }

    @Override
    public void draw() {
        System.out.println(super.type+"三角形");
    }
}

class Other extends Shape{

    @Override
    public void draw() {
        System.out.println("其他形状");
    }
}
