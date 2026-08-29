class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder res=new StringBuilder();
        int start=0;
        for(int x:spaces){
            String ans=s.substring(start,x);
            res.append(ans);
            res.append(" ");
            start=x;
        }
        res.append(s.substring(start,s.length()));
        return res.toString();
    }
}