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
    {271319, 14},
    {174547, 18},
    {285650, 8},
    {209123, 22},
    {194881, 5},
    {186672, 11},
    {218897, 6},
    {256942, 9},
    {185274, 19},
    {171589, 4}};

void PrintAll(Loan **loanArray, int size)
{
    for (int i = 0; i < size; ++i)
    {
        cout << "Loan " << i + 1 << " Details:" << endl;
        cout << "Principle " << loanArray[i]->GetPrinciple() << endl;
        cout << "Period " << loanArray[i]->GetPeriod() << endl;
        cout << "Rate " << loanArray[i]->GetRate() << endl;
        cout << "EMI " << loanArray[i]->GetEMI() << endl;

        Taxable *tax = dynamic_cast<Taxable *>(loanArray[i]);
        if (tax)
        {
            cout << "Tax on EMI: " << tax->getTax() << endl;
        }

        Discountable *discount = dynamic_cast<Discountable *>(loanArray[i]);
        if (discount)
        {
            cout << "Discount on EMI: " << discount->getDiscount() << endl;
        }

        cout << endl;
    }
}

int main(void)
{
    Loan *pa[] = {
        new PersonalLoan,
        new HomeLoan,
        new PersonalLoan,
        new HomeLoan,
        new PersonalLoan};

    int size = end(pa) - begin(pa);
    cout << "Size of Array: " << size << endl;

    for (int i = 0; i < size; ++i)
    {
        pa[i]->SetPrinciple(Homedata[i][0]);
        pa[i]->SetPeriod(Homedata[i][1]);
    }

    double totalEMI, totalPrinciple = 0;
    for (int i = 0; i < size; ++i)
    {
        // cout << "Amount\t" << pa[i]->GetPrinciple() << "\tis invested for\t" << pa[i]->GetPeriod() << "   years " << "\twith rate at\t"
        //      << pa[i]->GetRate() << "%." << endl;
        totalEMI += pa[i]->GetEMI();
        totalPrinciple += pa[i]->GetPrinciple();
    }

    PrintAll(pa, size);

    for (int i = 0; i < size; ++i)
    {
        delete pa[i];
    }
}