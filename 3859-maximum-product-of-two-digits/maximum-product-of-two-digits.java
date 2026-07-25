class Solution {
    public int maxProduct(int n) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        while(n>0){
            pq.add(n%10);
            n/=10;
        }
        int m1=pq.poll();
        int m2=pq.poll();
        return m1*m2;

    }
}