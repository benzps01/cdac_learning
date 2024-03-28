#include <cstdio>

enum Geometry { Triangular, Rectangular, Elliptical };

class Banner
{
	public:
		Banner(float length=20, float breadth=5){ 
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
			width = w; 
			height = h; 
		}

		//overloaded member function defined in same class with same function name, but with different parameters.
		void Resize(float w){
			width = height = w;
		}

		

		void Triangulate(bool yes){
			shape = yes ? Geometry::Triangular : Geometry::Elliptical;
		}

		//a virtual member function can be overridden in the derived class
		virtual double Price() const{
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
		
		static float BulkDiscount(int copies){
			return copies < 10 ? 0: 15;
		}

		~Banner(){
			puts("Banner instance deactivated");	
		}
	private:
		float width, height;
		Geometry shape;
};

//defining HardBanner as a derived(sub) class of Banner (base class)
class HardBanner : public Banner {
	public:
		//the derived class constructor must call a constructor of the base class so that the inherited fields are initialized.
		HardBanner(float length, float breadth, float hardness) : Banner(length, breadth){
	thickness = hardness;
}

//overriding member function of re-defining virtual member function
//of base class in the derived class with exactly same declaration.
//The methods need to be virtal method.
double Price() const{
	return Banner::Price() * (1 + 0.5 * thickness);
}
	private:
		float thickness;
};
