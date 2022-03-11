package Binary_Tree_Traversal;


class Node{
    char key;
    Node left,right;

    Node(char key){
        this.key=key;

    }
}
class Tree_Traversal{
    Node root;
    void preordertraversal( Node n){
        if (n!= null){

            //R(o) L R
            System.out.print(n.key +" ");
            preordertraversal(n.left);
            preordertraversal(n.right);
        }

    }
    void postordertraversal( Node n) {
        if (n != null) {
            // L R R(o)

            preordertraversal(n.left);
            preordertraversal(n.right);
            System.out.print(n.key + " ");
        }
    }
        void inordertraversal( Node n){
            if (n!= null){
               // L R(o) R

                preordertraversal(n.left);
                System.out.print(n.key +" ");
                preordertraversal(n.right);
            }

        }

    }

public class Binary_Tree_Traversal {
    public static void main(String[] args) {
        Tree_Traversal tree_traversal = new Tree_Traversal();
        //Defining the tree
            tree_traversal.root=new Node('A');
            tree_traversal.root.left= new Node('B');
            tree_traversal.root.right= new Node('C');
            tree_traversal.root.left.left=new Node('D');
            tree_traversal.root.left.right = new Node('E');
            tree_traversal.root.right.left= new Node('F');

            tree_traversal.preordertraversal(tree_traversal.root);
        System.out.println();
            tree_traversal.postordertraversal(tree_traversal.root);
        System.out.println();
            tree_traversal.inordertraversal(tree_traversal.root);

    }
}
