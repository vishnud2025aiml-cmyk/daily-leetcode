class Solution {
    public int maxProduct(int[] nums) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:nums){
            pq.add(x);
        }

        return (pq.poll()-1)*(pq.poll()-1);

    }
}