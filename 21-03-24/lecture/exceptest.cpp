#include <cstdio>

// default argument which appears at the end of parameter-list is
// automatically passed by the compiler if it is not passed by the caller;
// the default parameters should be specified from right end, then previous and not any order,
// for default values, the value to be specified needs to have its next parameter specified too before hand
//                 <---------------------
//                 order of defualt parameter

extern long Compute(int, int, short=1);

int main(void){
	int l, u;

	printf("Lower and Upper limies: ");
	scanf("%d%d",&l, &u);	

	try{
	printf("First Result: %ld\n", Compute(l, u, 2));
	printf("Second Result: %ld\n", Compute(l, u, -1));
	}
	catch(int e){
                printf("Error -> Invalid upper limit: %d\n", e);
        }
	catch(short e){
                printf("Error -> Invalid step: %hd\n", e);
        }
	catch(...){    // any type of error
		printf("Something is wrong!!");
	}
}
