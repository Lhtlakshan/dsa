package trees;

import java.util.Scanner;

public class BinaryTree {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(new Node(12));

        binaryTree.populate(new Scanner(System.in));
        binaryTree.display();
    }

    public static class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
        }
    }

    BinaryTree(Node root){
        this.root=root;
    }

    Node root;

    private void populate(Scanner scanner){ // root node adding
        System.out.println("Enter the root node : ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of (y/n)" + node.value);
        Boolean val = scanner.nextBoolean();

        if(val){
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of (y/n)" + node.value);
        Boolean valR = scanner.nextBoolean();

        if(valR){
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
    }

    void display(){
        display(root, "");
    }

    void display(Node node, String indent){
        if(node == null){
            return;
        }
        display(node.left, indent + " ");
        display(node.right, indent + " ");
    }
}


