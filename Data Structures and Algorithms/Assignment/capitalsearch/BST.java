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

    // This method recursively adds nodes to the BST
    private Node addNode(Node current, String state, String capital){
        // If there are no nodes, create one
        if (current == null){
            return new Node(state, capital);
        }

        // Otherwise check the previous node against the
        // next one to determine its placement
        if (state.compareTo(current.state) < 0){
            current.leftChild = addNode(current.leftChild, state, capital);
        } else if (state.compareTo(current.state) > 0){
            current.leftChild = addNode(current.leftChild, state, capital);
        } else {
            return current;
        }
        return current;
    }

    public void add(String state, String capital){
        root = addNode(root, state, capital);
    }

    // This method recursively searches the BST to find and
    // return the node with the entered state value
    private Node findCapitalRecursive(Node current, String state){
        if (state == current.state){
            return current;
        }

        if (state.compareTo(current.state) < 0){
            return findCapitalRecursive(current.leftChild, state);
        } else if (state.compareTo(current.state) > 0){
            return findCapitalRecursive(current.rightChild, state);
        }
        return null;
    }

    // Use this method to get the capital associated with the entered state
    public String findCapital(String state){
        Node node = findCapitalRecursive(root, state);
        return node.capital;
    }
    
}
