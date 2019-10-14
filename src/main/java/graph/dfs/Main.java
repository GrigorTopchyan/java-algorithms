package graph.dfs;

import graph.dfs.Graph;

/**
 * Created by grigort on 11/19/2018.
 */
public class Main {
    public static void main(String[] args) {
      Graph g = new Graph(4);

        g.add(0, 1);
        g.add(0, 2);
        g.add(1, 2);
        g.add(2, 0);
        g.add(2, 3);
        g.add(3, 3);

        System.out.println("Following is Dept First Traversal "+
                "(starting from vertex 2)");
        g.dfs(2);
    }
}
