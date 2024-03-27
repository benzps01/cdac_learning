#include <cstdio>
#include "banner5.h"

//A reference type (T&) automatically addresses the value of
//the variable with which it is initialized and automatically
//indirects to this value where ever it is used.
//type parameter declared with 'const' qualifier treats the
//addressed data as read-only
double Buy(const Banner& info, int copies){ //initialize banner by pointers to avoid
					//creating a copy
					//const above restricts modifications of the data.
	//info.Resize(0,0);
	float discount = Banner::BulkDiscount(copies); //static method
	return (1 - discount / 100) * copies * info.Price(); //banner[0].Price();
								//or *banner.Price();
}


int main(){
	int count;
	printf("Number of copies: ");
	scanf("%d", &count);

	Banner a; //always uses default constructor;
		  //activating banner with default values;
	printf("Total Payment for standard Banner: %.2f\n", Buy(a, count));

	Banner b(30, 8); //activating banner with parameterized constructor
	printf("Total Payment for Elliptical Banner: %.2f\n", Buy(b, count));
}
