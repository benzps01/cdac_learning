public class RaceTrack {
    public static void main(String args[]) {
        Car c1 = new Car(2010, "porche", 45.6);
        System.out.println("Car year is: " + c1.getYear());
        System.out.println("Car Make is: " + c1.getMake());
        System.out.println("Car speed is: " + c1.getSpeed());

        c1.accelerate();
        c1.accelerate();
        System.out.println("New Car speed is : " + c1.getSpeed());
    }
}
