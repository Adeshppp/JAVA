import java.util.*;


public class BinaryTrees {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
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

        public static void preorder(Node node){
            if(node == null) return;
            System.out.print(node.data+" --> ");
            preorder(node.left);
            preorder(node.right);
        }

        public static void inorder(Node node){
            if(node == null) return;
            inorder(node.left);
            System.out.print(node.data+" --> ");
            inorder(node.right);
        }

        public static void postorder(Node node){
            if(node == null) return;
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data+" --> ");

        }

        public static void levelOrder(Node node){
            if(node == null) return;
            Queue<Node> q = new LinkedList<>();
            q.add(node);
            q.add(null);
            while(!q.isEmpty()){
                Node currentNode = q.remove();
                if(currentNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currentNode.data+" ");
                    if(currentNode.left != null) q.add(currentNode.left);
                    if(currentNode.right != null) q.add(currentNode.right);
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
