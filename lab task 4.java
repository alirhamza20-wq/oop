class Rectangle {

    int length;
    int width;

    void displayRectangle() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    void calculateArea() {
        int area;

        area = length * width;

        System.out.println("Area: " + area);
    }

    void calculatePerimeter() {
        int perimeter;

        perimeter = 2 * (length + width);

        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        r1.length = 10;
        r1.width = 5;

        r1.displayRectangle();
        r1.calculateArea();
        r1.calculatePerimeter();
    }
}