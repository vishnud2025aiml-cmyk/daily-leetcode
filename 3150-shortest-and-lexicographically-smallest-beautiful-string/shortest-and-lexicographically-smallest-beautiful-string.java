class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int count=0;
        int dis=Integer.MAX_VALUE;
        String res="";
        int left=0;

        for(int right=0;right<s.length();right++){
            if(s.charAt(right)=='1'){
                count++;
            }
            while(count>k){
                if(s.charAt(left)=='1'){
                    count--;
                }
                left++;
            }
            
            if(count==k){
                while(s.charAt(left)=='0'){
                    left++;
                }
                if(dis>right-left+1){
                    dis=right-left+1;    
                    res=s.substring(left,right+1);
                }

                else if(dis==right-left+1){
                    String ans=s.substring(left,right+1);
                    if(ans.compareTo(res)<0){
                        res=ans;
                    }
                }
                
            }
        
        }
        
        return res;

    }
}