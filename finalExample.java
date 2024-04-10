 class FinalVariableExample {
    public static void main(String[] args) {
        final int x = 10; // Declare and initialize a final variable 'x'
        System.out.println("Initial value of x: " + x);

        // Attempt to reassign a value to 'x', which will result in a compilation error
        // Uncommenting the line below will result in an error
        // x = 20; // Error: cannot assign a value to final variable 'x'

        final double PI; // Declare a final variable 'PI' without initializing it
        PI = 3.14159; // Initialize 'PI' later
        System.out.println("Value of PI: " + PI);

        // Attempting to reassign a value to 'PI' after initialization will result in a compilation error
        // Uncommenting the line below will result in an error
        // PI = 3.14; // Error: cannot assign a value to final variable 'PI'
    }
}

