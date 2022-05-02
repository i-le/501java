public class Exercise10_11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area is " + c1.getArea());
        System.out.println("Perimeter is " + c1.getPerimeter());
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

class Circle2D {
    // Implement your class here
    // creating variables x axis y axis and r for the circle2d
    private double x;
    private double y;
    private double r;

    // no arg constructor circle2d obj with 0 0 1 for default
    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.r = 1;
    }
    // constructor circle
    public Circle2D(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    // return x y r
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getR() {
        return r;
    }

    // set new x y r
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setR(double r) {
        this.r = r;
    }

    // return area
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    // return perimeter
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    // method dot is inside circal
    public boolean contains(double x, double y) {
        return Math.pow(x, 2) > (Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    // method circal is inside circal
    public boolean contains(Circle2D newCircle) {
        return Math.pow(Math.abs(r - newCircle.getR()), 2) >= (Math.pow(newCircle.getX() - x, 2) + Math.pow(newCircle.getY() - y, 2));
    }

    // metod overlaps another circal
    public boolean overlaps(Circle2D overlapCircle) {
        return Math.pow((r + overlapCircle.getR()), 2) >= (Math.pow(overlapCircle.getX() - x, 2) + Math.pow(overlapCircle.getY() - y, 2));
    }
}