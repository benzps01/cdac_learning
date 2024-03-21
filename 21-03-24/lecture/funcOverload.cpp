#include <cstdio>
#include <cmath>

int Compute(int upper) {  //mangled name is _Z7Computei
	puts("Basic Operation");
	return upper * (upper + 1) / 2;
}


//Function overloading
double Compute(int upper, float degree){ //_Z7Computeif
	double result = 0;

	puts("Complex Operation");
	for (int value = 1; value <= upper; value ++){
		result += pow(value, degree);
	}	
	return result;
}

int main(void){
	int count;
	printf("Number: ");
	scanf("%d",&count);

	printf("Result is: %d\n", Compute(count));

	float level;
	printf("Enter a level!!");
	scanf("%f",&level);
	printf("Result is %lf\n",Compute(count,level));
	return 0;
}
