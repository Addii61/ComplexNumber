/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcomplexnumber;

/**
 *
 * @author cui
 */
public class ComplexNumber {
    private int realpart;
    private int imaginarypart;
    //private float complexnumber=this.realpart+this.complexnumber;
    public ComplexNumber(){
        this.realpart=0;
        this.imaginarypart=0;
    }
    public ComplexNumber(int r,int i){
        this.realpart=r;
        this.imaginarypart=i;
    }
    public ComplexNumber(ComplexNumber c){
        this.realpart=c.realpart;
        this.imaginarypart=c.imaginarypart;
    }

    public int getRealpart() {
        return realpart;
    }

    public void setRealpart(int realpart) {
        this.realpart = realpart;
    }

    public int getImaginarypart() {
        return imaginarypart;
    }

    public void setImaginarypart(int imaginarypart) {
        this.imaginarypart = imaginarypart;
    }
    public void add(ComplexNumber num){
        int r=this.realpart+num.realpart;
        int t=this.imaginarypart+num.imaginarypart;
        System.out.println(r+"+"+t+"i");
    }
    public ComplexNumber Multiply(ComplexNumber b){
        int newrealpart=this.realpart*b.realpart-this.imaginarypart*b.imaginarypart;
        int newimginarypart=this.imaginarypart*b.realpart+this.realpart*b.imaginarypart;
        return new ComplexNumber(newrealpart,newimginarypart);
       
    }
    public ComplexNumber Conjugate(){
        return new ComplexNumber(this.realpart,-this.imaginarypart);
    }
    
}
