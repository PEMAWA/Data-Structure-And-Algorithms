package Graphs;

import java.util.ArrayList;
import java.util.Iterator;

public class BreathFirstSearch {
    int Vertices;
    ArrayList<Integer> adjancency[];
    //Adjacency Array

    BreathFirstSearch(int noOfVertex){
        Vertices=noOfVertex;
        adjancency=new ArrayList[noOfVertex];

        for ( int i=0; i<noOfVertex;i++){
            adjancency[i] = new ArrayList<>();
        }
    }
    void  edge(int x , int y){
        adjancency[x].add(y);

    }
    void breathFirstSearch (int sourceVertex){
        boolean [] visited = new  boolean [Vertices];
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        visited[sourceVertex] = true;
        a1.add(sourceVertex);
        while(!a1.isEmpty()){
            sourceVertex= a1.remove(0);
            System.out.print(sourceVertex+" ");
            Iterator it =adjancency[sourceVertex].iterator();
            while (it.hasNext()){
                int n = (int) it.next();
                if(!visited[n]){
                    visited[n] = true;
                    a1.add(n);
                }
            }
        }
    }
    public static void main(String[] args) {
        BreathFirstSearch bsf = new BreathFirstSearch(6);
        bsf.edge(0,1);
        bsf.edge(0,2);
        bsf.edge(0,5);

        bsf.edge(1,0);
        bsf.edge(1,2);

        bsf.edge(2,0);
        bsf.edge(2,1);
        bsf.edge(2,2);
        bsf.edge(2,3);
        bsf.edge(2,4);

        bsf.edge(3,2);

        bsf.edge(4,2);
        bsf.edge(4,5);

        bsf.edge(5,0);
        bsf.edge(5,0);

        bsf.breathFirstSearch(0);

    }
}
