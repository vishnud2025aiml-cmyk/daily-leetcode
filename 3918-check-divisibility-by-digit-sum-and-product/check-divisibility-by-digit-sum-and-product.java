class Solution {
    public boolean checkDivisibility(int n) {
        int check=n;
        int sum=0;
        int pro=1;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            pro*=digit;
            n/=10;
        }

        if(check%(sum+pro)==0){
            return true;
        }
        return false;

    }
}