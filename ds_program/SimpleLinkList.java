package ds_program;

class SimpleLinkList{
    Node head;

    static class Node{
        int value;
        Node next;

        public Node(int val){
            value = val;
            next = null;
        }

    }

    public void printdata(){
        Node n = head;
        while(n!=null){
            System.out.println(n.value+" ");
            n=n.next;
        }
    }

    public static void main(String[] args) {
System.out.println("running");

        SimpleLinkList list = new SimpleLinkList();

        list.head = new Node(1);
        Node second = new Node(2);
        Node third =new Node(3);

        list.head.next = second;
        second.next = third;

        list.printdata();
    }
}