#include <cstdio>
#include "banner0.h"

int main(void){
	float w, h;
	
	printf("Price of standard Banner: %.2f\n", BannerPrice(20, 5, false));
	printf("Dimensions of custom banners: ");
	scanf("%f%f", &w, &h);
	printf("Price of custom rectangular banner: %.2f\n", BannerPrice(w, h, false)); // here instead of false, "0" can also be passed.
	printf("Price of custom triangular banner: %.2f\n", BannerPrice(w, h, true)); //here instead of true, 1 can also be passed
}
