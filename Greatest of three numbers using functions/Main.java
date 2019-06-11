import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int g2=0;
      if(n1>n2)
      {
        g2=n1;
        //System.out.print(n1);
      }
      else
      {
        g2=n2;
        //System.out.print(n2);
      }
    
         System.out.print(g3(n1,n2));
    }
      public static int g3(int g2,int n3)
      {
        int gr=0;
      
        if(g2>n3)
        {
          gr=g2;
        }
        else
        {
          gr=n3;
        }
        return gr;
      }
        
      
	}
