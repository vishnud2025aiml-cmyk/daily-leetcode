class Solution {
    public boolean scoreBalance(String s) {
        for(int i=0;i<s.length();i++){
            int sum1=0;
            int sum2=0;
            for(int j=0;j<=i;j++){
                sum1+=(s.charAt(j)-'a'+1);
            }
            for(int k=i+1;k<s.length();k++){
                sum2+=(s.charAt(k)-'a'+1);
            }
            if(sum1==sum2){
                return true;
            }
        }
        return false;
    }
}