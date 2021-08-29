package ds;
interface demo{
    default void print(){
        System.out.println("interface default method");
    }
    public void print2();

  //  public void print3();
}


class demo2 implements demo{

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("override in demo 2 ");
    }

    @Override
    public void print2() {
        // TODO Auto-generated method stub
        System.out.println("demo 2 override method");
    }

}


public class DefaultMethod {

    public static void main(String[] args) {
        demo d = new demo2();
        d.print();
        d.print2();
    }
    
}
