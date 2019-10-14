package mst_kraskal;

/**
 * Created by grigort on 11/12/2018.
 */
public class Edge implements Comparable<Edge>{
    int src, dst, weight;

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }

    @Override
    public String toString() {
        return "src" + src + " -> (" + weight + ") dst" + dst;
    }
}
