 import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
        Scanner in = new Scanner(System.in);
	    int base = in.nextInt();
        int expo = in.nextInt();
        System.out.println(power(base,expo));
    }
	  public static int power(int base,int expo)
	{
	   int pwr = 1;
        while(expo>=1)
        {
          pwr = pwr * base;
          expo--;
        }
        return pwr;
      }
          
	}