class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }

        int[][] ans=new int[mp.size()][2];

        int i=0;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            ans[i++]=new int[]{entry.getKey(),entry.getValue()};
        } 

        Arrays.sort(ans, (a,b) -> {
            if(a[1] == b[1]){
                return Integer.compare(b[0],a[0]); 
            }
            return Integer.compare(a[1],b[1]);
        });

        int[] res=new int[nums.length];
        int index=0;
        for(int[] x:ans){
            for(int j=0;j<x[1];j++){
                res[index++]=x[0];
            }
        }
        return res;
    }
}