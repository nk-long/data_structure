package ds_program;
class MyLinkedList {
    Node head,tail;
    
    class Node{
        int val;
        Node next;
        
        public Node(int num){
            this.val=num;
            this.next=null;
        }
    }

    /** Initialize your data structure here. */
    public MyLinkedList() {
        
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int num=0;
        Node temp =head;
        while(temp!=null){
           if(num==index)
            {
                return temp.val;
            }
            temp=temp.next;
            num++;
        }
        return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newnode= new Node(val);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            System.out.println("Add At head "+tail.val);
        }
        else{
            tail.next=newnode;
            tail=newnode;
            System.out.println("Add At head "+tail.val);
        }
        
        
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node newnode = new Node(val);
        
        tail.next=newnode;
        tail=newnode;
        System.out.println("Add At tail "+tail.val);
        
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        int num=0;
        int len=0;
        Node temp=head;
        Node temp1=null;
        Node n = new Node(val);
        while(temp!=null)
        {
            if(index==0){
                head=n;
                n.next=temp;
                System.out.println("Add At index "+num +" value " +n.val);
                break;
            }
           else if(num==index)
            {
                temp1.next=n;
                n.next=temp;
                System.out.println("Add At index "+n.val);
               break;
            }
            else if(len == index){
                System.out.println("Add At index "+ "called add at tail fun");

               addAtTail(val);

            }
            temp1=temp;
            temp=temp.next;
            num++;
            len++;
        }
        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        int num=0;
        Node temp1=null;
        Node temp=head;
        while(temp!=null)
        {
            if(index==0)
            {
                System.out.println("delete At index "+temp.val);

                head=temp.next;

                break;
            }
           else if(num==index)
            {
                System.out.println("delete At index "+temp.val);

               temp1.next=temp.next ;
            }
            temp1=temp;
            temp=temp.next;
            num++;
        }
        
    }
    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
        ml.addAtHead(7);
        ml.addAtHead(2);
        ml.addAtHead(1);
        ml.addAtIndex(3, 0);
        ml.deleteAtIndex(2);
        ml.addAtHead(6);
        ml.addAtTail(4);
        ml.get(4);
        ml.addAtHead(4);
        ml.addAtIndex(5, 0);
        ml.addAtHead(6);
    }
}

