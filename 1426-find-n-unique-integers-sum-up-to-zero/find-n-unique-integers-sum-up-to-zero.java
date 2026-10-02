class Solution {
    public int[] sumZero(int n) {
        int[] res=new int[n];
        if(n%2==1){
            boolean check=true;
            for(int i=0;i<n-1;i++){
                if(check){
                    res[i]=i+1;
                    check=false;
                }
                else{
                    res[i]=-res[i-1];
                    check=true;
                }
            }
            res[n-1]=0;
        }
        else{
            boolean check=true;
            for(int i=0;i<n;i++){
                if(check){
                    res[i]=i+1;
                    check=false;
                }
                else{
                    res[i]=-res[i-1];
                    check=true;
                }
            }
        }
        return res;

    }
}