class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] res=new int[2];
        
        Map<Integer,Integer> mp=new HashMap<>();

        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }

        int zero=0;
        int one=0;
        for(int x:mp.values()){
            one+=x%2;
            zero+=x/2;
        }

        res[0]=zero;
        res[1]=one;
        return res;

    }
}