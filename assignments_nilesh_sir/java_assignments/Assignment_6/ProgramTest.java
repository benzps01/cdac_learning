import MetTours.*;
import java.util.Scanner;
import java.lang.reflect.Method;

public class ProgramTest implements AutoCloseable{
    public static void main(String[] args) throws Exception{

        //Scanner Check = new Scanner(System.in);

        /*
        * Whichever object we need to close, we can include it in try()
        * block, which implements AutoClosable...
        */
        try(Scanner Check = new Scanner(System.in);){
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
            System.out.println();
            try {
                Method test = t.getMethod(methodName, int.class, int.class);
                LuxuryTax LuxTaxAnnotation = test.getAnnotation(LuxuryTax.class);
                int tax = LuxTaxAnnotation != null ? LuxTaxAnnotation.value() : 0;
                double cost = (double) test.invoke(tours, d, p);
                double finalCost = TotalCost.totalCost(cost, d, p);
                double CostAfterTax = finalCost + (finalCost * tax / 100);
                System.out.println("Total Cost for " + d + " for " + p + " persons are with Luxury Tax: " + CostAfterTax);
            } catch (NoSuchMethodException e) {
                System.out.println("Method not found!!!");
            } catch (Exception e) {
                System.out.println("Something went wrong!!!");
            }
        } catch (NoClassDefFoundError e) {
            System.out.println("No Such Class found!!!");
        }
    }

    @Override
    public void close() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }
}
