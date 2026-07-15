class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        List<List<Integer>> adj=new ArrayList<>();

        Map<Integer,Integer> mp=new HashMap<>();
        for(int x:restricted){
            mp.put(x,0);
        }

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] row:edges){
            adj.get(row[0]).add(row[1]);
            adj.get(row[1]).add(row[0]);
        }

        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[n];
        q.offer(0);
        visited[0]=true;
        int count=0;

        while(!q.isEmpty()){
            int curr=q.poll();

            count++;
                   
            for(int nei:adj.get(curr)){
                if(!visited[nei] && mp.get(nei)==null){
                    q.offer(nei);
                    visited[nei]=true;
                }
            }
        }

        return count;

    }
}