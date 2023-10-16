/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testcomplexnumber;

/**
 *
 * @author cui
 */
public class TestComplexNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComplexNumber Number1=new ComplexNumber();
        ComplexNumber Number2=new ComplexNumber(2,4);
        ComplexNumber Number3=new ComplexNumber(Number2);
        ComplexNumber Number4=new ComplexNumber();
        Number4.setRealpart(4);
        Number4.setImaginarypart(5);
        System.out.println("After Addition:");
        Number4.add(Number2);
        System.out.println("After Multiplication:");
       System.out.println(Number4.Multiply(Number3).getRealpart()+"+"+Number4.Multiply(Number3).getImaginarypart()+"i");
       System.out.println("Conjugate:");
       System.out.println( Number4.Conjugate().getRealpart()+"-"+Number4.getImaginarypart()+"i");
    }
    
}
