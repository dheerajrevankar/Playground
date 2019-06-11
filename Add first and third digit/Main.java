import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      //int n2 = in.nextInt();
      int d1=n/100;
      int d3=n%10;
      int sum=d1+d3;
      
      System.out.print(sum);
	}
}