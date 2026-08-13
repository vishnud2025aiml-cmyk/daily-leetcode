class Solution {
    public int singleNumber(int[] nums) {

        Map<Integer,Integer> mp=new HashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }

        int i=0;
        int res=0;
        for(int x:nums){
            if(mp.get(x)==1){
                res=x;
            }
        }

        return res;
    }
}