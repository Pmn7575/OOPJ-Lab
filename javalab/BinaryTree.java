import java.util.*;
    class Node
    {
        int data;
        Node left,right; 
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
    }
    class Binary{
    Node root=null;
    Scanner sc=new Scanner(System.in);
    void insertNode()
    {
        
        if(root==null)
        {
            System.out.println("Enter the data");
            int data=sc.nextInt();
            Node newNode=new Node(data);
            root=newNode;
        }
       else{
        Node current=root;
        while(true)
        {
            System.out.println("current node is"+current.data);
            System.out.println("Enter where you want to insert (L=1,R=0)");
            int ch=sc.nextInt();
            System.out.println("Enter the data");
            int data=sc.nextInt();
            Node newNode=new Node(data);
            if(ch!=0)
            {
               if(current.left==null)
               {
                current.left=newNode;
                break;
               } 
               else{
                current=current.left;
               }
            }
            else{
                 if(current.right==null)
               {
                current.right=newNode;
                break;
               } 
               else{
                current=current.right;
               }
            }
        }
       }
    }
    void display()
    {
        System.out.println("In-order traversal");
        Stack<Node> stack=new Stack<>();
        Node current = root;
        while(current!=null || !stack.isEmpty()){
            while(current != null){
                stack.push(current);
                current=current.left;
            }
        current=stack.pop();
        System.out.println(current.data+" ");
        current=current.right;
        }
        System.out.println();
    }
 }
 public class BinaryTree
 {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Binary list=new Binary();
        int ans=1;
        do{
            System.out.println("Enter choice");
            System.out.println("1.Insert a Node");
            System.out.println("2.Display");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    list.insertNode();
                break;
                case 2:
                    list.display();
                break;
                case 3:
                    sc.close();
                  return;
                default:
                    System.out.println("Enter the valid choice");
            }
        System.out.println("Do you want to continue");
        ans=sc.nextInt();
        }
        while(ans==1);
    }
 }  






 