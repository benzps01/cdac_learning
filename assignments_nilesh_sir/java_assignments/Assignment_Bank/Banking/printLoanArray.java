package Banking;

public class printLoanArray {

    public static double calculateTotal(Loan[] loan, String value) {
        double result = 0;

        for (int i = 0; i < loan.length; ++i) {
            if (value == "Principle") {
                result += loan[i].getPrinciple();
            }

            if (value == "EMI") {
                result += loan[i].getEMI();
            }
        }

        return result;
    }

    public static void printAll(Loan[] loan) {
        int count = 0;
        int val = loan.length;
        for (int i = 0; i < val; ++i) {
            System.out.println();
            if (loan[i] instanceof HomeLoan) {
                System.out.println("HomeLoan Details " + (count + 1) + ": ");
                ++count;
            } else if (loan[i] instanceof PersonalLoan) {
                System.out.println("PersonalLoan Details " + (count + 1) + ": ");
                ++count;
            }

            System.out.println("Principle Amount: " + loan[i].getPrinciple());
            System.out.println("Invested for a period of: " + loan[i].getPeriod());
            System.out.println("Rate: " + loan[i].getRate());
            System.out.println("EMI: " + String.format("%.2f", loan[i].getEMI()));
            if (loan[i] instanceof Taxable t) {
                System.out.println("Tax: " + String.format("%.2f", t.getTax()));
            } else if (loan[i] instanceof Discountable d) {
                System.out.println("Discount: " + String.format("%.2f", d.getDiscount()));
            }

            System.out.println();
        }

        System.out.println("Total Principle of all Loans");
        System.out.println("Amount: " + String.format("%.2f", calculateTotal(loan, "Principle")));
        System.out.println();
        System.out.println("Total EMI of all Loans");
        System.out.println("Amount: " + String.format("%.2f", calculateTotal(loan, "EMI")));
    }
}
