/**
 * Driver class
 * Contains one method, which builds a new graph
 * Learn more about what a graph is here: https://en.wikipedia.org/wiki/Graph_(abstract_data_type)
 * THe graph here is predetermined, a keen mind could see how this could be manipulated
 * to create whatever graph we want.
 * @author: superrmatt 
 */
public class Driver {

    /**
     * Creates a new, hardcoded graph for proof of concept.
     * Can be altered to create whatever kind of graph we want.
     * @return: g of type Graph, the graph we just built.
     */
	public static Graph createNewGraph(){
        Graph g = new Graph();
        //set the size of our graph
		Node[] temp = new Node[8];
        
        //new Node, check out Node.java (2nd constructor) to fully understand this....
        //but, we are adding a new Node with vertex "A" and 3 children.
		temp[0] = new Node("A", 1);
		temp[1] = new Node("B", 1);
		temp[2] = new Node("C", 1);
        temp[3] = new Node("D", 1);
        temp[4] = new Node("E", 1);
        temp[5] = new Node("F", 1);
        temp[6] = new Node("G", 1);
        temp[7] = new Node("H", 1);
        
        temp[0].addChildNode(temp[1]);
        temp[1].addChildNode(temp[2]);
        temp[2].addChildNode(temp[3]);

        temp[3].addChildNode(temp[4]);
        temp[4].addChildNode(temp[5]);
        temp[5].addChildNode(temp[6]);

        
        for (int i = 0; i < 7; i++){
            g.addNode(temp[i]);
        }
        return g;
	}
    
    /**
     * main, creates new instance of the graph class.
     * Once created we can test our breadthfirst search function.
     * @arg: array of strings, no args needed here.
     */
	public static void main(String[] args){
        System.out.println("running");
		Graph gBFS = createNewGraph();
		BreadthFirst BFS = new BreadthFirst();
		
		BFS.bfs(gBFS.getNode()[0]);
	}
}
