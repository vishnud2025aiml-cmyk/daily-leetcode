class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<double[]>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            double w=succProb[i];
            adj.get(u).add(new double[]{v,w});
            adj.get(v).add(new double[]{u,w});
        }

        PriorityQueue<double[]> pq=new PriorityQueue<>((a,b) -> Double.compare(b[1],a[1]));

        double[] distance=new double[n];
        distance[start_node]=1;
        pq.add(new double[]{start_node,1.00});

        while(!pq.isEmpty()){
            double[] curr=pq.poll();
            int city=(int) curr[0];
            double weight=curr[1];
            if(weight<distance[city]){
                continue;
            }
            for(double[] nei:adj.get(city)){
                int newcity=(int) nei[0];
                double dis=nei[1];
                double total=weight*dis;
                if(total>distance[newcity]){
                    distance[newcity]=total;
                    pq.add(new double[]{newcity,distance[newcity]});
                }
            }
        }

        return distance[end_node];


    }
}