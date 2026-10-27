class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        List<List<int[]>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];

            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }

        int mincount=n;
        int res=0;

        for(int i=0;i<n;i++){
            int[] distance=new int[n];
            Arrays.fill(distance,Integer.MAX_VALUE);

            PriorityQueue<int[]> pq=new PriorityQueue<>(
                (a,b) -> Integer.compare(a[1],b[1])
            );

            distance[i]=0;

            pq.add(new int[]{i,0});

            while(!pq.isEmpty()){
                int[] curr=pq.poll();
                int city=curr[0];
                int dis=curr[1];
                for(int[] nei:adj.get(city)){
                    int nextcity=nei[0];
                    int weight=nei[1];
                    int new_distance=dis+weight;
                    if(new_distance<distance[nextcity]){
                        distance[nextcity]=new_distance;
                        pq.add(new int[]{nextcity,new_distance});
                    }
                }
            }
            int count=0;
            for(int j=0;j<n;j++){
                if(i!=j && distance[j]<=distanceThreshold){
                    count++;
                }
            }
            if(count<=mincount){
                mincount=count;
                res=i;
            }
        }

        return res;

    }
}