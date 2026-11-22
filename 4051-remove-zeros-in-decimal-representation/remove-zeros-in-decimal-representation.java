class Solution {
    public long removeZeros(long n) {
        String ans=n+"";
        StringBuilder res=new StringBuilder();
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)!='0'){
                res.append(ans.charAt(i));
            }
        }
        long val=Long.parseLong(res.toString());
        return val;
    }
}