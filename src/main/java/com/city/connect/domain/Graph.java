package com.city.connect.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	
	private Map<Vertex, List<Vertex>> adjVertices;
	
	public Graph(){
		this.adjVertices = new HashMap<>();
	}

	public Graph(Map<Vertex, List<Vertex>> adjVertices) {
		this.adjVertices = adjVertices;
	}


	public Map<Vertex, List<Vertex>> getAdjVertices() {
		return adjVertices;
	}

	public void setAdjVertices(Map<Vertex, List<Vertex>> adjVertices) {
		this.adjVertices = adjVertices;
	}
	
	public void addVertex(String label) {
	    adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
	    
	}
	
	
	public void addEdge(String label1, String label2) {
	    Vertex v1 = new Vertex(label1);
	    Vertex v2 = new Vertex(label2);
	    adjVertices.get(v1).add(v2);
	    adjVertices.get(v2).add(v1);
	}

	// standard constructor, getters, setters
	
}
