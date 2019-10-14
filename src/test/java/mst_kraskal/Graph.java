package mst_kraskal;

import disjoint_set.DisjointUnionSet;

import java.util.Arrays;

/**
 * Created by grigort on 11/12/2018.
 */
public class Graph {
    int V, E;
    Edge edges[];

    public Graph(int v, int e) {
        V = v;
        E = e;
        this.edges = new Edge[E];
        for (int i = 0; i < E; i++){
            edges[i] = new Edge();
        }
    }

    public Graph(Edge [] edges) {
        this.edges = edges;
    }

    public Graph kruskalMst(){
        Edge [] result = new Edge [V];
        int e = 0;
        Arrays.sort(edges);
        DisjointUnionSet unionSet = new DisjointUnionSet(V);
        for (Edge edge : edges){
            if (e == V-1)
                break;
            int x = unionSet.find(edge.src);
            int y = unionSet.find(edge.dst);
            if (x != y){
                result[e++] = edge;
                unionSet.union(x,y);
            }
        }
        return new Graph(result);
    }
}
