class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced=0;
        boolean[] used=new boolean[baskets.length];
        for(int x:fruits){
            boolean ans=false;
            for(int i=0;i<baskets.length;i++){
                if(!used[i] && x<=baskets[i]){
                    used[i]=true;
                    ans=true;
                    break;
                }
            }
            if(!ans){
                unplaced++;
            }
        }
        return unplaced;
    }
}