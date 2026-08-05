class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int edge[]:invocations){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
        }

        boolean[] visited=new boolean[n];

        Queue<Integer> q=new LinkedList<>();

        q.offer(k);
        visited[k]=true;
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int nei:adj.get(curr)){
                if(!visited[nei]){
                    visited[nei]=true;
                    q.add(nei);
                }
            }
        }
        
        for(int edge[] : invocations){
            int u=edge[0];
            int v=edge[1];
            if(!visited[u] && visited[v]){
                List<Integer> ans=new ArrayList<>();
                for(int i=0;i<n;i++){
                    ans.add(i);
                }
                return ans;
            }
        }

        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(!visited[i]){
                ans.add(i);
            }
        }
        return ans;


    }
}