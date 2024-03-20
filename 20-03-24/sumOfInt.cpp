#include <cstdio>

int main(){
	long num, sum=0;
	printf("Number: ");
	scanf("%ld",&num);
	
	while(num > 0) {
		sum += num % 10;
		num /= 10;
	}
	printf("Value is: %ld\n",sum);
	return 0;

}
