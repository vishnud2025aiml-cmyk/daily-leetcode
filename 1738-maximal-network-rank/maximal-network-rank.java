class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        Map<Integer,List<Integer>> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(i,new ArrayList<>());
        }
        for(int[] x:roads){
            mp.get(x[0]).add(x[1]);
            mp.get(x[1]).add(x[0]);
        }

        int res=0;

        for(int i=0;i<n;i++){
            int val=mp.get(i).size();
            for(int j=i+1;j<n;j++){
                int v=mp.get(j).size()+val;
                if(mp.get(i).contains(j)){
                    v--;
                }
                res=Math.max(res,v);
            }
        }
        return res;

    }
}