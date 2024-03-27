class Prime{
	static int primecount=0;
	static int nonprimecount=0;
	/*boolean isPrime(long num){
		if(num<2){
			return false;
			}
		else if(num==2 || num==3){
		return true;
		}
		else if(num%2==0||num%3==0){
		return false;
		}
		for(int i=5;i*i<num;i=i+6){
			if(num%i==0||num%(i+2)==0){
			return false;
			}
			else{
			return true;
			}
			}
		return true;
	}*/
	boolean isPrime(long num){
	    if(num < 2){
		return false;
	    }
	    else if(num == 2 || num == 3){
		return true;
	    }
	    else if(num % 2 == 0 || num % 3 == 0){
		return false;
	    }
	    for(int i = 5; i * i <= num; i += 6){
		if(num % i == 0 || num % (i + 2) == 0){
		    return false;
		}
	    }
	    return true;
	}
	
	
	long genrate_1_digit_num(){
	//here we are genrating randomly 1 digit number
	long n1=System.nanoTime();
	//System.out.println(n1);
	long num=(n1%10);
	//System.out.println(num);
	return num;
	}
	
	long genrate_7_digit_num(){
		long num_7=0;
		for(int i=0;i<7;i++){
			num_7=num_7*10+genrate_1_digit_num();
		}
	//System.out.print(num_7);
	return num_7;
	}
	long[] genrate_10lakh_array(long size){
	//it will store 10lakhs number in that array
	//in that we will pass genrate 7 random number function 
	//long capacity=size;
	//long []arr=new long[capacity];
	long[] arr = new long[size]; 
		int i=0;
		for(i=0;i<size;i++){
			arr[i]=genrate_7_digit_num();
		}
		return arr;
	}
	//countPrimeNumBy_ifelse
	 void Approach1(long arr[]){
		for(int i=0;i<arr.length;i++){
			if(isPrime(arr[i])==true){
				primecount++;
				}
			else{
				nonprimecount++;
			}
	}
	}
	//countPrimeNumBy_elseif
	 void Approach2(long arr[]){
		for(int i=0;i<arr.length;i++){
			if(isPrime(arr[i])!=true){
				nonprimecount++;
				}
			else{
			primecount++;
			}
	
		}
	}
	 void Approach3(long arr[]){
		int i=0;
		while(i<arr.length){
			if(isPrime(arr[i])==true){
				primecount++;
				}
			else{
			nonprimecount++;
			}
			i++;
		}
	}
	void Approach4(long arr[]){
		int i=0;
		while(i<arr.length){
			if(isPrime(arr[i])!=true){
				nonprimecount++;
				}
			else{
			primecount++;
			}
			i++;
		}
		
	}
	//for print arr
	void printArray(long arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	long Average(long arr[]){
		long sum=0;
		long average;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		average=sum/arr.length;
		return average;
	}
	
	
	public static void main(String args[]){
		Prime p1=new Prime();
		//long sizeOfArray=100;
		long[] arr=p1.genrate_10lakh_array(100);
		
	/*	long startTime;
		long endTime;
		long arr1[]=new long[10];
		long arr2[]=new long[10];
		long arr3[]=new long[10];
		long arr4[]=new long[10];
		int i=0;
		while(i<10){
			startTime=System.nanoTime();
			p1.Approach1(arr);
			endTime=System.nanoTime();
			arr1[i]=endTime-startTime;
			
			
			startTime=System.nanoTime();
			p1.Approach2(arr);
			endTime=System.nanoTime();
			arr2[i]=endTime-startTime;
		
		
			startTime=System.nanoTime();
			p1.Approach3(arr);
			endTime=System.nanoTime();
			arr3[i]=endTime-startTime;
			
			
			startTime=System.nanoTime();
			p1.Approach4(arr);
			endTime=System.nanoTime();
			arr4[i]=endTime-startTime;
			i++;
		}
		//p1.printArray(arr1);
		System.out.println("Average time for Approach 1---->"+p1.Average(arr1));
		System.out.println("Average time for Approach 2---->"+p1.Average(arr2));
		System.out.println("Average time for Approach 3---->"+p1.Average(arr3));
		System.out.println("Average time for Approach 4---->"+p1.Average(arr4));*/
	
	}
}

	
