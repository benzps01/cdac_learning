package Banking;

import java.util.Scanner;

public class LoanType {
    public LoanType() {
    }

    public static void addLoanType(Loan[] loan, int count) {
        Scanner check = new Scanner(System.in);

        try {
            for (int i = 0; i < count; ++i) {
                System.out.println("Enter Loan type: ");
                System.out.println("1 -> Home Loan, 2 -> Personal Loan");
                int type = check.nextInt();
                if (type == 1) {
                    loan[i] = new HomeLoan();
                } else if (type == 2) {
                    loan[i] = new PersonalLoan();
                } else {
                    System.out.println("Enter a correct Value 1 or 2");
                }
            }
        } finally {
            check.close();
        }

    }
}
