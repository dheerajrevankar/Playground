import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int g=1;
      for(int i=1;i<=n;i++)
      {
        for(int spc=1;spc<=(n-i);++spc)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=g;j++)
        {
          System.out.print("*");
        }
        g+=2;
        System.out.print("\n");
      }
    

      
	}
}