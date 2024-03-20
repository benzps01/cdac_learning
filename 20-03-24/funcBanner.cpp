#include <cstdio>

double priceCalc(int count, float width, float height){
	float rate = count < 10 ? 0.80 : 0.75;
	return count * width * height * rate;
}

int main() {
	float width, height;
	short count;

	printf("Dimensions: ");
	scanf("%f%f",&width,&height);
	printf("Number of Banners: ");
	scanf("%hd",&count);

	printf("%.2lf\n",priceCalc(count, width,height));
	printf("%.2lf\n",priceCalc(count, width + 1, height + 1));
	return 0;
}
