import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here 
        Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    System.out.print(square_of_number(n)); // Function call
	}
    // Function to find the sum of numbers
	public static int square_of_number(int y)
	{
     int square=y*y;
     return square;
    }
	
	 
}