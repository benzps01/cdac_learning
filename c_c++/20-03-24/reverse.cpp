#include <cstdio>

int main() {
	int num, rev=0;
	printf("Number: ");
	scanf("%d",&num);

	while(num > 0){
		rev = rev * 10;
		rev += (num%10);
		num /= 10;
	}

	printf("%d\n", rev);
	return 0;
}
