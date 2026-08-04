class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        List<Integer> res=new ArrayList<>();
        Map<Integer,Integer> mp=new HashMap<>();

        for(int x:nums){
            if(x<min){
                min=x;
            }
            if(x>max){
                max=x;
            }
            mp.put(x,0);
        }

        for(int i=min;i<=max;i++){
            if(mp.get(i)==null){
                res.add(i);
            }
        }
        return res;

    }
}