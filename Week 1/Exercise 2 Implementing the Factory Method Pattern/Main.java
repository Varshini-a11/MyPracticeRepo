package com.factory.demo;

public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

        // Create Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Create Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }

	}


