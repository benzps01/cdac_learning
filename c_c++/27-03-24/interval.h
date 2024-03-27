#include <cstdio>

class Interval{
	public:
		Interval(int a, int s){
			id = ++ count;
			min = a + s / 60;
			sec = s % 60;
		}

		//copy constructor is used to initialize an instance
		//from other object assigned to it.
		Interval(const Interval& other){
			id = ++count;
			min = other.min;
			sec = other.sec;
		}

		int Time() const{
			return 60 * min + sec;
		}

		void Print() const{
			printf("Interval<%d> = %d:%02d\n", id, min, sec);
		}
		
		//overloading + operator
		Interval operator+(const Interval& rhs){ //to avoid copies use &
			return Interval(min + rhs.min, sec + rhs.sec); 
			//here min is i and rhs.min is j
		}
	private:
		int id, min, sec;

		//value of static member variable is shared by all instances.
		static int count;
};


//allocating memory for static member variable
int Interval::count = 0;
