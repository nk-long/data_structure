package ds_program;
import java.util.Scanner;

public class Tree {

    static Scanner sc =null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        inorder(root);

    }

    static Node createTree(){
        Node root =null;
        System.out.println("enter data: ");
        int data = sc.nextInt();

        if(data==-1) return null;

        root = new Node(data);

        System.out.println("enter for left: "+data);
        root.left=createTree();

        System.out.println("enter for right: "+data);
        root.right=createTree();

        return root;
    }

    static void inorder(Node root){
        if(root==null) return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    
}

class Node{
    Node left,right;
    int data;

    public Node(int val){
        this.data=val;
    }
}
