class ComplexSum2{
	double real,image;
	ComplexSum2 obj1;
	ComplexSum2(double real,double image){
		this.real=real;
		this.image=image;
	}
	String addition (ComplexSum2 obj1){
		this.obj1=obj1;
		double realsum=(obj1.real+this.real);
		double imgsum=(obj1.image+this.image);
		 String str=(realsum+"+"+imgsum+"i");
		 return str;
		
	}
	public static void main(String args[]){
		ComplexSum2 c1=new ComplexSum2(5,4);
		//ComplexSum2 c2=new ComplexSum2(5,4);
		System.out.println(c1.addition(new ComplexSum2(3,2)));
	}

}
