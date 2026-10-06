class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        int start=0;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
            }
            if(ch==')'){
                count--;
            }
            if(count==0){
                res.append(s.substring(start+1,i));
                start=i+1;
            }
        }
        return res.toString();
    }
}