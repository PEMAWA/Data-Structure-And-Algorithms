package Graphs;

import java.util.ArrayList;
import java.util.Stack;
public class Depth_First_Search {
    int Vertices;
    ArrayList<Integer>adjancency[];
    Depth_First_Search(int noOfVertices){
        Vertices=noOfVertices;
        adjancency=new ArrayList[noOfVertices];

        for(int i= 0;i<noOfVertices;i++){
            adjancency[i]=new ArrayList<>();
        }
    }
    void edge(int x, int y){
        adjancency[x].add(y);
    }
    void depthFirstSearch(int sourceVertex) {
        boolean[] visited = new boolean[Vertices];
        Stack<Integer> S1 = new Stack<>();
        S1.push(sourceVertex);
        int node;
        while (!S1.empty()) {
            sourceVertex = S1.peek();
            S1.pop();

            for (int i = 0; i < adjancency[sourceVertex].size(); i++) {
                node = adjancency[sourceVertex].get(i);
                if (!visited[node]) {
                    S1.push(node);
                }
            }
            if (visited[sourceVertex] == false) {
                System.out.print(sourceVertex + " ");
                visited[sourceVertex] = true;
            }
        }
    }
    public static void main(String[] args) {
        Depth_First_Search DFS = new Depth_First_Search(6);
        DFS.edge(0,1);
        DFS.edge(0,2);
        DFS.edge(0,5);

        DFS.edge(1,0);
        DFS.edge(1,2);

        DFS.edge(2,1);
        DFS.edge(2,2);
        DFS.edge(2,3);
        DFS.edge(2,4);

        DFS.edge(3,2);

        DFS.edge(4,2);
        DFS.edge(4,5);

        DFS.edge(5,0);
        DFS.edge(5,4);
        System.out.println("The result of the Depths First Search");
        DFS.depthFirstSearch(0);
    }
}
