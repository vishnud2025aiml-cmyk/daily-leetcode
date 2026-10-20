class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        Map<Integer,Integer> mp=new HashMap<>();
        Arrays.sort(arr);
        for(int x:arr){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }

        int[] ans=new int[mp.size()];
        int index=0;
        for(int x:mp.values()){
            ans[index++]=x;
        }

        Arrays.sort(ans);
        
        int unique=mp.size();
        for(int x:ans){
            if(k>=x){
                k-=x;
                unique--;
            }
            else{
                return unique;
            }
            
        }
        return unique;

    }
}