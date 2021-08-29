package recuur;
import java.util.Scanner;

public class Fibonacci {
    static int count=1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num ");
        int i=sc.nextInt();
        System.out.println("enter second number");
        int j=sc.nextInt();
        System.out.println("enter length");
        int n=sc.nextInt();

        fibfun( i, j, n);
        System.out.println("function end");

        
    }
    static void fibfun(int i,int j,int n){
      
        if(count<n){
            int res= i+j;
            System.out.println(res);
            i=j;
            j=res;
            count++;
            fibfun(i, j, n);
        }
       
    }
    
}
