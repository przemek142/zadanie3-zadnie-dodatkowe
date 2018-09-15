public class ZadanieJava5 {

    public static void main(String[] args) {

        ShapeCalculator calculator = new ShapeCalculator();
        Circle circle = new Circle(1.0);
        Rectangle rectangle = new Rectangle(1.0, 2.0);
        Square square = new Square(3.0);
        Triangle triangle = new Triangle(1.0, 2.0, 3.0, 4.0);

        System.out.printf("Square Area: %.2f,\nCircle Area: %.2f,\nTriangle Perimeter: %.2f,\nRectangle Perimeter: %.2f\n",
                calculator.squareArea(square),
                calculator.circleArea(circle),
                calculator.trianglePerimeter(triangle),
                calculator.rectPerimeter(rectangle));

    }

}
