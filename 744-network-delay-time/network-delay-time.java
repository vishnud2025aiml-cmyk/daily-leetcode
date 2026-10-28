class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj=new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int w=times[i][2];

            adj.get(u).add(new int[]{v,w});
        }

        boolean[] visited=new boolean[n+1];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> Integer.compare(a[1],b[1]));
        pq.add(new int[]{k,0});
        int[] distance=new int[n+1];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[k]=0;        

        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int city=curr[0];
            int weight=curr[1];
            for(int[] nei:adj.get(city)){
                int newcity=nei[0];
                int dis=nei[1];
                int total=weight+dis;
                if(total<distance[newcity]){
                    distance[newcity]=total;
                    pq.add(new int[]{newcity,total});
                }
            }
        }

        int res=0;
        for(int i=1;i<=n;i++){
            if(distance[i]==Integer.MAX_VALUE){
                return -1;
            }
            res=Math.max(res,distance[i]);
        }

        return res;
        
    }
}