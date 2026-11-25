class Solution {
    public long countPairs(int n, int[][] edges) {
        long count=0;
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        long remaining=n;
        boolean[] visited=new boolean[n+1];

        for(int i=0;i<n;i++){
            if(!visited[i]){
                int size=0;
                Queue<Integer> q=new LinkedList<>();
                q.add(i);
                visited[i]=true;
                while(!q.isEmpty()){
                    int curr=q.poll();
                    size++;
                    for(int nei:adj.get(curr)){
                        if(!visited[nei]){
                            q.add(nei);
                            visited[nei]=true;
                        }
                    }
                }
                remaining-=size;
                count+=remaining*size;
            }
            
        }

        return count;



    }
}