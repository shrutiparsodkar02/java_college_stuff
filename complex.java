    class ComplexNumber {  
      
        // real and imaginary components of the complex integer are stored in variables.  
        int real, imag;  
      
        public ComplexNumber(int r, int i) {  
            this.real = r;  
            this.imag = i;  
        }  
      
        //Display the complex number in the form of (a + bi)  
        public void showC() {  
            System.out.print("(" + this.real + " + " + this.imag + "i" + ")");  
        }  
      
       /* // Addition of two complex numbers  
       // public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {  
      	    double add(int n1,int n2,obj1){
           // this.obj1=res;
            
           // double Result=res.real+res.image;
            // To perform addition of two complex numbers, the real parts of each number are added together.  
            res.real = n1.real + n2.real;  
      
            // Adding imaginary parts of both complex numbers  
            res.imag = n1.imag + n2.imag;  
      	    double Result=res.real+res.image;
            // Returning the result  
            return Result;  
        }  */
      
        public static void main(String arg[]) {  
      
            // Creating two complex numbers  
            ComplexNumber c1 = new ComplexNumber(4, 5);  
            ComplexNumber c2 = new ComplexNumber(10, 5);  
      	    ComplexNumber res = new ComplexNumber(0, 0);
            // Printing the complex numbers  
            System.out.print("First Complex number: ");  
            c1.showC();  
            System.out.print("\nSecond Complex number: ");  
            c2.showC();  
      
            // Calling add() to perform addition  
           // ComplexNumber res = add(c1, c2);  
      
            // Displaying the addition  
           // System.out.println("\nAddition is :");  
           // res.showC();  
        }  
    }  



