
# Java Assignments

## This folder contains all Java Assignments

```
.
├── Assignment_1
│   ├── MathUtil.class
│   ├── MathUtil.java
│   ├── test.class
│   └── test.java
├── Assignment_2
│   ├── MathUtil.class
│   ├── MathUtil.java
│   ├── test.class
│   └── test.java
├── Assignment_3
│   ├── Hospital
│   │   ├── BedOptions.class
│   │   ├── BedOptions.java
│   │   ├── InHousePatient.class
│   │   ├── InHousePatient.java
│   │   ├── Patient$1.class
│   │   ├── Patient.class
│   │   └── Patient.java
│   ├── HospitalTest.class
│   └── HospitalTest.java
├── Assignment_Bank
│   ├── Banking
│   │   ├── Discountable.java
│   │   ├── HomeLoan.java
│   │   ├── Loan.java
│   │   ├── LoanType.java
│   │   ├── PersonalLoan.java
│   │   ├── Taxable.java
│   │   ├── addLoanValues.java
│   │   ├── dataValue.java
│   │   └── printLoanArray.java
│   └── ProgramTest.java
├── README.md
└── assignment_docs
    ├── Assignment_1.doc
    ├── Assignment_2.doc
    └── Assignment_3.doc
```

### Assignment_1 
    This is on operations like CountPrimes, addition, subtraction, multiplication using `static methods and no fields`.

### Assignment_2 
    This is on operations like CountPrimes, addition, subtraction, multiplication using non `static methods with non static fields`.

### Assignment_3 
    This is on Hospital System. Here in this system we set PatientName, Bedtype, getTotalBill calculated from bed rate per day and no of days admitted, offer 5% discount to InHousePatient. 
We create a package `Hospital` which has following classes:

```
Hospital
    Classes
        ├──BedOptions
        ├──InHousePatient
        └──Patient
```
and `HospitalTest.java` is the main program.

### Assignment_Bank
    This assignment is same as the one made in C++. Here we used SOLID principles and created a small bank system which grants HomeLoan and PersonalLoan, and calculates the InterestRates, EMI, etc for each loans.

```
Abstract Class
    └── Loan
```

```
Classes
   ├── HomeLoan
   ├── LoanType
   ├── PersonalLoan
   ├── addLoanValues
   ├── dataValue
   └── printLoanArray
```

```
Interfaces
    ├──Taxable
    └──Discountable
```

### Assignment_docs
    This contains all the assignment document folder.