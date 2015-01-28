import java.util.*;

class Graph{
	
	Vertex[] v;

	public static void main(String args[]){

		Graph g=new Graph(4);
		g.addEdge(1,2,3);
		g.addEdge(1,3,4);
		g.addEdge(1,4,5);
		g.addEdge(2,4,3);
		
		//g.printAdjList();

		g.PrintGraph();
	}
	
	//create a graph with n number of nodes
	Graph(int n){
		v=new Vertex[n];
		for(int i=0;i<n;i++){
			v[i]=new Vertex(i+1);
		}
	}

	void addEdge(int a,int b, int weight){
		Edge e=new Edge(v[a-1],v[b-1],weight);
		v[a-1].Adj.add(e);
		v[b-1].Adj.add(e);
	}

	void PrintGraph(){

		for(int i=0;i<v.length;i++){
			for(Edge e:v[i].Adj){
				System.out.print(v[i]+" ");
				e.printEdge();
			}
		}
	}
}