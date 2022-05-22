package com.company;

enum ShapeType{
    square, rectangle, circle, trapezoid, rhombus,
    triangle, oval, hexagon
}
public class Task4 {
    public static void main(String[] args) {
        for(ShapeType s: ShapeType.values())
            System.out.println(s + "--" + s.ordinal());
    }
}
