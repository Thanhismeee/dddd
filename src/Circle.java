public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void input(Validation valid) {
        this.radius = valid.checkInputDouble("Please enter the radius of the Circle: ");
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printResult() {
        System.out.println("----Circle-----");
        System.out.println("Radius: " + radius);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }
}
