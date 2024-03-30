class ComplexNumber {
    int real;
    int imaginary;

    // Constructor to initialize real and imaginary parts
    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber sum(ComplexNumber other) {
        int newReal = this.real + other.real;
        int newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Override toString method to display complex number properly
   // @Override
    public String toString() {
        return (real+imaginary)+ "i";
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4, 6);
        ComplexNumber c2 = new ComplexNumber(2, -3);
        
        // Printing c2 directly won't display properly because toString() is not overridden.
        // System.out.println("c1: " + c1);
        // System.out.println("c2: " + c2);
      	// Adding two complex numbers
           ComplexNumber  add =c1.sum(c2);
           System.out.println("Sum: " + add);
    }
}

