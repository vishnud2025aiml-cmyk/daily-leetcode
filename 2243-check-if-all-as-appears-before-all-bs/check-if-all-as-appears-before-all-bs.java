class Solution {
    public boolean checkString(String s) {
        boolean B=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                B=true;
            }
            if(B && s.charAt(i)=='a'){
                return false;
            }
        }
        return true;
    }
}