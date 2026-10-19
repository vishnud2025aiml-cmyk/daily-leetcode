class Solution {
    public List<Integer> findLonely(int[] nums) {
        int mx=0;
        for(int x:nums){
            mx=Math.max(x,mx);
        }

        int[] freq=new int[mx+2];

        for(int x:nums){
            freq[x]++;
        }

        List<Integer> res=new ArrayList<>();
        for(int x:nums){
            if(freq[x]>1 || (x>0 && freq[x-1]>0) || freq[x+1]>0){
                continue;
            }
            else{
                res.add(x);
            }
        }
        
        return res;

    }
}