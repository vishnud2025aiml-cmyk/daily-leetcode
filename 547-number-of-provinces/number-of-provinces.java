class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;

        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    adj.get(i+1).add(j+1);
                    // System.out.println(i+1 +" "+(j+1));
                }
            }
        }

        boolean[] visited=new boolean[n+1];
        Queue<Integer> q=new LinkedList<>();

        int count=0;

        for(int i=1;i<=n;i++){
            if(!visited[i]){
                count++;
                visited[i]=true;
                q.offer(i);
                while(!q.isEmpty()){
                    int curr=q.poll();
                    
                    for(int nei:adj.get(curr)){
                        if(!visited[nei]){
                            q.offer(nei);
                            visited[nei]=true;
                            // System.out.println(nei);
                        }
                    }
                }
            }
        
        }

        return count;

    }
}