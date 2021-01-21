package com.andy.principle.demo5;

public class OpenClose {

    public static void main(String[] args) {

        Draw draw = new Draw();
        draw.drawShape(new Circular());
        draw.drawShape(new Rectangular());
        draw.drawShape(new Triangle());

    }
}

class Shape {

    int type;

}

class Draw {

    public void drawShape(Shape shape) {
        if (shape.type == 1) {
            draw1(shape);
        } else if (shape.type == 2) {
            draw2(shape);
        } else if (shape.type == 3) {
            draw2(shape);
        }
    }

    public void draw1(Shape shape) {
        System.out.println(shape.type+"圆形");
    }

    public void draw2(Shape shape) {
        System.out.println(shape.type+"矩形");
    }

    public void draw3(Shape shape) {
        System.out.println(shape.type+"三角形");
    }

}

class Circular extends Shape {

    public Circular() {

        super.type = 1;

    }
}

class Rectangular extends Shape {

    public Rectangular() {

        super.type = 2;

    }
}

class Triangle extends Shape {

    public Triangle() {

        super.type = 3;

    }
}
