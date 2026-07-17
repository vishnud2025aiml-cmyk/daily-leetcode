class Solution {
    public boolean wordPattern(String pattern, String s) {

        Map<Character,String> mp=new HashMap<>();
        Set<String> visited=new HashSet<>();
        String[] word=s.split("\\s+");
        
        if(pattern.length()!=word.length){
            return false;
        }

        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(mp.containsKey(ch)){
                if(!mp.get(ch).equals(word[i])){
                    return false;
                }
            }
            else{
                if(visited.contains(word[i])){
                    return false;
                }
                mp.put(ch,word[i]);
                visited.add(word[i]);
            }
        }

        return true;
        

    }
}