/*

C MCdERMOTT
11 fEB 2021

*/


// INSTANC CLASS - ONLY PURPOSE IS TO WORK OUT CALCULATIONS

public class Numbers {

	private int num1;
	private int num2;
	private int total;



	// constructor: when we create an instance, responsible for making this happen
	public Numbers(){
		num1=0;
		num2=0;
		total=0;

	}


	//Setters
	// Returning in number1 from the App class
	public void setNum1(int num1){

		//copying the value of num1 from your app class and saving it in her in a variable called num1
		//taking a copy from app class

		this.num1=num1;
	}



	public void setNum2(int num2){

		this.num2=num2;

	}

	//Compute

	public void compute(){

		total = num1 + num2;

		}


	// Getters


	public int getTotal(){

		return total;

		}


}


//data numbers =  variables
// setters = take in the input, need a setter for every input
//compute = calculations
// getters = spit out the outputs
// void = return
















