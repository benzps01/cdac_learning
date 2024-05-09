using BankLib;

Loan pl = Banker.GetHomeLoan();

pl.Principle = 5000000;
pl.Period = 4;

Loan hl = Banker.GetHomeLoan();
hl.Principle = 5000000;
hl.Period = 12;

// Loan[] arrLoan = new Loan[5];

// arrLoan[0] = new PersonalLoan
// {
//     Period = 10,
//     Principle = 13124134
// };

// arrLoan[1] = new HomeLoan();
// arrLoan[1].Principle = 23123232;
// arrLoan[1].Period = 12;

// arrLoan[2] = new HomeLoan
// {
//     Period = 8,
//     Principle = 4500000
// };
// arrLoan[3] = new HomeLoan
// {
//     Period = 14,
//     Principle = 3453423
// };
// arrLoan[4] = new PersonalLoan
// {
//     Period = 20,
//     Principle = 131241
// };


// static double GetTotalEmi(Loan[] loans)
// {
//     double TotalEmi = 0.00;
//     foreach (Loan loan in loans)
//     {
//         TotalEmi += loan.GetEmi();
//     }
//     return TotalEmi;
// }

// static double GetTotalDiscount(Loan[] loans)
// {
//     double TotalDiscount = 0.00;
//     foreach (Loan loan in loans)
//     {
//         if (loan is IDiscountable discount)
//         {
//             TotalDiscount += discount.GetDiscount();
//         }
//     }
//     return TotalDiscount;
// }

// static double GetTotalTax(Loan[] loans)
// {
//     double TotalTax = 0.00;
//     foreach (Loan loan in loans)
//     {
//         if (loan is ITaxable tax)
//         {
//             TotalTax += tax.GetTax();
//         }
//     }
//     return TotalTax;
// }

// System.Console.WriteLine(l.GetEmi());
Console.WriteLine("EMI is {0:0.00} and rate is {1:0.00}", pl.GetEmi(), pl.GetRate());
// Console.WriteLine("EMI is {0:0.00}", arrLoan[0].GetEmi());
// Console.WriteLine("EMI is {0:0.00}", arrLoan[1].GetEmi());
// Console.WriteLine("Total EMI's are: {0:0.00}", GetTotalEmi(arrLoan));

// if (hl is IDiscountable NewLoan)
// {
//     Console.WriteLine("New Loan is: {0:00}", (hl.GetEmi() - NewLoan.GetDiscount()));
// }

// Console.WriteLine("Total Discounts disbursed are: {0:0.00}", GetTotalDiscount(arrLoan));
// Console.WriteLine("Total Tax calculated are: {0:0.00}", GetTotalTax(arrLoan));
