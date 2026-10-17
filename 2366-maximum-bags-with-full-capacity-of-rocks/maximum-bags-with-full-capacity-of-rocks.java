class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        
        int count=0;
        for(int i=0;i<capacity.length;i++){
            capacity[i]=capacity[i]-rocks[i];
        }

        Arrays.sort(capacity);

        for(int i=0;i<capacity.length;i++){
            if(capacity[i]==0){
                count++;
            }
            if(capacity[i]>0 && capacity[i]<=additionalRocks){
                count++;
                additionalRocks-=capacity[i];
            }
        }
        return count;

    }
}