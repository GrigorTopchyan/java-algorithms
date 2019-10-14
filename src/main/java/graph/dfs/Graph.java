package graph.dfs;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by grigort on 11/20/2018.
 */
public class Graph {
    private int v;
    private LinkedList<Integer> adj [];

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void add(int a, int w){
        adj[a].add(w);
    }

    private void dfs(int s,boolean visited[]){
        System.out.println(s + " ");
        visited[s] = true;
        for (Integer a : adj[s]) {
            if (!visited[a]) {
                dfs(a, visited);
            }
        }
    }

    public void dfs(int s){
        boolean [] visited = new boolean[v];
        dfs(s,visited);
    }
}
