#include <cstdio>

float ExpenseSequence(int year) {
	return 3 * year + 2;
}

float IncomeSequence(int year) {
	return year * year + 1;
}
/*
double ExpenseSequenceSum(int years){
	double total = 0;
	for (int yr = 1; yr <= years; ++yr){
		double amount = ExpenseSequence(yr);
		total += amount;
	}
	return total;
}

double IncomeSequenceSum(int years){
	double total = 0;
	for(int yr = 1; yr <= years; ++yr){
		double amount = IncomeSequence(yr);
		total += amount;
	}
	return total;
}
*/


// second parameter (seq) is of a  function pointer type which
// addresses code of any function with one parameter of int type
// and float as its return type
double CommonSequenceSum(int years, float (*seq)(int)){  //this *seq here means pointer to a function
	double total = 0;
	for(int yr = 1; yr <= years; ++yr){
		double amount = seq(yr); //calling function addressed by seq
		total += amount;
	}
	return total;
}
int main(void){
	int count;
	printf("Number of years: ");
	scanf("%d", &count);

	printf("Total Expenses: %.2f\n", CommonSequenceSum(count,ExpenseSequence)); 
	//no need to specify & in the ExpenseSequence part, we can direclty call functions too...
	printf("Total Income: %.2f\n", CommonSequenceSum(count,IncomeSequence));

}
