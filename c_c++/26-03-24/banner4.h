#include <cstdio>

enum Geometry { Triangular, Rectangular, Elliptical };

class Banner
{
	public:
		Banner(float length=20, float breadth=5){ //example of default constructor since there are no parameters in it.
			width = length;
			height = breadth;
			shape = Geometry::Rectangular;
			puts("This has been initialized!!");
		}		
		
		void Reshape(Geometry g){
			shape = g;
		}
		void Resize(float w, float h)
		{
			width = w; //this[0].width = w;
			height = h; //this[0].height = h;
		}

		void Triangulate(bool yes){
			shape = yes ? Geometry::Triangular : Geometry::Elliptical;
		}
		//not-static member function depends on instance data 
		//which it addresses using 'this' argument, 
		//such a method must be called on an object 
		//(using . operator) 
		double Price() const{
			float k;
			float rate = width <= height ? 0.75 : 0.80;
		switch(shape){
			case Geometry::Triangular:
				k = 0.5;
				break;
			case Geometry::Elliptical:
				k = 0.785;
				break;
			default:
				k = 1.0;
				break;
		}
			return k * width * height * rate;
		}
		
		//static member function is independent of instance data
		//and such a method does not require 
		//'this' argument and it can be called directly 
		//on the class (using :: operator)
		static float BulkDiscount(int copies){
			return copies < 10 ? 0: 15;
		}

		// ~ operator is (opposite of)
		// a destructor is called just before object is deactivated(is removed from 
		// memory or it goes out of scope), it is defined to remove aby side effect of the constructor
		~Banner(){
			puts("Banner instance deactivated");	
		}
	private:
		float width, height;
		Geometry shape;
};
