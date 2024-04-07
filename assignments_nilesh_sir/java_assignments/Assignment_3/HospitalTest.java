import Hospital.*;

public class HospitalTest {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        p1.setName("Benson");
        p1.setNoOfDays(25);
        System.out.println("Id: " + p1.getId());
        System.out.println("Name is: " + p1.getName());
        System.out.println("No of Days: " + p1.getNoOfDays());
        System.out.println("Total Bill Amount: " + p1.getBillAmount());

        System.out.println();
        InHousePatient p2 = new InHousePatient();
        p2.setName("Samson");
        p2.setNoOfDays(25);
        p2.setBed(BedOptions.EXECUTIVE);
        System.out.println("Id: " + p2.getId());
        System.out.println("Name is: " + p2.getName());
        System.out.println("No of Days: " + p2.getNoOfDays());
        System.out.println("Total Bill Amount: " + p2.getBillAmount());
    }
}
