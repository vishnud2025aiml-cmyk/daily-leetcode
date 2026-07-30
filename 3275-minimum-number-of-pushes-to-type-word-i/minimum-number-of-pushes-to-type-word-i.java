class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int ans=0;

        if(n<=8){
            return n;
        }

        if(n<=16){
            ans=8+(n-8)*2;
        }
        else if(n<=24){
            ans=8+16+(n-16)*3;
        }
        else if(n<=26){
            ans=8+16+24+(n-24)*4;
        }
        return ans;
        


    }
}