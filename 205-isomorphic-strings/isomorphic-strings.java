class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character,Character> mp=new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            if(mp.get(ch1)!=null){
                if(mp.get(ch1)!=ch2){
                    return false;
                }
            }

            else{
                if(set.contains(ch2)){
                    return false;
                }
            }

            set.add(ch2);
            mp.put(ch1,ch2);

            
        }
        return true;

    }
}