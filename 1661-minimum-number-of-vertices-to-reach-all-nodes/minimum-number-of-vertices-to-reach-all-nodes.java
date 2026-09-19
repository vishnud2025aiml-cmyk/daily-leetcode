class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        Set<Integer> s=new HashSet<>();

        for(int i=0;i<edges.size();i++){
            int v=edges.get(i).get(1);

            s.add(v);
        }

        List<Integer> res=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(!s.contains(i)){
                res.add(i);
            }
        }
        
        return res;

    }
}