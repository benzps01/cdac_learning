#include <cstdio>
#include "banner5.h"

double Buy(const Banner& info, int copies){ 
	float discount = Banner::BulkDiscount(copies); 
	//dynamic binding: A call to a virtual member function on a
	//pointer/refernece is indirectedthrough the v-table pointed
	//by the instance addressed by that pointer/reference.
	return (1 - discount / 100) * copies * info.Price();
}


int main(){
	int count;
	printf("Number of copies: ");
	scanf("%d", &count);

	Banner a; 
	printf("Total Payment for standard Banner: %.2f\n", Buy(a, count));

/*
	Banner b(30, 8); 
	printf("Total Payment for Elliptical Banner: %.2f\n", Buy(b, count)); */

	HardBanner b(30, 8, 0.5);
	printf("Total Payment for HardBanner: %.2f\n", Buy(b, count));
}
