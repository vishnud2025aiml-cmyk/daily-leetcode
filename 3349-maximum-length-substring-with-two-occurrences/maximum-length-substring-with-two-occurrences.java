class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            while(mp.get(ch)>2){
                char c=s.charAt(left);
                mp.put(c,mp.getOrDefault(c,0)-1);
                if(mp.get(c)==0){
                    mp.remove(c);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
    
}