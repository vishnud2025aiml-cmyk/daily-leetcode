class Solution {
    public String largestGoodInteger(String num) {
        
        String res="";
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length();i++){
            if(i<=num.length()-3){
                String sub=num.substring(i,i+3);
                int val=Integer.parseInt(sub);
                if(sub.charAt(0)==sub.charAt(1) && sub.charAt(1)==sub.charAt(2) && val>max){
                    res=sub;
                    max=val;
                }
            }
        }
        return res;
        

    }
}