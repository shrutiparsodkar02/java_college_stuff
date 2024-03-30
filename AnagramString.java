class AnagramString{
	 String sortString(String s){
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
	 boolean checkAnagram(String s1,String s2){
	 	String str1=sortString(s1);
	 	//System.out.println(str1);
	 	String str2=sortString(s2);
	 	//System.out.println(str2);
	 		if(str1.equals(str2)){
	 			System.out.println("yes it is anagram string");
	 			return true;
	 		}
	 		else{
	 			System.out.println("no it is not anagram string");
	 			return false;
	 		}
 	 }
	 public static void main(String args[]){
	 	AnagramString a= new AnagramString();
	 	//System.out.println(a.sortString("cedab"));
	 	a.checkAnagram("listen","silent");
	 	a.checkAnagram("dhanshri","ganeshri");
	 	
	 }
}
