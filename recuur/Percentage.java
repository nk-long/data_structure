package recuur;
import java.util.Scanner;

public class Percentage {
    static int count =1;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
       

       percentage(num);

        
    }

    static void percentage(int num) {
        float res=0 ;
        if(count==10){
            
            return;
        }
        res=((float)count/num)*100;
            System.out.println(count +" percent is "+res);
            count++;
            percentage(num);

    }
}
