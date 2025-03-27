package q2;


public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length=length;
        this.width=width;
    }
    public void setLength(double length) {
        this.length=length;
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        this.width=width;
    }
    public double getWidth() {
        return width;
    }
    public double calculateArea() {
        return length*width;
    }
    public double calculatePerimeter() {
        return 2*(length+width);
    }

    public static void main(String[] args) {
        Rectangle ob=new Rectangle(5.0, 3.0);
        System.out.println("Area : " +ob.calculateArea());
        System.out.println("Perimeter : " +ob.calculatePerimeter());
        ob.setLength(7.0);
        ob.setWidth(3.0);
        System.out.println("Updated Area : " +ob.calculateArea());
        System.out.println("Updated Perimeter : " +ob.calculatePerimeter());
    }
}