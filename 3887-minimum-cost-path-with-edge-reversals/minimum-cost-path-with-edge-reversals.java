class Solution {
    public int minCost(int n, int[][] edges) {
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }   
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int w=edges[i][2];
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w*2});    
        }

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> Integer.compare(a[1],b[1]));

        int[] distance=new int[n];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[0]=0;
        pq.add(new int[]{0,0});

        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int city=curr[0];
            int weight=curr[1];
            if(weight>distance[city]){
                continue;
            }
            for(int[] nei:adj.get(city)){
                int newcity=nei[0];
                int dist=nei[1];
                int total=weight+dist;
                if(total<distance[newcity]){
                    distance[newcity]=total;
                    pq.add(new int[]{newcity,total});
                }
            }
        }

        if(distance[n-1]==Integer.MAX_VALUE){
            return -1;
        }

        return distance[n-1];
        
    }
}