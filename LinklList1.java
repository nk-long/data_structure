class LinkLinkOp{
    Node head;
    Node tail;

    static class Node{
        int val;
        Node next;
        public Node(int data){
            val=data;
        }
    }

    public void add(int val){

        Node n = new Node(val);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }

    }

   public void addMid(int pos,int val){
       int size=1;
       Node n1 = new Node(val);
       Node temp = head;
       Node temp1=null;
      
       
       while(temp!=null){
        if(pos==1)
        {
            // temp=head;
             head=n1;
             n1.next=temp;
             break;
        }
        else if(size==pos){
              
               temp1.next=n1;
               n1.next = temp;
           }
           temp1=temp;
           temp = temp.next;
           size++;
       }
   }

   public void remove(int pos) {
       int size=1;
       Node Temp = head,perv=null;

       while(Temp!=null){
           if(pos==1)
           {
              head=Temp.next;
              break;  
           }
           else if(size==pos){
               perv.next=Temp.next;
           }
           perv = Temp;
          Temp= Temp.next;
          size++;
       }

   }

    public void printdata(){
        Node temp = head;
        while(temp!=null){
                System.out.println(temp.val);
               temp=temp.next;
        }
    }



}

public class LinklList1 {
      public static void main(String[] args) {
        LinkLinkOp ll = new LinkLinkOp();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.printdata();
        ll.addMid(1, 25);
        System.out.println("==================================================");
        ll.printdata();
        ll.remove(1);
        System.out.println("==================================================");
        ll.printdata();
      

    }

    
}
