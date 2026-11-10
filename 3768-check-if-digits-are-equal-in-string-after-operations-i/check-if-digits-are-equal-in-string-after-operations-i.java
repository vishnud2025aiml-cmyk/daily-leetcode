class Solution {
    public boolean hasSameDigits(String s) {
        String str=s;
        while(str.length()>2){
            StringBuilder ans=new StringBuilder();
            for(int i=0;i<str.length()-1;i++){
                int a=str.charAt(i)-'0';
                int b=str.charAt(i+1)-'0';
                ans.append((a+b)%10);
            }
            str=ans.toString();
        }
        if(str.charAt(0)==str.charAt(1)){
            return true;
        }
        return false;
    }
}