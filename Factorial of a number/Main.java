import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
       Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      long fact=1;
      if(n<=0)
        System.out.println("error");
      else
      {
        
        for(int num=1;num<=n;++num)
           fact*=num;
         System.out.println(fact);
      }
      
	}
}