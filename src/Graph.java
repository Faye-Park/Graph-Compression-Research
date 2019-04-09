// Graph class (modified from: https://www.geeksforgeeks.org/graph-and-its-representations/)
// Code by: Faye Park

import java.util.*;

public class Graph {
	int vertNum;
	ArrayList<ArrayList<Integer>> adjacencyList;
	
	// Constructor
	public Graph(int vertNum) {
		this.vertNum = vertNum;
		adjacencyList = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < vertNum; i++) {
			adjacencyList.set(i, new ArrayList<Integer>());
		}	
	}
	
	// Adds edge between firstNode and secondNode
	static void addEdge(Graph graph, int firstNode, int secondNode) {
		graph.adjacencyList.get(firstNode).add(secondNode);
		graph.adjacencyList.get(secondNode).add(firstNode);
	}
	
	// Deletes edge between firstNode and secondNode
	static void deleteEdge(Graph graph, int firstNode, int secondNode) {
		graph.adjacencyList.get(firstNode).remove(secondNode);
		graph.adjacencyList.get(secondNode).remove(firstNode);
	}
	
	// Prints the vertices of the graph and the corresponding adjacency list
	static void printGraph(Graph graph) {
		for (int i = 0; i < graph.vertNum; i++) {
			System.out.println("Adjacency list for " + i + ":");
			System.out.print(">> " + Arrays.toString(graph.adjacencyList.toArray()));
			System.out.println();
		}
	}
}
