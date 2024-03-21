int isPrime(int num) {
	if (num == 1 || num == 0) {
		return 0;
	}
	if (num==2 || num == 3 || num == 5) {
		return 1;
	}
	if(num%2==0 || num%3==0 || num%5==0) {
		return 0;
	}
	for(int i=5;i<num/2;i+=6) {
		if(num%i==0){
			return 0;
		}
	}
	return 1;
}
