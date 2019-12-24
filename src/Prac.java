import java.util.LinkedList;

class Node{
    int data;
    Node left,right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree{
    Node root;
    BinaryTree(int data){
        root = new Node(data);
    }
    BinaryTree(){

    }
    public void levelOrderTraversal(){
        if(root!=null){
            LinkedList<Node> nodes = new LinkedList<>();
            nodes.add(root);
            while (!nodes.isEmpty()){
                Node tmpNode = nodes.poll();
                System.out.print(tmpNode.data+" ");
                if(tmpNode.left != null) nodes.add(tmpNode.left);
                if(tmpNode.right != null) nodes.add(tmpNode.right);
            }
        }
    }
    public void insertDataPls(int data){
        if(root == null){
            root = new Node(data);
        }else {
            LinkedList<Node> nodes = new LinkedList<>();
            nodes.add(root);
            while (!nodes.isEmpty()){
                Node tmpNode = nodes.poll();
                if(tmpNode.left == null){
                    tmpNode.left = new Node(data);
                    return;
                }else nodes.add(tmpNode.left);
                if(tmpNode.right == null){
                    tmpNode.right = new Node(data);
                    return;
                }else nodes.add(tmpNode.right);
            }
        }
    }
}

public class Prac{
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertDataPls(1);
        binaryTree.insertDataPls(2);
        binaryTree.insertDataPls(3);
        binaryTree.insertDataPls(4);
        binaryTree.insertDataPls(5);
        binaryTree.levelOrderTraversal();
    }
}