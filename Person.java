class Person {

    int age;
    double height;
    double weight;

    Person() {
        age = 38;
        height = 176.0;
        weight = 70.0;
    }

    Person(int ag, double ht, double wt) {
        age = ag;
        height = ht;
        weight = wt;
    }

    void display() {
        System.out.println("\n");
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
    }

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person(25, 183.1f, 69.5f);

        System.out.println("\nDetails of Person 1:");
        person1.display();

        System.out.println("\nDetails of Person 2:");
        person2.display();
    }
}
