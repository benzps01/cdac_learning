#include <iostream>
#include <iomanip>
#include "bank.h"
using namespace std;
using namespace bank;

// Raw Data for Personal Loan
//  Principle and Period
int Personaldata[10][2] = {
    {191132, 8},
    {563047, 21},
    {494260, 15},
    {595953, 13},
    {324502, 18},
    {671233, 11},
    {445906, 8},
    {334552, 24},
    {628365, 9},
    {333796, 20},
};

// Raw Data for Home Loan
//  Principle and Period
int Homedata[10][2] = {
    {2713190, 14},
    {1745478, 18},
    {2856503, 8},
    {2091231, 22},
    {1948832, 5},
    {1866722, 11},
    {2188947, 6},
    {2569426, 9},
    {1852745, 19},
    {1715893, 4}};

// Function to Calculate Total Value for
//  All EMI and all Principle using Function Pointer
double CalcValue(Loan *l, int n, double (Loan::*calc)())
{
    double totalVal = 0;
    for (int i = 0; i < n; ++i)
    {
        totalVal += (l[i].*calc)();
    }
    return totalVal;
}

// Here we get a Polymorphic Array of Personal or Home Loan
//  and use the setter method for Principle and Period to assign
// values and then calculate totalEMI and totalPrinciple.
void BankingSystem(Loan *loan, int c, int data[][2])
{
    double totalEMI, totalPrinciple = 0;
    cout << c << endl;
    for (int i = 0; i < c; ++i)
    {
        loan[i].SetPrinciple(data[i][0]);
        loan[i].SetPeriod(data[i][1]);
        cout << "Amount\t" << loan[i].GetPrinciple() << "\tis invested for\t"
             << loan[i].GetPeriod() << "   years " << "\twith rate at\t" << loan[i].GetRate() << "%." << endl;
        // Here we calculate totalEMI and totalPrinciple
        // by passing function Pointer.
        totalEMI = CalcValue(loan, c, &Loan::GetEMI);
        // totalEMI = loan[i].GetEMI();
        totalPrinciple = CalcValue(loan, c, &Loan::GetPrinciple);
    }
    // totalEMI = CalcValue(loan, c, &Loan::GetEMI);
    // totalPrinciple = CalcValue(loan, c, &Loan::GetPrinciple);
    cout << endl;
    cout << "*************** Total EMI ******************" << endl;
    cout << totalEMI << endl;
    cout << "*************** Total Principle ******************" << endl;
    cout << fixed;
    cout << setprecision(2);
    cout << totalPrinciple << endl;
    cout << "*************** Total Discount ******************" << endl;
}

int main(void)
{
    int n = 0;
    int LoanType = 0;
    PersonalLoan p1;
    p1.SetPrinciple(600000);
    p1.SetPeriod(4);

    cout << "Rate for Amount: " << p1.GetPrinciple() << " is " << p1.GetRate() << endl;
    cout << "EMI for Amount: " << p1.GetPrinciple() << " is " << p1.GetEMI() << endl;
    cout << "Enter total objects for Polymorphic Array: " << endl;
    cin >> n;

    cout << "Enter the Loan Type 0 -> PersonalLoan, 1 -> HomeLoan " << endl;
    cin >> LoanType;

    // Create a Polymorphic array
    Loan *PL = new PersonalLoan[n];
    Loan *HL = new HomeLoan[n];

here:
    // switch case for Calling BankingSystem
    //  function on PersonalData or HomeLoan
    switch (LoanType)
    {
    case 0:
        BankingSystem(PL, n, Personaldata);
        break;
    case 1:
        BankingSystem(HL, n, Homedata);
        break;
    default:
        cout << "Enter a Valid Value 0 or 1";
        goto here;
    }
}