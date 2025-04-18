package trees.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }


        public static void preorder(Node root){
            if(root == null) return;
            System.out.print(root.data+" --> ");
            preorder(root.left);
            preorder(root.right);
        }


        public void inorder(Node root) {
            if(root == null) return;
            inorder(root.left);
            System.out.print(root.data+" --> ");
            inorder(root.right);
        }

        public void postorder(Node root) {
            if(root==null) return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data +" --> ");
        }

        public void levelOrder(Node root) {
            if(root == null) return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null) q.add(currNode.left);
                    if(currNode.right != null) q.add(currNode.right);
                }
            }

        }
    }


    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("root is "+root.data);
        System.out.println("root left is "+root.left.data);

        System.out.println("root right is "+root.right.data);

        System.out.print("Preorder traversal : ");
        tree.preorder(root);
        System.out.println();
        System.out.print("Inorder traversal : ");
        tree.inorder(root);
        System.out.println();
        System.out.print("Postorder traversal : ");
        tree.postorder(root);
        System.out.println();
        System.out.println("Levelorder traversal : ");
        tree.levelOrder(root);

    }
}
