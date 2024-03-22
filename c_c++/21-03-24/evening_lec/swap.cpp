#include <cstdio>

void Swap(long* first, long* second) {
	long third = *first;  //third contains value of whatever value first is pointing at;
	*first = *second;
	*second = third;	// since third has value of first no need for *
}

int main(void) {
	long x = 43, y = 56;
	printf("Original values: %ld, %ld\n", x, y);
	Swap(&x,&y);  //we give the address of x and y to pointers so that they can store at the memory location of x and y;
	printf("Swapped values: %ld, %ld\n",x,y);
}
