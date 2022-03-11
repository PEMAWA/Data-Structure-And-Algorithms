package Binary_Search_Tree;

import java.util.logging.SocketHandler;

class Node{
    char key;
    Node left,right;

    Node(char key){
        this.key=key;

    }
}

class Binary_Solution {
    Node root;

    void insertKey(char key) {
        root = insertInTree(root, key);

    }

    Node insertInTree(Node root, char key) {
        // Conditions for inserting nodes
        if (root == null) {
            root = new Node(key);
            return root;
            //If the tree is empty make the first key the root
        }
        if (key < root.key) {
            root.left = insertInTree(root.left, key);

            // If the key is less than the root key push it on the left side
        } else if (key > root.key) {
            root.right = insertInTree(root.right, key);
            // If the key is greater than the root key push it on the right side
        }
        return root;

    }
//A method to traverse the tree
    void preorderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

    }
}
public class BST {
    public static void main(String[] args) {
        Binary_Solution binary_solution = new Binary_Solution();
        //Inserting the nodes
        binary_solution.insertKey('C');
        binary_solution.insertKey('I');
        binary_solution.insertKey('B');
        binary_solution.insertKey('G');
        binary_solution.insertKey('M');
        binary_solution.insertKey('A');

        //Traversing the tree on preorder
        binary_solution.preorderTraversal(binary_solution.root);

    }
}
