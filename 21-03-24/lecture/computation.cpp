long Compute(int lower, int upper, short step){
	long res = 0;
	
	if(upper < lower){
		throw upper;
	} 

	else if(step < 0){
		throw step; //exit the function with an exception of int type
	}

	for (int value = lower; value <= upper; value += step){
		res += value * value;
	}
	return res;
}
