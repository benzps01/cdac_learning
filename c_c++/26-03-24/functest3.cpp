#include <cstdio>
#include "banner4.h"

double Buy(Banner* banner, int copies){ //initialize banner by pointers to avoid
					//creating a copy
	float discount = copies < 10 ? 0 : 15;
	return (1 - discount / 100) * copies * banner->Price(); //banner[0].Price();
								//or *banner.Price();
}


int main(){
	int count;
	printf("Number of copies: ");
	scanf("%d", &count);

	Banner a; //always uses default constructor;
		  //activating banner with default values;
	printf("Total Payment for standard Banner: %.2f\n", Buy(&a, count));

	Banner b(30, 8); //activating banner with parameterized constructor
	printf("Total Payment for Elliptical Banner: %.2f\n", Buy(&b, count));
}
