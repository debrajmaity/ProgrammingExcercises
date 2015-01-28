import java.util.*;

public class Vertex{
	
	private int id;
	private Vertex parent;
	private boolean seen;

	public LinkedList<Edge> Adj;

	Vertex(int id){
		this.id=id;
		Adj=new LinkedList<Edge>();
	}

	int getvertexID(){
		return this.id;
	}

	void printAdjList(){
		for(Edge e:Adj){
			e.printEdge();
		}
	}

}