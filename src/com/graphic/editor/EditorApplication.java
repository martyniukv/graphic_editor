package com.graphic.editor;

import com.graphic.editor.shapes.*;

public class EditorApplication {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape rhombus = new Rhombus();
        Shape square = new Square();
        Shape triangle = new Triangle();
        ShapeReader reader = new ShapeReader();
        Shape[] shapeArray = { circle,rectangle,rhombus,square,triangle};
        for (int i = 0; i < shapeArray.length; i++) {
            Shape shape = shapeArray[i];
            reader.read(shape);
        }
    }
}
