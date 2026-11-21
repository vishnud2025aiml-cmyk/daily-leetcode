class Solution {
    public String makeFancyString(String s) {
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<str.length()-2;){
            if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2)){
                str.deleteCharAt(i);   
            }
            else{
                i++;
            }
        }  
        return str.toString();
    }
}