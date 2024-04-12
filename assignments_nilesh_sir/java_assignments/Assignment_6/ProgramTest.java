import MetTours.*;
import java.util.Scanner;
import java.lang.reflect.Method;

public class ProgramTest {
    public static void main(String[] args) throws Exception {

        Scanner Check = new Scanner(System.in);

        try {
            System.out.println("Enter No. of days and No of Persons: ");
            int d = Check.nextInt();
            System.out.println();
            int p = Check.nextInt();
            System.out.println();
            System.out.println("Enter Room type: PremiumTours or EconomyTours ");
            String className = Check.next();
            Class<?> t = Class.forName("MetTours." + className);
            Object tours = t.getConstructor().newInstance();
            System.out.println();
            System.out.println("Enter the Method to get PerDayRoomCost: ");
            String methodName = Check.next();
            try {
                Method test = t.getMethod(methodName, int.class, int.class);
                double cost = (double) test.invoke(tours, d, p);
                double finalCost = TotalCost.totalCost(cost, d, p);
                System.out.println("Total Cost for " + d + " for " + p + " persons are: " + finalCost);
            } catch (NoSuchMethodException e) {
                System.out.println("Method not found!!!");
            } catch (Exception e) {
                System.out.println("Something went wrong!!!");
            }
        } catch (NoClassDefFoundError e) {
            System.out.println("No Such Class found!!!");
        } finally {
            Check.close();
        }
    }
}
