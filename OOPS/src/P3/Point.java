package q3;

class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public Point(Point copy) {
        this.x=copy.x;
        this.y=copy.y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x=x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y=y;
    }
    public void display() {
        System.out.println("Point (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Point point1 = new Point(5, 10);
        Point point2 = new Point(point1);
        System.out.println("Original Point: ");
        point1.display();
        System.out.println("Copied Point: ");
        point2.display();
        point2.setX(15);
        point2.setY(20);
        System.out.println("After Update , Original Point: ");
        point1.display();
        System.out.println("Modified Copied Point: ");
        point2.display();
    }
}
