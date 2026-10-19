class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }

        List<Integer> res=new ArrayList<>();
        for(int x:nums){
            if(mp.get(x)>1 || mp.get(x-1)!=null || mp.get(x+1)!=null){
                continue;
            }
            else{
                res.add(x);
            }
        }
        return res;

    }
}