#include "interval.h"
#include <cstdio>

int main(void){
	Interval i(5, 40);
	i.Print();

	Interval j(3, 25);
	j.Print();

	Interval k = i + j; //compiler does this i.operator+(j) this won't work
	k.Print();

	Interval l = k;
	l.Print();

	Interval r = k + l;
	r.Print();
}
