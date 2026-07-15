class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=0;
        int sumeven=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                sumeven+=i;
            }
            else{
                sumodd+=i;
            }
        }

        return gcd(sumeven,sumodd);

    }

    public int gcd(int l,int s){
        while(s!=0){
            int rem=l%s;
            l=s;
            s=rem;
        }
        return l;
    }

}