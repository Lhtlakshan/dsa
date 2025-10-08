package trees;

public class BinarySearchTree {
    Node root;

    BinarySearchTree(){}


    void insert(int value){
        root = insert(root, value);
    }

    Node insert(Node node, int value){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value > node.value ){
            node.left = insert(node.left, value);
        }

        if(value < node.value){
            node.right = insert(node.right, value);
        }

        return node;
    }

    //display

    public void display(){
        display(this.root, "Root node : ");
    }

    private void display(Node node, String details) {
        if(root == null){
            return;
        }

        System.out.println(details + root.value);
        display(node.left, "left value of " + node.value + " ");
        display(node.right, "right value of " + node.value + " ");
    }

}

class Node{

    int value;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
    }
}
