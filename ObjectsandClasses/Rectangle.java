public class Rectangle {
    // Private Doubles
    private double width, height;

    // Default Constructor/Values: 1
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    //Overloaded Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Mutators and Accessors
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Get Area Return
    public double getArea() {
        return (width * height);
    }

    //Get Perimeter Return
    public double getPerimeter() {
        return (width + height) * 2;
    }
}
