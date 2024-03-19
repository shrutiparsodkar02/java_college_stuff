class MixFraction{

	int mixFraction(int n,int d){
		if(d>0){
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
			
	}
	else{
		System.out.println("division by zero exception");
		
	}
	return -1;
	} 
	public static void main(String args[]){
		MixFraction m=new MixFraction();
		m.mixFraction(9,0);
	}
}
