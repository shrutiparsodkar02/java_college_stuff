class PallindromeString{
	char randomString(){
		long num1=System.nanoTime()%126;
		num1=155-num1;
		//System.out.println(num1);
		for(int i=0;i<1000;i++){
			if((num1>64)&&(num1<91)){
				return (char)num1;
			}
			else{
				continue;
			}
		}
		return '@';
	}
	String randomString_5_letters(){
		String s1=String.valueOf(randomString())+String.valueOf(randomString())+String.valueOf(randomString())+String.valueOf(randomString())+String.valueOf(randomString());
		return s1;
	}
	String[] arrayOfRandomString(){
		String[] s1=new String[10000];
		for(int i=0;i<s1.length;i++){
			s1[i]=randomString_5_letters();
		}
		/*for(int k=0;k<s1.length;k++){
			System.out.println(s1[k]);
		}*/
		return s1;
	}
	boolean isPallindrome_1_(String s1){
		//String[] s1=new string[10000];
		//System.out.println(s1);
		int start=0;
		int end=s1.length()-1;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(start)==s1.charAt(end)){
				start++;
				end--;
			}
			else{
				return false;
			}
		}
		return true;	
	}
	boolean isPallindrome_2_(String s1){
		//StringBuilder s2=s1.reverse();
		//StringBuilder s2=(StringBuilder)s1;
		/*StringBuilder s=new StringBuilder(s1);
		System.out.println("Original string-->"+s);
		StringBuilder s2=s.reverse();
		System.out.println("Reversed string-->"+s2);
			if(s1.equals(s2)){
				return true;
			}
			return false;*/
		//System.out.println("Original string-->"+s1);
		String rev="";
		char[] c=s1.toCharArray();
		for(int i=s1.length()-1;i>=0;i--){
			 rev+=c[i];
		}
		//System.out.println("Reversed string-->"+rev);
		if(s1.equals(rev)){
				return true;
		}
		
		return false;
	}
	long Approach1(String[] s){
		long count=0;
		for(int i=0;i<s.length;i++){
			if(isPallindrome_1_(s[i])==true){
				count++;
			}
		}
		return count;
	}
	long Approach2(String[] s){
		long count=0;
		for(int i=0;i<s.length;i++){
			if(isPallindrome_2_(s[i])==true){
				count++;
			}
		}
		return count;
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
		PallindromeString p1=new PallindromeString();
		//System.out.println(p1.randomString());
		String random=p1.randomString_5_letters();
		String[] s1=new String[10000];
		s1=p1.arrayOfRandomString();
		//System.out.println(random);
		//System.out.println(p1.randomString_5_letters());
		//p1.arrayOfRandomString();
		//System.out.println(p1.isPallindrome_1_(random));
		//System.out.println(p1.isPallindrome_2_(random));
		//System.out.println(p1.Approach1(s1));
		//System.out.println(p1.Approach2(s1));
		long[] arr1=new long[10000];
		long[] arr2=new long[10000];
		long starttime=0;
		long endtime=0;
		int i=0;
		while(i<10){
			
			starttime=System.nanoTime();
			p1.Approach1(s1);
			endtime=System.nanoTime();
			long avragetime1=endtime-starttime;
			arr1[i]=avragetime1;
			
			
			
			starttime=System.nanoTime();
			p1.Approach2(s1);
			endtime=System.nanoTime();
			long avragetime2=endtime-starttime;
			arr2[i]=avragetime2;
			i++;
		}
		System.out.println("Average time for approach 1 is--->"+p1.Average(arr1));
		System.out.println("Average time for approach 2 is--->"+p1.Average(arr2));
	}
}
