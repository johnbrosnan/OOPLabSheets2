package labsheet1;

//NumbersMenu.java
/*This program reads in a sequence of up to 10 whole numbers, one at a time, from the user
 *and allows the user from a menu of options to decide what operation to perform on
 *the number entered*/

import javax.swing.JOptionPane;

public class NumbersMenu{
	public static void main(String args[])
		{
			int number,choice,i=0;
			double factorial;
			String text="";

			do{
				number = Integer.parseInt(JOptionPane.showInputDialog("-------Iteration " + (i+1) + "--------\n\nPlease enter any whole number: "));

				choice = Integer.parseInt(JOptionPane.showInputDialog("\n\nWhat would you like to do?\n\n" +
					             "1. Determine if the number is odd or even\n" +
					             "2. Find the factorial of the number\n" +
					             "3. Quit the program\n\nPlease enter your choice:"));
			    
			    switch(choice)
			    {
			    	case 1:
			    		if(number%2==0)
			    			text+="\n\nThe number you entered is even";
			    		else
			    			text+="\n\nThe number you entered is odd";
			    		break;
			    	case 2:
			    		if(number<0)
			    			text+="\n\nCannot get the factorial of a negative number!";
			    		else
			    			{
								factorial = 1;

								for (int j = 1; j <= number; j++)
									factorial *= j;

								text += "\n\nThe factorial of the number you entered is " + factorial;
			    			}
			    		break;
			    	case 3:
						text+="\n\nQuitting the program earlier than anticipated .... goodbye";
			    }

			    JOptionPane.showMessageDialog(null,text,"Number Data",JOptionPane.INFORMATION_MESSAGE);
			    i++;
			    text="";

			}while(i<10 && choice!=3);
		}
}

