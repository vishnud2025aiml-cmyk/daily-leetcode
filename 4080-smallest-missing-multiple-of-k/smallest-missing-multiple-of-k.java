class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s=new HashSet<>();
        for(int x:nums){
            s.add(x);
        }
        for(int i=1;i<=101;i++){
            if(!s.contains(i*k)){
                return i*k;
            }
        }
        return k;
    }
}