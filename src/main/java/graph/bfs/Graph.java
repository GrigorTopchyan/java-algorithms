package graph.bfs;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by grigort on 11/19/2018.
 */
public class Graph {
    private int v;
    private LinkedList<Integer> adj[];

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        IntStream.range(0,v).forEach(i -> adj[i] = new LinkedList<>());
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
    }

    public void bfs(int s){
        boolean visited [] = new boolean[v];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(s);
        visited[s] = true;

        while (!queue.isEmpty()){
            int a = queue.poll();
            System.out.print(a + " ");
            Iterator<Integer> iterator = adj[a].iterator();
            while (iterator.hasNext()){
                int b = iterator.next();
                if (!visited[b]){
                    visited[b] = true;
                    queue.add(b);
                }
            }
        }
    }
}
