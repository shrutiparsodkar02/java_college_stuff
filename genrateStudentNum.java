class Year{
	final int totalStudents;
	final int regularStudents;
	final int tfwsStudents;
	final int dsyStudents;
	int Students[];
	
	Year( int totalStudents,int regularStudents,int tfwsStudents,int dsyStudents){
		this.totalStudents=totalStudents;
		this.regularStudents=regularStudents;
		this.tfwsStudents=tfwsStudents;
		this.dsyStudents=dsyStudents;
	}
	private void genrateStudents(){
		Students=new int[totalStudents];
		int i=0;int j=150; int k=500;
		for(i=0; i<totalStudents;i++){
			if(i<regularStudents){
				Students[i]=i+1;
			}
			else if(j<150+tfwsStudents){
				Students[i]=j+1;
				j++;
			}
			else if(k<500+dsyStudents){
				Students[i]=k+1;
				k++;
			}
		
		}
		
	}
	void displayStudents(int[] arr){
		for(int num:Students){
			System.out.println(num);
		}
	}
	long genrateRandom(){
	//here we are genrating random index
		long random=System.nanoTime()%78;
		//long display=();
		long display=Students[(int)random];
		return display;
	}
	public static void main(String args[]){
		Year y =new Year(78,64,3,11);
		//int[] arr1=y.genrateStudents();
		y.genrateStudents();
		long random=y.genrateRandom();
		System.out.println("value--->"+random);
		//y.displayStudents(
}arr1);
	}

