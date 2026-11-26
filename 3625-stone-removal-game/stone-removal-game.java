class Solution {
    public boolean canAliceWin(int n) {
        int need=10;
        boolean res=false;
        while(need<=n){
            n-=need;
            if(res){
                res=false;
            }
            else{
                res=true;
            }
            need--;
        }
        return res;
    }
}