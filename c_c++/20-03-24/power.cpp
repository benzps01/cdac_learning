//add the squares of the numbers till upper limit

#include <cstdio>

int main(){
	long lower, upper ;
	long res = 0;
	printf("Lower & Upper number: ");
	scanf("%ld%ld",&lower, &upper);

	for (long num = lower; num <= upper; num ++) {
		res += (num * num);
	}

	printf("value: %ld\n",res);
	return 0;
}
