import java.util.LinkedList;

public class BreadthFirstSearch{
    public static void main(String[] args){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        // 1 is neighbored with 2 and 3
        node1.addAdjacent(node2);
        node1.addAdjacent(node3);
        // 2 is neighbored with 4
        node2.addAdjacent(node4);
        // 4 is neighbored with node 5
        node5.addAdjacent(node4);
        // 5 is neighbored with node 6
        node5.addAdjacent(node6);
        // 2 is neighbored with 7 and 8
        node2.addAdjacent(node7);
        node2.addAdjacent(node8);
        node8.addAdjacent(node9);
        node9.addAdjacent(node10);

        breadthFirst(node1);
    }

    /* 
                    1
            2           3
        4   7   8
        5       9
        6       10

        Output: 1, 2, 3, 4, 7, 8, 5, 9, 6, 10
    */

    // O(b^d) space and time worst case - b=branching factor, d=depth
    public static void breadthFirst(Node start){
        LinkedList<Node> nodes = new LinkedList<Node>();
        nodes.add(start);
        start.state = Node.State.Visiting;
        while(!nodes.isEmpty()){
            Node current = nodes.remove();
            System.out.println("Printing: "+current.value+" ");
            for(Node neighbor: current.adjacent){
                if(neighbor.state==Node.State.Unvisited){
                    neighbor.state=Node.State.Visiting;
                    nodes.add(neighbor);
                }
            }
            current.state = Node.State.Visited;
        }
    }
}