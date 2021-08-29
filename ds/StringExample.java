package ds;
public class StringExample {

    public static void main(String[] args) {
        String s1 ="xyz";
    String s2 = s1;
    String s3 = "abc";
   // s1 ="syz";

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s1);

    System.out.println(s1.hashCode()+" "+s2.hashCode());
    System.out.println(s1.compareTo(s3));
    System.out.println(s1.equals(s3));
    }
    

    
    
}
