

import java.util.Scanner;


public class Driver 
{
	static char[] row1 = {'_','_','_'};
	static char[] row2 = {'_','_','_'};
	static char[] row3 = {'_','_','_'};
	
	
	

	
	
	public static void main(String[] args)
	{
		
		while(true) {
		Driver.displayBoard();
		Driver.playGame(0, 'X');
		System.out.print("Please enter a row:");
		int row = Driver.getIntFromUser();
		System.out.print("Please enter a column:");
		int column = Driver.getIntFromUser();
		Driver.makeMove(row, column, 'X');
		Driver.displayBoard();
		
		}
		
		
	}
	static void playGame(int turn, char move)
	{
		if (turn == 0) {
			move = 'X';
			turn++;
		}
		else {
			move = 'O';
			turn--;
			
		}
		
		
	}
	
	
	static void makeMove(int row, int column, char move)
	{
		char[] theRow = row1;
		if(row == 2)
		{
			theRow = row2;
		}
		else if(row == 3)
		{
			theRow = row3;
		}
		theRow[column-1] = move;
	}
	
	static int getIntFromUser()
	{
		Scanner input = new Scanner(System.in);
		return input.nextInt();
		
	}
	
	static void displayRow(char[] row)
	{
		for(int i = 0; i < row.length; i = i + 1)
		{
			if(row[i] == '_')
			{
				System.out.print("___\t");
			}
			else if(row[i] == 'O')
			{
				System.out.print("_X_\t");
			}
			else
			{
				System.out.print("_O_");
			}
	
		}
		
		System.out.println("");
	}
	
	//static makes this function a class function
	static void displayBoard()
	{	
		Driver.displayRow(row1);
		Driver.displayRow(row2);
		Driver.displayRow(row3);
	}
}