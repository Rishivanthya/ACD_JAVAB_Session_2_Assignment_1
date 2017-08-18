package highest;   //package declarations;

/*
 * This class is used to find the highest number of the given numbers 
 
 * Logical AND is used here to combine two or more condition in a single expressions */
public class HightNum {             //Class HightNum has been declared 
	public static void main(String args[])   //Main method starts
	{
		// TODO Auto-generated method stub
int value1=10;       // declaring the variable and initializing first value to the variables
int value2=20;       // declaring the variable and initializing second value to the variables
int value3=30;       // declaring the variable and initializing third value to the variables

if(value1>value3 && value1>value2)                    //first if condition check whether value1 is greater than value2 and value3. if the condition is True then value1 is greater than both.
System.out.println("The Largest value is value1=" +value1);   //printing the value1 if it is highest
else if (value2>value3 && value2>value1)              //Second if condition check whether value2 is greater than value1 and value3. if the condition is True then value2 is greater than both
System.out.println("The Largest value is value2=" +value2);    //printing the value2 if it is highest
else if (value3>value1 && value3>value2)              //Third if condition check whether value3 is greater than value1 and value2. if the condition is True then value3 is greater than both
	System.out.println("The Largest value is value3=" +value3);  //printing the value3 if it is highest
else                                            

	System.out.println("The given three values are distinct");    //Printing the statement if three values are distinct 



}
}// class closed 

