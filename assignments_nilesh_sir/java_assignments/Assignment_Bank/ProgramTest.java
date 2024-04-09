import Banking.*;
import java.util.Scanner;

public class ProgramTest {

    public static void main(String[] args) {
        Loan[] loan;
        Scanner arrayVal = new Scanner(System.in);
        int arraySize;
        try {
            System.out.println("Enter Array Size: ");
            arraySize = arrayVal.nextInt();
            loan = new Loan[arraySize];
            LoanType.addLoanType(loan, arraySize);
        } finally {
            arrayVal.close();
        }
        addLoanValues.addValues(loan, arraySize);
        printLoanArray.printAll(loan);
    }
}