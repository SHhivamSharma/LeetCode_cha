///947. Most Stones Removed with Same Row or Column

class Solution {
    public int removeStones(int[][] stones) {
        int n = stones.length;
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
                    uf.union(i, j);
                }
            }
        }
        return n - uf.count;
    }
}

class UnionFind {
    public int[] rank;
    public int[] root;
    public int count;

    public UnionFind(int n) {
        rank = new int[n];
        root = new int[n];
        count = n;
        for (int i = 0; i < n; i++) {
            rank[i] = 1;
            root[i] = i;
        }
    }

    public void union(int i, int j) {
        int rootI = find(i);
        int rootJ = find(j);
        if (rootI != rootJ) {
            if (rank[i] == rank[j]) {
                rank[i] += 1;
                root[rootJ] = rootI;
            } else if (rank[i] > rank[j]) {
                root[rootJ] = rootI;
            } else {
                root[rootI] = rootJ;
            }
            count--;
        }
    }

    private int find(int i) {
        if (i == root[i])
            return i;
        else
            return root[i] = find(root[i]);
    }
}