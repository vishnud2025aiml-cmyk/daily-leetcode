class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {

        int[] res=new int[queries.length];
        int i=0;
        for(int[] query:queries){
            int count=0;
            int x1=query[0];
            int y1=query[1];
            int r=query[2];
            for(int[] point:points){
                int x2=point[0];
                int y2=point[1];
                if((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)<=r*r){
                    count++;
                }
            }
            res[i++]=count;
        }
        return res;
    }
}