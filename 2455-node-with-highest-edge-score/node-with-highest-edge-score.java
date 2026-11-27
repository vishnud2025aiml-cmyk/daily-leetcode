class Solution {
    public int edgeScore(int[] edges) {
        Map<Integer,Long> mp=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            mp.put(edges[i],mp.getOrDefault(edges[i],0L)+i);
        }

        int res=0;
        long max=0;
        for(int x:mp.keySet()){
            if(mp.get(x)>max || (mp.get(x)==max && x<res)){
                max=mp.get(x);
                res=x;
            }
        }

        return res;

    }
}