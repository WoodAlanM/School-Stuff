package capitalsearch;

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

public class BST {
    // Initialize a root node
    private Node root;

    public BST(){
        this.root = null;
    }

    // This method recursively adds nodes to the BST
    private Node addNode(Node root, String state, String capital){
        // If there are no nodes, create one
        if (root == null){
            System.out.println("Root node created using state: " + state + "and capital: ");
            return new Node(state, capital);
        }

        // Otherwise check the previous node against the
        // next one to determine its placement
        if (state.compareTo(root.state) < 0){
            
            root.leftChild = addNode(root.leftChild, state, capital);
        } else if (state.compareTo(root.state) > 0){
            root.leftChild = addNode(root.leftChild, state, capital);
        } else {
            return root;
        }
        return root;
    }

    public void add(String state, String capital){
        root = addNode(root, state, capital);
    }

    // This method recursively searches the BST to find and
    // return the node with the entered state value
    private String findCapitalRecursive(Node root, String state){
        System.out.println("Got to findCapitalRecursive");
        if (state.compareTo(root.state) < 0){
            System.out.println("Got to left recursive checker.");            
            return findCapitalRecursive(root.leftChild, state);
        }else if (state.compareTo(root.state) > 0){
            System.out.println("Got to right recursive checker.");
            return findCapitalRecursive(root.rightChild, state);
        }else {
            return root.capital;
        }
    }

    // Use this method to get the capital associated with the entered state
    public String findCapital(String state){
        System.out.println("Got to findCapital");
        String capital = findCapitalRecursive(root, state);
        return capital;
    }
}
