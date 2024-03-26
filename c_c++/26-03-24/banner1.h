class Banner
{
	public:
		// Constructor of a class initializes each of its new instances.
		// It is a function whose name matches with the names of the class and
		// it is declared without a return type; A contructor declared without any parameter or all optional pararmeters
		// is automatically defined for a class which does not explicitly define any constructor;
		Banner(){ //example of default constructor since there are no parameters in it.
			width = 20;
			height = 5;
			triangular = false;
		}		
		
		// void Banner::void Resize(Banner* this, float w, float h) 
		// this is the keyword hidden in cpp but same as this in JavaScript or self in python
		// a method automatically receives a 'this' argument  which points to the instance referred by the object
		// on which the method is called.
		void Resize(float w, float h)
		{
			width = w; //this[0].width = w;
			height = h; //this[0].height = h;
		}

		void Triangulate(bool yes){
			triangular = yes;
		}

		// a const method does not change the state of the object
		// on which it is called.
		double Price() const{
			float k = triangular == true ?  0.5 : 1.0;
			float rate = width <= height ? 0.75 : 0.80;
			return k * width * height * rate;
		}
	private:
		float width, height;
		bool triangular;
};
