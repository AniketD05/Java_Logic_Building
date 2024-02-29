class Box {

    double height;
    double width;
    double breadth;

    Box(double h, double w, double b) {
        height = h;
        width = w;
        breadth = b;
    }

    double getVolume() {
        return height * width * breadth;
    }

    double getArea() {
        return 2 * (height * width + width * breadth + height * breadth);
    }

    public static void main(String[] args) {

        Box box1 = new Box(3.0, 4.0, 5.0);
        Box box2 = new Box(2.0, 3.0, 4.0);

        System.out.println("Box 1 = Volume: " + box1.getVolume() + ", Surface Area: " + box1.getArea());

        System.out.println("Box 2 = Volume: " + box2.getVolume() + ", Surface Area: " + box2.getArea());
    }
}
