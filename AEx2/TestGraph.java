package extra;

//import java.util.Iterator;

public class TestGraph {

	
	
	
	public static void main(String[] args) {
		Graph<Character> g = new ArrayGraph<Character>();
		Vertex<Character> v1 = new Vertex<Character>('a');
		Vertex<Character> v2 = new Vertex<Character>('b');
		Vertex<Character> v3 = new Vertex<Character>('c');
		Vertex<Character> v4 = new Vertex<Character>('d');
		Vertex<Character> v5 = new Vertex<Character>('f');
		
		//add the vertices v1 - v5 in any order
		g.addVertex(v1);
		g.addVertex(v4);
		g.addVertex(v5);
		g.addVertex(v2);
		g.addVertex(v3);
		
		
		
		Edge<Character> edge1 = new Edge<Character>(v1,v2);
		Edge<Character> edge2 = new Edge<Character>(v2,v3);
		Edge<Character> edge3 = new Edge<Character>(v2,v4);
		Edge<Character> edge4 = new Edge<Character>(v4,v5);
		
		g.addEdge(edge1);
		g.addEdge(edge2);
		g.addEdge(edge3);
		g.addEdge(edge4);
		
		//System.out.println("Graph (i):\nThe vertices are: " + printVertices(g));
		//System.out.println("The edges are: " + printEdges(g));
		
		
		// g is now graph (i)
		Vertex<Character> v6 = new Vertex<Character>('g');
		g.addVertex(v6);
		g.addEdge(new Edge<Character>(v3,v6));
		
		//System.out.println("Graph (ii):\nThe vertices are: " + printVertices(g));
		//System.out.println("The edges are: " + printEdges(g));
		
		//g is now graph (ii)
		Vertex<Character> v7 = new Vertex<Character>('b');
		g.addVertex(v7);
		
		// no effect, graph (iii)
		
		g.deleteVertex(v4);
		//g is now graph (iv)
			
		//print the vertex set, not won't be in any particular order
		if(g.vertexSet()!=null) System.out.println("g now has " + g.vertexSet().size() + " vertices");	
		System.out.println("They are:");
		for(Vertex<Character> v:g.vertexSet()) System.out.println(v+", ");
		
		
		//print the edge set, not won't be in any particular order
		if(g.edgeSet()!=null) System.out.println("and " + g.edgeSet().size() + " edges");
		System.out.println("They are:");
		for(Edge<Character> e:g.edgeSet()) System.out.println(e + ", ");

		
		

	}

}
