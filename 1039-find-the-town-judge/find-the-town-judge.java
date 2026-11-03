class Solution {
    public int findJudge(int n, int[][] trust) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        int[] outdegree=new int[n+1];

        for(int i=0;i<trust.length;i++){
            int u=trust[i][0];
            int v=trust[i][1];
            adj.get(u).add(v);
            outdegree[v]++;
        }

        for(int i=1;i<=n;i++){
            if(adj.get(i).size()==0 && outdegree[i]==n-1){
                return i;
            }
        }
        return -1;

    }
}