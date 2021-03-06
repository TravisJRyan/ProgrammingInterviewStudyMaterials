import java.util.ArrayList;

public class Node {

    public int value;
    public ArrayList<Node> adjacent;
    State state;

    public Node(int value){ 
        this.value = value;
        adjacent = new ArrayList<Node>();
        state = State.Unvisited;
    }

    public void addAdjacentDirected(Node newAdject){
        adjacent.add(newAdjacent);
    }

    public void addAdjacent(Node newAdjacent){
        adjacent.add(newAdjacent);
        newAdjacent.adjacent.add(this);
    }

    public ArrayList<Node> getAdjacent(){
        return adjacent;
    }

}