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
    public void inOrderTraversal(){
        _inOrderTraversal(root);
    }

    private void _inOrderTraversal(Node node){
        if(node == null)return;
        else {
            _inOrderTraversal(node.left);
            System.out.print(node.data+" ");
            _inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal(){
        _preOrderTraversal(root);
    }

    private void _preOrderTraversal(Node node){
        if(node == null)return;
        else {
            System.out.print(node.data+" ");
            _preOrderTraversal(node.left);
            _preOrderTraversal(node.right);
        }
    }
    public void postOrderTraversal(){
        _postOrderTraversal(root);
    }
    private void _postOrderTraversal(Node node){
        if(node == null)return;
        else {
            _postOrderTraversal(node.left);
            _postOrderTraversal(node.right);
            System.out.print(node.data+" ");

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
        System.out.println();
        binaryTree.inOrderTraversal();
        System.out.println();
        binaryTree.preOrderTraversal();
        System.out.println();
        binaryTree.postOrderTraversal();
        System.out.println();
    }
}