#include "banner4.h"
#include <cstdio>

int main(void){

	// automatically allocating memory for an instance on stack memory;
	//such an instance is deactivated automatically 
	//when its identifier goes out of scope (when } closes) ;
	Banner a; //automatic activation of an instance (on stack memory)
	printf("Price of first Banner: %.2f\n", a.Price());


	//dynamic activation of an instance on heap memory using
	//new operator which returns the address of this instance.
	//such an instance must be explicitly deactivated using
	//delete operator
	Banner* b = new Banner(30, 8); //activating object on the heap
	printf("Price of second Banner: %.2f\n",b->Price()); // or b[0].Price
	//an instance on the heap must be explicitly deactivated
	delete b;

	int n;
	printf("Number of other banners: ");
	scanf("%d", &n);
	//dynamically activating (using default constructor) instances
	//in an array using new[] operator which returns the address of
	//the first instance
	//array should be always activated on heap bcoz array size can grow...
	Banner* other = new Banner[n];
	for (int i = 0; i < n; ++i){
		other[i].Resize(30 + 3 * i, 8 + 2 * i);
		printf("%d\t%.2f\n",i+1, other[i].Price()); 
		//(other+i)->Price() also works
	}
	delete[] other; //deactivating all instances of array using delete[]
}
