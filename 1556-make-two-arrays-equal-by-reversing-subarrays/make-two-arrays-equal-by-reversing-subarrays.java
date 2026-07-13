class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        Map<Integer,Integer> mp1=new HashMap<>();
        Map<Integer,Integer> mp2=new HashMap<>();

        for(int x:target){
            mp1.put(x,mp1.getOrDefault(x,0)+1);
        }

        for(int x:arr){
            mp2.put(x,mp2.getOrDefault(x,0)+1);
        }

        if(mp1.equals(mp2)){
            return true;
        }
        return false;

    }
}