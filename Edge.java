import java.util.*;

public class Edge {
	
	Vertex v1;
	Vertex v2;
	int weight;

	Edge(Vertex v1,Vertex v2, int weight){

		this.v1=v1;
		this.v2=v2;
		this.weight=weight;
	}


	Vertex otherEnd(Vertex v){
		if(v==v1){
			return v2;
		}else{
			return v1;
		}
	}

	void printEdge(){
		System.out.println("From "+v1.getvertexID()+" To "+v2.getvertexID());
	}
}