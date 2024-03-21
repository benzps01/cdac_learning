#include <cstdio>

extern "C" int isPrime(int);

int main(){
	int upper;
	int lower;
	int count = 0;
	printf("Enter lower and Upper Limit: ");
	scanf("%d%d",&lower,&upper);

	for(int i = lower; i <= upper; i++){
		if(isPrime(i) == 1){
			count ++;	
		}
	}
	printf("No. of primes between %d and %d is %d\n",lower, upper, count);
	return 0;
}
