import java.util.*;

class Node {
    int data;
    Node right;
    Node left;

    Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }
}

class BinaryTree {
    Node root = null;
    Scanner sc = new Scanner(System.in);

    void insertNode(int data) {
        if (root == null) {
            System.out.println("Enter the data");
            data = sc.nextInt();
            Node newNode = new Node(data);
            newNode = root;
        } else {
            Node current = root;
            while (true) {
                System.out.println("current node is" + current.data);
                System.out.println("where do you want to insert L=0,R=1");
                int ch = sc.nextInt();
                System.out.println("enter the data");
                data = sc.nextInt();
                Node newNode = new Node(data);
                if (ch == 0) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    } else {
                        current = current.left;
                    }
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    } else {
                        current = current.right;
                    }
                }
            }
        }
    }
}

public class BinaryT {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Binary list = new Binary();
        int ans = 1;
        do {
            System.out.println("enter the data");
            System.out.println("1.insert a node");
            System.out.println("2.display");
            System.out.println("exit(0)");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    list.insertNode();
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("enter a valid choice");

            }
            System.out.println("enter your choice to continue(0,1)");
            ans = sc.nextInt();
        } while (ans == 1);
    }
}