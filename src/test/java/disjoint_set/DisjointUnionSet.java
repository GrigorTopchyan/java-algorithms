package disjoint_set;

/**
 * Created by grigort on 11/12/2018.
 */
public class DisjointUnionSet {
    int [] rank, paent;
    int n;

    public DisjointUnionSet(int n) {
        this.n = n;
        this.rank = new int[n];
        this.paent = new int[n];
        initializeSet();

    }

    private void initializeSet() {
        for (int i = 0; i < n; i++){
            paent[i] = i;
        }
    }

    public int find(int x ){
        if (paent[x] != x){
            paent[x] = find(paent[x]);
        }
        return paent[x];
    }

    public void union(int x, int y){
        int xRoot = find(x);
        int yRoot = find(y);

        if (xRoot == yRoot)
            return;

        if (rank[xRoot] <= rank[yRoot]){
            paent[yRoot] = xRoot;
        }else{
            paent[xRoot] = yRoot;
        }
        rank[xRoot] = rank[xRoot] + 1;
    }

    public boolean contains(int x) {
        return x == find(x);
    }
}
