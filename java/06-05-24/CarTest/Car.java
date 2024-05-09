class Car {
    private int year;
    private String make;
    private double speed;

    public Car(int y, String m, double s) {
        year = y;
        make = m;
        speed = s;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public double getSpeed() {
        return speed;
    }

    public void accelerate() {
        speed += 1;
    }

}