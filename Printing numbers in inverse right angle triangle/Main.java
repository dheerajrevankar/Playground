import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
        Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int g=n;
      for(int i=1;i<=n;i++)
      {
       // for(int spc=1;spc<=(n-i);++spc)
        //{
          //System.out.print(" ");
       // }
        for(int j=g;j>=1;j--)
        {
          System.out.print(j);
        }
        g--;
        System.out.println();
      }
        
          
	}
}