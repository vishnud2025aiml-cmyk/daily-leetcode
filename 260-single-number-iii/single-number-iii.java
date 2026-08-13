class Solution {
    public int[] singleNumber(int[] nums) {

        int[] res=new int[2];
        Map<Integer,Integer> mp=new HashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }

        int i=0;
        for(int x:nums){
            if(mp.get(x)==1){
                res[i]=x;
                i++;
            }
        }

        return res;

    }
}