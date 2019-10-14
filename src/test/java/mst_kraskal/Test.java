package mst_kraskal;

import java.util.Arrays;

/**
 * Created by grigort on 11/12/2018.
 */
public class Test {
    public static void main(String[] args) {
        int V = 4;  // Number of vertices in graph 
        int E = 5;  // Number of edgess in graph 
        Graph graph = new Graph(V, E);

        // add edges 0-1 
        graph.edges[0].src = 0;
        graph.edges[0].dst = 1;
        graph.edges[0].weight = 10;

        // add edges 0-2 
        graph.edges[1].src = 0;
        graph.edges[1].dst = 2;
        graph.edges[1].weight = 6;

        // add edges 0-3 
        graph.edges[2].src = 0;
        graph.edges[2].dst = 3;
        graph.edges[2].weight = 5;

        // add edges 1-3 
        graph.edges[3].src = 1;
        graph.edges[3].dst = 3;
        graph.edges[3].weight = 15;

        // add edges 2-3 
        graph.edges[4].src = 2;
        graph.edges[4].dst = 3;
        graph.edges[4].weight = 4;

        Graph mst = graph.kruskalMst();
        System.out.println(Arrays.toString(mst.edges));
    }
}
