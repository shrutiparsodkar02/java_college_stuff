class ComplexSum{
	double real;
	double image;
	ComplexSum obj1,obj2;	
	//here we are taking values with help of constructor so when we call that obj we can access values directly from refrence
	ComplexSum(double real,double image){
		this.real=real;
		this.image=image;
	}
	String addition(ComplexSum obj1,ComplexSum obj2){
		this.obj1=obj1;
		this.obj2=obj2;
		 double realsum=(obj1.real+obj2.real);
		 double imgsum=(obj1.image+obj2.image);
		 String str=(realsum+"+"+imgsum+"i");
		 return str;
	}
	
	
	
	public static void main (String args[]){
		//ComplexSum c1=new ComplexSum();note-->if there is parameterised constructor it will not take default
		ComplexSum c2=new ComplexSum(5,5);
		ComplexSum c3=new ComplexSum(10,10);
		System.out.println(c2.addition(c2,c3));
		
	}
	

}
