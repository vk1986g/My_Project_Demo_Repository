package com.myapp;

public class App 
{ 
    public String message(){
        System.out.println("Hallo message");
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public int addTwoNumbers(int a, int b) {
    	return a+b;
    }
    public int addThreeNumbers(int a, int b, int c) {
    	return a+b+c;
    }
    public int addNumbers(int...numbers) {
    	return numbers[0]+numbers[1];
    }
}
