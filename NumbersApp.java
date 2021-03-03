/*
NumbersApp
Claire McDermott
11 Feb 2021

*/


import java.util.*;

public class NumbersApp{

	public static void main(String [] args){

		//vaibales
		int num1;
		int num2;
		int total;


		//Objects
		Scanner keyboard = new Scanner(System.in);
		Numbers myNumbers = new Numbers();


		//input
		System.out.println("enter first number");
		num1 = keyboard.nextInt();
		myNumbers.setNum1(num1);

		System.out.println("enter second number");
		num2 = keyboard.nextInt();
		myNumbers.setNum1(num2);


		//process
		myNumbers.compute();


		//output
		total=myNumbers.getTotal();
		System.out.println("your total " +total);


		}


}











//main method
//variables
//objects
//input
//process
//outputs