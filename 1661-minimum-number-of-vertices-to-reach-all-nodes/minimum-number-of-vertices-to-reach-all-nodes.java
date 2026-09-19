class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
        int[] indegree=new int[n];
        Arrays.fill(indegree,-1);

        for(int i=0;i<edges.size();i++){
            int v=edges.get(i).get(1);

            indegree[v]++;
        }

        List<Integer> res=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(indegree[i]==-1){
                res.add(i);
            }
        }
        
        return res;

    }
}