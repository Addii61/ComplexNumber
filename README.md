Complex Number Java Implementation
This repository contains a Java implementation of complex numbers with basic operations like addition, multiplication, and conjugation.

Table of Contents
About
Usage
Contributing
About
This Java program defines a ComplexNumber class that represents complex numbers with real and imaginary parts. The class supports operations such as addition, multiplication, and conjugation.

Usage
To use the ComplexNumber class and its operations, follow these steps:

Clone or download the repository.
Import the ComplexNumber class into your Java project.
Instantiate ComplexNumber objects and perform operations like addition, multiplication, and conjugation.
Example usage is provided in the TestComplexNumber class within this repository.
public static void main(String[] args) {
    // Create complex numbers
    ComplexNumber Number1 = new ComplexNumber();
    ComplexNumber Number2 = new ComplexNumber(2, 4);
    
    // Perform addition
    ComplexNumber Number4 = new ComplexNumber();
    Number4.setRealpart(4);
    Number4.setImaginarypart(5);
    System.out.println("After Addition:");
    Number4.add(Number2);
    
    // Perform multiplication
    System.out.println("After Multiplication:");
    System.out.println(Number4.Multiply(Number2).getRealpart() + "+" + Number4.Multiply(Number2).getImaginarypart() + "i");
    
    // Perform conjugation
    System.out.println("Conjugate:");
    System.out.println(Number4.Conjugate().getRealpart() + "-" + Number4.getImaginarypart() + "i");
}
Contributing
Contributions are welcome! If you have improvements or suggestions for this Java implementation, feel free to open an issue or create a pull request.
