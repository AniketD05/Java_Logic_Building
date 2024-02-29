class Room {

    float height = 100;
    float width = 50;
    float breadth = 50;
    float calculateVolume;

    float Volume() {
        calculateVolume = height * width * breadth;
        return calculateVolume;
    }

    public static void main(String[] args) {

        Room obj = new Room();

        float cal = obj.Volume();

        System.out.println(cal);

    }

}
