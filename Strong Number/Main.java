import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      long fact=1;
      int n1=n/100;
       for(int num=1;num<=n1;++num)
       {
           fact*=num;
        // System.out.println(fact);
       }
      long fact1=1;
      int n2=(n/10)%10;
       for(int num=1;num<=n2;++num)
       {
           fact1*=num;
         //System.out.println(fact1);
       }
      int fact2=1;
      int n3=n%10;
       for(int num=1;num<=n3;++num)
       {
           fact2*=num;
        // System.out.println(fact2);
       }
      long sum=fact+fact1+fact2;
      if(sum==n)
        System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}