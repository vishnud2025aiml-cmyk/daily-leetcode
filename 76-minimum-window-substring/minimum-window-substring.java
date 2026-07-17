class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> mp=new HashMap<>();
        Map<Character,Integer> check=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            check.put(ch,check.getOrDefault(ch,0)+1);
        }
        
        int min=Integer.MAX_VALUE;
        int left=0;
        String res="";
        int match=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(check.containsKey(ch)){
                mp.put(ch,mp.getOrDefault(ch,0)+1);
                if(mp.get(ch).equals(check.get(ch))){
                    match++;
                }
            }

            while(match==check.size()){
                if(right-left+1<min){
                    min=right-left+1;
                    res=s.substring(left,right+1);
                }
                char c=s.charAt(left);
                if(mp.containsKey(c)){
                    mp.put(c,mp.get(c)-1);
                    if(mp.get(c)<check.get(c)){
                        match--;
                    }
                    if(mp.get(c)==0){
                        mp.remove(c);
                    }
                }
                left++;
            }
            
        }
        return res;
    }
}