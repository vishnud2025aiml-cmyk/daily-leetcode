class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        if(stones.length==1){
            return stones[0];
        }
        
        for(int x:stones){
            pq.add(x);
        }

        while(pq.size()>1){
            
            int x=pq.poll(); 
            int y=pq.poll();

            if(x==y){
                continue;
            }
            else{
                pq.add(x-y);
            } 
        }
        
        return pq.isEmpty()?0:pq.poll();

    }
}