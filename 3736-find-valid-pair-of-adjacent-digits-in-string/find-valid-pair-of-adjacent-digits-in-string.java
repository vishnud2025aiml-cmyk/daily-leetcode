class Solution {
    public String findValidPair(String s) {
        Map<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        for(int i=1;i<s.length();i++){
            char ch1=s.charAt(i-1);
            char ch2=s.charAt(i);
            if(ch1!=ch2){
                if(freq.get(ch1)==ch1-'0' && freq.get(ch2)==ch2-'0'){
                    return s.substring(i-1,i+1);
                }
            }
        }
        return "";



    }
}