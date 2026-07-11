class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length;
        List<List<Integer>> res=new ArrayList<>();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < graph[i].length; j++) { 
                adj.get(i).add(graph[i][j]); 
                // System.out.println(i+" "+graph[i][j]);
            }
        }

        List<Integer> temp=new ArrayList<>();

        temp.add(0);
        dfs(0,n-1,temp,adj,res);

        return res;
        

    }

    public void dfs(int start,int target,List<Integer> temp,List<List<Integer>> adj,List<List<Integer>> res){
        if(start==target){
            res.add(new ArrayList<>(temp));
            return;
        }
        
        for(int nei:adj.get(start)){
            temp.add(nei);
            dfs(nei,target,temp,adj,res);
            temp.remove(temp.size()-1);
        }
    }

}