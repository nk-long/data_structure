package ds;
public class DoubblyLinklist {
    Node head,tail;

    static class Node{
        int val;
        Node next;
        Node prev;
        public Node(int data){
            val = data;
            next = null;
            prev = null;
        }
    }

    public void add(int data) {
        Node n = new Node(data);
        if(head==null){
            head=n;
            tail=n;
            System.out.println("if callled");
        }
        else{
           
                n.prev = tail;
                tail.next = n;
                tail = n;
                
            System.out.println("else callled "+n.prev+ " "+n.next);
        }
    }


    public void midAdd(int loc,int data){
        Node temp = head;
        int size=1;
    
        while(temp!=null){
            if(size==loc){
                Node temp2 = temp.prev;
                 Node n1 = new Node(data);
                 temp2.next=n1;
                 n1.next=temp;
                 n1.prev=temp2;
              //  System.out.println(temp2.val);
            }
            size++;
            temp=temp.next;
        }
    }

    public void remove(int data){
        Node temp = head;
        while(temp!=null){
            if(temp.val==data){
                temp.next.prev=temp.prev;
                temp.prev.next=temp.next;

            }
            temp=temp.next;
        }

    }

    public void printdata(){
        Node temp =head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoubblyLinklist dl =new DoubblyLinklist();
        dl.add(10);
        dl.add(20);
        dl.add(30);
        dl.add(40);
        dl.printdata();
        System.out.println("============================================");
        dl.midAdd(3,35);
        dl.printdata();
        System.out.println("============================================");
        dl.remove(35);
        dl.printdata();
    }
    
}
