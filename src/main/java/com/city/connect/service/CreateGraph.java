package com.city.connect.service;
import com.city.connect.domain.Graph;

public class CreateGraph {
	
	public static Graph createGraph() {
	    Graph graph = new Graph();
	    graph.addVertex("Boston");
	    graph.addVertex("Newyork");
	    graph.addVertex("Philadelphia");
	    graph.addVertex("Newark");
	    graph.addVertex("Trenton");
	    graph.addVertex("Albany");
	    
	    graph.addEdge("Boston", "Newyork");
	    graph.addEdge("Philadelphia", "Newark");
	    graph.addEdge("Newark", "Boston");
	    graph.addEdge("Trenton", "Albany");
	    return graph;
	}

}
