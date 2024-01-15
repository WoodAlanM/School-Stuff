package capitalsearch;

public class BST {
    class Node{
        String state;
        String capital;
        Node leftChild;
        Node rightChild;
    
        Node(String state, String capital){
            this.state = state;
            this.capital = capital;
            leftChild = null;
            rightChild = null;
        }
    }

    // Initialize a root node
    Node root;

    public BST(){
        this.root = null;
    }

    // This method recursively adds nodes to the BST
    private Node addNode(Node node, String state, String capital){
        // If there are no nodes, create one
        if (node == null){          
            node = new Node(state, capital);
            return node;
        }

        // Otherwise check the previous node against the
        // next one to determine its placement
        if (state.compareTo(node.state) < 0){
            node.leftChild = addNode(node.leftChild, state, capital);
        } else if (state.compareTo(node.state) > 0){
            node.rightChild = addNode(node.rightChild, state, capital);
        }
        return node;
    }

    public void add(String state, String capital){
        root = addNode(root, state, capital);
    }

    // This method recursively searches the BST to find and
    // return the node with the entered state value
    private String findCapitalRecursive(Node node, String state){
        if (node == null){
            return null;
        }
        if (state.compareTo(node.state) < 0){         
            return findCapitalRecursive(node.leftChild, state);
        }else if (state.compareTo(node.state) > 0){
            return findCapitalRecursive(node.rightChild, state);
        }else {
            return node.capital;
        }
    }

    // Use this method to get the capital associated with the entered state
    public String findCapital(String state){
        String capital = findCapitalRecursive(root, state);
        String response;
        if (capital != null){
            response = "The capital of " + state + " is: " + capital;
            return response;
        } else {
            response = "State not found.";
            return response;
        }
    }
}
