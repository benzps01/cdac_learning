#include <cstdio>

int main() {
	int num, n=0, m=1, temp;
	
	printf("Number: ");
	scanf("%d",&num);


	printf("%d\n",n);
	printf("%d\n",m);

	for (int i=1; i < num; i++){
		temp = m;
		m += n;
		n = temp;
		printf("%d\n",m);
	}
	return 0;
}	
