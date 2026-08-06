class Solution {
    public int smallestNumber(int n, int t) {
        
        for(int i=0;i<100;i++){
            int temp=n+i;
            int pro=1;
            while(temp>0){
                int digit=temp%10;
                pro*=digit;
                temp/=10;
            }
            if(pro%t==0){
                return n+i;
            }
        }
        return n;

    }
}