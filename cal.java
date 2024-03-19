class EngCalculator{
	int addition(int num1,int num2){
		int sum=num1+num2;
	 	return sum;
	}
	double Percentage(int num1,int num2){
		
		double per=(num1/num2)*100;
		return per;
	}
	int Square(int num1){
		int sqr=num1*num1;
		return sqr;
	}
	int Cube(int num1){
		int cube=num1*num1*num1;
		return cube;
	}
	double Squareroot(int num1){
		for(int i=1;i<=num1/2;i++){
			if(i*i==num1){
				return i;
			}
		}
		return -1;
	}
	double Cuberoot(int num1){
		System.out.println(num1);
		for(int i=1;i<=num1;i++){
			if(i*i*i==num1){
				return i;
			}
			/*else{
				return -1;	
			}*/
		}
			return -1;
	}

	int Factorial(int num1){
		int fact=1;
		for(int i=1;i<=num1;i++){
			//int fact=1;
			fact=fact*i;

		}
		return fact;
	}
	int fraction(int n,int d){
		for(int i=n;i>0;i--){
			if((n%i)==0 && (d%i)==0){
				//int frac= ((n/i) +(d/i));
				int frac=n/d;
				System.out.println((n/i)+"_|"+(d/i));
			return frac;
			}
			//System.out.println((n/i)+"/"+(d/i));
		}
		return -1;
	}
	int mixFraction(int n,int d){
		for(int i=n;i>0;i--){
			if((n%i)==0 && (d%i)==0){
				System.out.println("numerator is---->"+n+"\ndenominator is---->"+d);
				System.out.println("simple fraction is----->"+(n/i)+"_|"+(d/i));
				int n1=(n/i);//numerator
				int n2=(d/i);//denominator
				//calculating remainder
				int rem_n=(n/i)%(d/i);
				//q is quotient
				int q=n/d;
				System.out.println("mix fraction is---->"+q+"_|"+rem_n+"_|"+n2);
				break;
			}
		}
		return -1;
	
	}
	/*double ComplexNumber(int r1,int r2,float i1,float i2){
		double real part =r1+r2;
		
	
	
	}*/
	public static void main(String args[]){
		EngCalculator e =new EngCalculator();
		/*System.out.println("<---CALCULATOR--->");
		int sum=e.addition(5,5);
		System.out.println("Addition is--->"+sum);
		double per=e.Percentage(10,10);
		System.out.println("percentage is--->"+per);
		int sqr=e.Square(5);
		System.out.println("Square of number is--->"+sqr);
		int cube=e.Cube(5);
		System.out.println("Cube of number is--->"+cube);
		double sqroot=e.Squareroot(100);
		System.out.println("Squareroot of number is--->"+sqroot);
		double cuberoot=e.Cuberoot(125);
		System.out.println("cuberoot of number is--->"+cuberoot);
		int fact=e.Factorial(5);
		System.out.println(fact);
		int frac =e.fraction(18,12);
		System.out.print("fraction->"+frac);*/
		int mixfrac =e.mixFraction(16,10);
		//sSystem.out.print("fraction->"+mixfrac);
	}


}
