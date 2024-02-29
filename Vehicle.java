class Vehicle {

    double price;
    String color;
    String model;

    Vehicle(double p, String c, String m) {
        price = p;
        color = c;
        model = m;
    }

    void display() {
        System.out.println("Vehicle Details:");
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle(25000.0, "Blue", "Sedan");

        myVehicle.display();
    }
}
