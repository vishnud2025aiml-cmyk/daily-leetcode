class Solution {
    public int reverseDegree(String s) {
        int total=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int pos=(26-(ch-97));
            total+=(pos*(i+1));
        }
        return total;

    }
}