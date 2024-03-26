#include <cstdio>
#include "banner3.h"

int main(void){
	Banner a; //activation using default constructor
	printf("Price of standard banner: %.2f\n", a.Price()); //whenever object call a method, binding happens
							       //i.e. a.Price() or b.Resize() or b.Price();

	Banner b;
	float w, h;
	printf("Dimensions of custom banner: ");
	scanf("%f%f", &w, &h);
	b.Resize(w, h); // Binding -> Banner::Resize(&b, w, h)
	printf("Price of custom rectangular banner: %.2f\n", b.Price());
	b.Triangulate(true); //Binding -> Banner::Triangulate(&b, bool);
	printf("Price of custom triangular banner: %.2f\n", b.Price()); //Binding
	b.Reshape(Geometry::Elliptical);
	printf("Price of Elliptical banner: %.2f\n", b.Price());
}
