import State.java;

/**
 * Node Node Node.
 * Class Node is used to build our graph
 * Question is, is it a BST? run the driver to find out!
 */
public class Node {

    /**
     * Array of Nodes. All children to this node.
     * For example, with the following node 1:
     *             A
     *            / \
     *           B   C
     * child looks like: [B,C]
     */
    public Node[] child;
    
    /**
     * How many children a Node has
     */
    public int childCount;

    /**
     * vertex of type string
     */
    private String vertex;

    /**
     * state of type State
     */
    public State state;

    /**
     * parent of type Node, tracks the parent nodes.
     */
    public Node[] parent;

    /**
     * int that tracks the number of parent nodes.
     */
    public int parentCount;

    /**
     * constructor
     * @arg string, the vertex of this
     */
    public Node(String vertex){
        this.vertex = vertex;
    }

    /**
     * Another constructor
     * @arg: string, the vertex
     * @arg length of child(ren) as type int.
     */
    public Node(String vertex, int childlen){
        this.vertex = vertex;
        childCount = 0;
        child = new Node[childlen];
    }

    /**
     * Add a child node 
     * @param type Node, the node to add.
     */
    public void addChildNode(Node adj){
        adj.state = State.Unvisited;
        //if(childCount < 30){
            this.child[childCount] = adj;
            childCount++;
        //}
    }

    /**
     * accessor for child
     * @return array of type Node, public variable child.
     */
    public Node[] getChild(){
        return child;
    }

    /**
     * accessor for string
     * @return string, the vertex of this Node.
     */
    public String getVertex(){
        return vertex;
    }

    /**
     * accessor for parents
     */
    public Node[] getParents(){
        return parents;
    }

}
