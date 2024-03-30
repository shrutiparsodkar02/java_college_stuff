import java.util.*;
class AnagramString{
	 String sortString_1_(String s){
	 	char[] c1=s.toCharArray();
	 	    for (int i = 0; i < c1.length; i++) {     
      			  for (int j = i+1; j < c1.length; j++) {     
				   if(c1[i] > c1[j]) {    
				      char temp = c1[i];    
				       c1[i] = c1[j];    
				       c1[j] = temp;    
				   }     
       			 }     
   		 }    
	 	/*for(int i=0;i<s.length();i++){
	 		System.out.print(c1[i]);
	 	}*/
	 	return String.valueOf(c1);	
	 }
	 String sortString_2_(String s){
	 	char[] c1=s.toCharArray();
	 	Arrays.sort(c1);
	 	return String.valueOf(c1);
	 }
	 boolean checkAnagram_1_(String s1,String s2){
	 	String str1=sortString_1_(s1);
	 	//System.out.println(str1);
	 	String str2=sortString_1_(s2);
	 	//System.out.println(str2);
	 		if(str1.equals(str2)){
	 			//System.out.println("yes it is anagram string");
	 			return true;
	 		}
	 		else{
	 			//System.out.println("no it is not anagram string");
	 			return false;
	 		}
 	 }
 	 boolean checkAnagram_2_(String s1,String s2){
	 	String str1=sortString_2_(s1);
	 	//System.out.println(str1);
	 	String str2=sortString_2_(s2);
	 	//System.out.println(str2);
	 		if(str1.equals(str2)){
	 			//System.out.println("yes it is anagram string");
	 			return true;
	 		}
	 		else{
	 			//System.out.println("no it is not anagram string");
	 			return false;
	 		}
 	 }
	 public static void main(String args[]){
	 	AnagramString a= new AnagramString();
	 	//System.out.println(a.sortString("cedab"));
	 	//a.checkAnagram_1_("listen","silent");
	 	//a.checkAnagram_2_("listen","silent");
	 	long starttime=0;
	 	long endtime=0;
	 	long averagtime1=0;
	 	long averagtime2=0;
	 	int i=0;
	 	int[] arr1=new int[10];
	 	int[] arr2=new int[10];
	 	while(i<10){
	 		starttime=System.nanoTime();
	 		a.checkAnagram_1_("listen","silent");
	 		endtime=System.nanoTime();
	 		averagtime1=endtime-starttime;
	 		/*arr1=averagtime;
	 		for(int i=0;i<arr1.length;i++){
	 			long sum=0;
	 			sum=sum+arr1[i];
	 		}
	 		long av1=sum/arr1.length;*/
	 		
	 		
	 		
	 		
	 		starttime=System.nanoTime();
	 		a.checkAnagram_2_("listen","silent");
	 		endtime=System.nanoTime();
	 		averagtime2=endtime-starttime;
	 		//arr2=averagtime;
	 		/*for(int i=0;i<arr2.length;i++){
	 			long sum=0;
	 			sum=sum+arr2[i];
	 		}
	 		long av2=sum/arr2.length;*/
	 		
	 		
	 		//System.out.println(av1);
	 		i++;
	 	}
	 	System.out.println(averagtime1);
	 	System.out.println(averagtime2);
	 }
}
