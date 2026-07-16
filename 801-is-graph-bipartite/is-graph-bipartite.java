class Solution {
    public boolean isBipartite(int[][] graph) {
        List<List<Integer>> adj=new ArrayList<>();

        int n=graph.length;

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
                System.out.println(i +" "+graph[i][j]);
            }
        }
        
        Queue<Integer> q=new LinkedList<>();
        int[] colors=new int[n];

        for(int i=0;i<n;i++){
            if(colors[i]==0){
                q.offer(i);
                colors[i]=1;

                while(!q.isEmpty()){
                    int curr=q.poll();
                    for(int nei:adj.get(curr)){
                        if(colors[nei]==0){
                            colors[nei]=-colors[curr];
                            q.offer(nei);
                        }
                        else if(colors[nei]==colors[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    
    }
}