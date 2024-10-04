package tasks;

import static java.lang.Math.PI;

abstract class area {

        public abstract double Area();
        public abstract double Perimeter();
    }

    class Circle extends area {
        private double radius;


        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double Area() {
            return PI * radius * radius;
        }

        @Override
        public double Perimeter()  {
            return 2 * PI * radius;
        }
    }
    class Triangle extends area {
        private double side1;
        private double side2;
        private double side3;

        // Constructor
        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        @Override
        public double Area() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
        @Override
        public double Perimeter() {
            return side1 + side2 + side3;
        }
    }

    class Main {
        public static void main(String[] args) {
            Circle circle = new Circle(5);
            System.out.println("Circle Area: " + circle.Area());
            System.out.println("Circle Perimeter: " + circle.Perimeter());

            Triangle triangle = new Triangle(2, 4, 6);
            System.out.println("Triangle Area: " + triangle.Area());
            System.out.println("Triangle Perimeter: " + triangle.Perimeter());
        }
    }

